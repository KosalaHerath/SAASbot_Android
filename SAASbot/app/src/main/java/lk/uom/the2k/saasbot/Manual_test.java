package lk.uom.the2k.saasbot;

import android.content.DialogInterface;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.AsyncTask;
import android.widget.Button;
import java.io.IOException;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import android.view.*;
import android.widget.TextView;

import android.os.AsyncTask;
import android.widget.Button;
import java.io.IOException;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Manual_test extends AppCompatActivity {

    ImageView site,pointer;
    TextView tx1,tx2;
    float x=0,y=0;

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    private boolean flag=false;
    private String x_st,y_st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_test);
        site =(ImageView) findViewById(R.id.imageView11);
        pointer =(ImageView) findViewById(R.id.pointer);
        tx1 =(TextView) findViewById(R.id.tx1);
        tx2 =(TextView) findViewById(R.id.tx2);
        pointer.setVisibility(View.INVISIBLE);
        site.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN ) {
                    x = event.getX();
                    y = event.getY();
                    int x_int =(int) x;
                    int y_int =(int) y;
                   // ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(x_int, y_int);
                    //pointer.setLayoutParams(layoutParams);

                    //ImageView s = (ImageView) findViewById(R.id.your_id);
                    pointer.setX(130+x);
                    pointer.setY(15+y);
                    pointer.setVisibility(View.VISIBLE);

                    DecimalFormat fomt = new DecimalFormat("000");


                    x_st = fomt.format(x);
                    y_st =  fomt.format(y);
                    tx1.setText(x_st);
                    tx2.setText(y_st);
                    str = "x: "+x_st+"\ny: "+y_st;
                    //Manual_test.myTask mt = new Manual_test.myTask();
                    //mt.execute();
                    flag=true;
                    return true;
                }
                return false;
            }
        });



    }



    public void onButtonClick(View v){
        if((v.getId() == R.id.btn_water) && flag){
            str = "MW"+x_st+y_st+"\n";
            Manual_test.myTask mt = new Manual_test.myTask();
            mt.execute();
        }
        if((v.getId() == R.id.btn_fert)&& flag){
            str = "MF"+x_st+y_st+"\n";
            Manual_test.myTask mt = new Manual_test.myTask();
            mt.execute();
        }
        if((v.getId() == R.id.btn_weed)&& flag){
            str = "MR"+x_st+y_st+"\n";
            Manual_test.myTask mt = new Manual_test.myTask();
            mt.execute();
        }
        if((v.getId() == R.id.btn_mtsen)&& flag){
            str = "MM"+x_st+y_st+"\n";
            Manual_test.myTask mt = new Manual_test.myTask();
            mt.execute();
        }


    }

    class myTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            OutputStreamWriter osw;

            PrintWriter out = null;
            try {
                String ip = Parameters.saasbot_ip;
                s = new Socket(ip, 8888);
                //socket = new Socket("ip address", 4014);
                //osw =new OutputStreamWriter(s.getOutputStream(), "UTF-8");
                //osw.write(str, 0, str.length());
                //osw.flush();

                out = new PrintWriter(s.getOutputStream(), true);
                out.println(str);
                s.close();

            } catch (IOException e)
            {
                e.printStackTrace();
            }

            return null;
        }
    }



}

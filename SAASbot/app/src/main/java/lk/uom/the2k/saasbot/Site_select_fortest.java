package lk.uom.the2k.saasbot;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
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

public class Site_select_fortest extends AppCompatActivity {

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    private int moving_delay=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_select_fortest);



    }


    public void onButtonClick(View v){
        if((v.getId() == R.id.site_01_button_test)) {
            str = "MC1"+"\n";
            myTask mt = new myTask();
            mt.execute();
            final ProgressDialog dialog_box = new ProgressDialog(Site_select_fortest.this);
            dialog_box.setTitle("SAASbot moving");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    Intent i = new Intent(Site_select_fortest.this, Manual_test.class);
                    startActivity(i);

                    //finish();
                }
            }, moving_delay); // delay;

        }
        if((v.getId() == R.id.site_02_button_test)) {
            str = "MC2"+"\n";
            myTask mt = new myTask();
            mt.execute();
            final ProgressDialog dialog_box = new ProgressDialog(Site_select_fortest.this);
            dialog_box.setTitle("SAASbot moving");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    Intent i = new Intent(Site_select_fortest.this, Manual_test.class);
                    startActivity(i);
                    //finish();
                }
            }, moving_delay); // delay;

        }
        if((v.getId() == R.id.site_03_button_test)) {
            str = "MC3"+"\n";
            myTask mt = new myTask();
            mt.execute();
            final ProgressDialog dialog_box = new ProgressDialog(Site_select_fortest.this);
            dialog_box.setTitle("SAASbot moving");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    Intent i = new Intent(Site_select_fortest.this, Manual_test.class);
                    startActivity(i);

                    //finish();
                }
            }, moving_delay); // delay;

        }
        if((v.getId() == R.id.site_04_button_test)) {
            str = "MC4"+"\n";
            myTask mt = new myTask();
            mt.execute();
            final ProgressDialog dialog_box = new ProgressDialog(Site_select_fortest.this);
            dialog_box.setTitle("SAASbot moving");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    Intent i = new Intent(Site_select_fortest.this, Manual_test.class);
                    startActivity(i);
                    //finish();
                }
            }, moving_delay); // delay;

        }
        if((v.getId() == R.id.btn_move)){
            Intent i = new Intent(Site_select_fortest.this, Manual_move.class);
            startActivity(i);
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

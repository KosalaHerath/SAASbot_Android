package lk.uom.the2k.saasbot;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;
import android.app.ProgressDialog;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;


import android.os.AsyncTask;
import android.widget.Button;
import java.io.IOException;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Plants extends AppCompatActivity implements View.OnClickListener{

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    private int plant_number;
    private int site_number;
    private int planting_delay=5000;
    private  AlertDialog alert;
    private String plant_no,site_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plants);

        Button send1 = (Button) findViewById(R.id.btn1);
        send1.setOnClickListener(this);
        Button send2 = (Button) findViewById(R.id.btn2);
        send2.setOnClickListener(this);
        Button send3 = (Button) findViewById(R.id.btn3);
        send3.setOnClickListener(this);
        Button send4 = (Button) findViewById(R.id.btn4);
        send4.setOnClickListener(this);
        Button send5 = (Button) findViewById(R.id.btn5);
        send5.setOnClickListener(this);

        //getting plant numbers....
        Intent intent = getIntent();
        plant_number = intent.getIntExtra("plant_number",0);
        site_number = intent.getIntExtra("site_number",0);
        DecimalFormat fomt1 = new DecimalFormat("00");
        DecimalFormat fomt2 = new DecimalFormat("0");
        plant_no = fomt1.format(plant_number);
        site_no = fomt2.format(site_number);
        Parameters.plflag=false;

        //recommandation
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Please add water or fertilizer after planting a new plant")
                .setCancelable(false)
                .setTitle("Recommendation")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });
        alert = builder.create();


    }

    @Override
    public void onClick(View view) {
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        switch (plant_number){
            case 1: Parameters.flag_01="not_avbl"; Parameters.last_plant=1; Parameters.date_01=currentDate; break;
            case 2: Parameters.flag_02="not_avbl"; Parameters.last_plant=2; Parameters.date_02=currentDate; break;
            case 3: Parameters.flag_03="not_avbl"; Parameters.last_plant=3; Parameters.date_03=currentDate; break;
            case 4: Parameters.flag_04="not_avbl"; Parameters.last_plant=4; Parameters.date_04=currentDate; break;
            case 5: Parameters.flag_05="not_avbl"; Parameters.last_plant=5; Parameters.date_05=currentDate; break;
            case 6: Parameters.flag_06="not_avbl"; Parameters.last_plant=6; Parameters.date_06=currentDate; break;
            case 7: Parameters.flag_07="not_avbl"; Parameters.last_plant=7; Parameters.date_07=currentDate; break;
            case 8: Parameters.flag_08="not_avbl"; Parameters.last_plant=8; Parameters.date_08=currentDate; break;
            case 9: Parameters.flag_09="not_avbl"; Parameters.last_plant=9; Parameters.date_09=currentDate; break;
            case 10: Parameters.flag_10="not_avbl"; Parameters.last_plant=10; Parameters.date_10=currentDate; break;
            case 11: Parameters.flag_11="not_avbl"; Parameters.last_plant=11; Parameters.date_11=currentDate; break;
            case 12: Parameters.flag_12="not_avbl"; Parameters.last_plant=12; Parameters.date_12=currentDate; break;

        }
        if((view.getId() == R.id.btn1)) {

            str = "AP"+site_no+plant_no+"1\n";
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=true;
            Parameters.last_plant_no=1;
            switch (plant_number){
                case 1: Parameters.plant_01=1; break;
                case 2: Parameters.plant_02=1; break;
                case 3: Parameters.plant_03=1; break;
                case 4: Parameters.plant_04=1; break;
                case 5: Parameters.plant_05=1; break;
                case 6: Parameters.plant_06=1; break;
                case 7: Parameters.plant_07=1; break;
                case 8: Parameters.plant_08=1; break;
                case 9: Parameters.plant_09=1; break;
                case 10: Parameters.plant_10=1; break;
                case 11: Parameters.plant_11=1; break;
                case 12: Parameters.plant_12=1; break;

            }
            final ProgressDialog dialog_box = new ProgressDialog(Plants.this);
            dialog_box.setTitle("Planting");
            dialog_box.setMessage("New Carrot plant\nplease wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    alert.show();
                    //finish();
                }
            }, planting_delay); // delay;

        }
        else if(view.getId() == R.id.btn2){
            str = "AP"+site_no+plant_no+"2\n";
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=true;
            Parameters.last_plant_no=2;
            switch (plant_number){
                case 1: Parameters.plant_01=2; break;
                case 2: Parameters.plant_02=2; break;
                case 3: Parameters.plant_03=2; break;
                case 4: Parameters.plant_04=2; break;
                case 5: Parameters.plant_05=2; break;
                case 6: Parameters.plant_06=2; break;
                case 7: Parameters.plant_07=2; break;
                case 8: Parameters.plant_08=2; break;
                case 9: Parameters.plant_09=2; break;
                case 10: Parameters.plant_10=2; break;
                case 11: Parameters.plant_11=2; break;
                case 12: Parameters.plant_12=2; break;

            }
            final ProgressDialog dialog_box = new ProgressDialog(Plants.this);
            dialog_box.setTitle("Planting");
            dialog_box.setMessage("New Brinjol plant\nplease wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    alert.show();
                    //finish();

                }
            }, planting_delay); // delay
        }
        else if(view.getId() == R.id.btn3){
            str = "AP"+site_no+plant_no+"3\n";
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=true;
            Parameters.last_plant_no=3;
            switch (plant_number){
                case 1: Parameters.plant_01=3; break;
                case 2: Parameters.plant_02=3; break;
                case 3: Parameters.plant_03=3; break;
                case 4: Parameters.plant_04=3; break;
                case 5: Parameters.plant_05=3; break;
                case 6: Parameters.plant_06=3; break;
                case 7: Parameters.plant_07=3; break;
                case 8: Parameters.plant_08=3; break;
                case 9: Parameters.plant_09=3; break;
                case 10: Parameters.plant_10=3; break;
                case 11: Parameters.plant_11=3; break;
                case 12: Parameters.plant_12=3; break;

            }
            final ProgressDialog dialog_box = new ProgressDialog(Plants.this);
            dialog_box.setTitle("Planting");
            dialog_box.setMessage("New Tomato plant\nplease wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    alert.show();
                    //finish();

                }
            }, planting_delay); // delay
        }
        else if(view.getId() == R.id.btn4){
            str = "AP"+site_no+plant_no+"4\n";
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=true;
            Parameters.last_plant_no=4;
            switch (plant_number){
                case 1: Parameters.plant_01=4; break;
                case 2: Parameters.plant_02=4; break;
                case 3: Parameters.plant_03=4; break;
                case 4: Parameters.plant_04=4; break;
                case 5: Parameters.plant_05=4; break;
                case 6: Parameters.plant_06=4; break;
                case 7: Parameters.plant_07=4; break;
                case 8: Parameters.plant_08=4; break;
                case 9: Parameters.plant_09=4; break;
                case 10: Parameters.plant_10=4; break;
                case 11: Parameters.plant_11=4; break;
                case 12: Parameters.plant_12=4; break;

            }
            final ProgressDialog dialog_box = new ProgressDialog(Plants.this);
            dialog_box.setTitle("Planting");
            dialog_box.setMessage("New Bell Peper plant\nplease wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    alert.show();
                    //finish();

                }
            }, planting_delay); // delay
        }
        else if(view.getId() == R.id.btn5){
            str ="AP"+site_no+plant_no+"5\n";
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=true;
            Parameters.last_plant_no=5;
            switch (plant_number){
                case 1: Parameters.plant_01=5; break;
                case 2: Parameters.plant_02=5; break;
                case 3: Parameters.plant_03=5; break;
                case 4: Parameters.plant_04=5; break;
                case 5: Parameters.plant_05=5; break;
                case 6: Parameters.plant_06=5; break;
                case 7: Parameters.plant_07=5; break;
                case 8: Parameters.plant_08=5; break;
                case 9: Parameters.plant_09=5; break;
                case 10: Parameters.plant_10=5; break;
                case 11: Parameters.plant_11=5; break;
                case 12: Parameters.plant_12=5; break;

            }
            final ProgressDialog dialog_box = new ProgressDialog(Plants.this);
            dialog_box.setTitle("Planting");
            dialog_box.setMessage("New Green Chilli plant\nplease wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    alert.show();
                    //finish();

                }
            }, planting_delay); // delay
        }
        switch (plant_number){
            case 1: Parameters.plflag_01=Parameters.plflag; break;
            case 2: Parameters.plflag_02=Parameters.plflag; break;
            case 3: Parameters.plflag_03=Parameters.plflag; break;
            case 4: Parameters.plflag_04=Parameters.plflag; break;
            case 5: Parameters.plflag_05=Parameters.plflag; break;
            case 6: Parameters.plflag_06=Parameters.plflag; break;
            case 7: Parameters.plflag_07=Parameters.plflag; break;
            case 8: Parameters.plflag_08=Parameters.plflag; break;
            case 9: Parameters.plflag_09=Parameters.plflag; break;
            case 10: Parameters.plflag_10=Parameters.plflag; break;
            case 11: Parameters.plflag_11=Parameters.plflag; break;
            case 12: Parameters.plflag_12=Parameters.plflag; break;

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

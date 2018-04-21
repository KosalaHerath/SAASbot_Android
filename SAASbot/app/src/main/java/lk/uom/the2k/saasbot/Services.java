package lk.uom.the2k.saasbot;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import android.app.Activity;
import android.app.ProgressDialog;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Calendar;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;


import android.os.AsyncTask;
import android.widget.Button;
import java.io.IOException;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Services extends AppCompatActivity implements View.OnClickListener{

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    private int plant_number;
    private int site_number;
    private int watering_delay=5000;
    private int fertilizing_delay=5000;
    private String date="";
    Date d1 = null;
    Date d2 = null;
    private String plant_no,site_no;
    private int water_am,fert_am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services);
        //Button send1 = (Button) findViewById(R.id.btn1);
        //send1.setOnClickListener(this);
       // Button send2 = (Button) findViewById(R.id.btn2);
        //send2.setOnClickListener(this);

        Intent intent = getIntent();
        plant_number = intent.getIntExtra("plant_number",0);
        site_number = intent.getIntExtra("site_number",0);

        DecimalFormat fomt1 = new DecimalFormat("00");
        DecimalFormat fomt2 = new DecimalFormat("0");
        plant_no = fomt1.format(plant_number);
        site_no = fomt2.format(site_number);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        //TextView txdetails = (TextView)findViewById(R.id.txdetails);

        TextView name =(TextView) findViewById(R.id.tx_name);
        TextView info = (TextView) findViewById(R.id.txdetails);

        ImageView pic = (ImageView) findViewById(R.id.im_pl);

        switch (plant_number){
            case 1: {  switch(Parameters.plant_01){
                            case 1: water_am=Parameters.Cprofile_water; fert_am=Parameters.Cprofile_fertilizer; name.setText("Carrot");pic.setImageResource(R.drawable.carrot);break;
                            case 2: water_am=Parameters.Bprofile_water; fert_am=Parameters.Bprofile_fertilizer; name.setText("Brinjal");pic.setImageResource(R.drawable.eggplant);break;
                            case 3: water_am=Parameters.Tprofile_water; fert_am=Parameters.Tprofile_fertilizer; name.setText("Tomato");pic.setImageResource(R.drawable.tomato);break;
                            case 4: water_am=Parameters.Pprofile_water; fert_am=Parameters.Pprofile_fertilizer; name.setText("Bell Pepper");pic.setImageResource(R.drawable.bellpepper);break;
                            case 5: water_am=Parameters.Gprofile_water; fert_am=Parameters.Gprofile_fertilizer; name.setText("Green Chilli");pic.setImageResource(R.drawable.chilli);break;
                        }
                        break;
                    }
            case 2: {
                switch (Parameters.plant_02) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 3: {
                switch (Parameters.plant_03) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 4: {
                switch (Parameters.plant_04) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 5: {
                switch (Parameters.plant_05) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 6: {
                switch (Parameters.plant_06) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 7: {
                switch (Parameters.plant_07) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 8: {
                switch (Parameters.plant_08) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 9: {
                switch (Parameters.plant_09) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 10: {
                switch (Parameters.plant_10) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 11: {
                switch (Parameters.plant_11) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            case 12: {
                switch (Parameters.plant_12) {
                    case 1:
                        water_am = Parameters.Cprofile_water;
                        fert_am = Parameters.Cprofile_fertilizer;
                        name.setText("Carrot");
                        pic.setImageResource(R.drawable.carrot);
                        break;
                    case 2:
                        water_am = Parameters.Bprofile_water;
                        fert_am = Parameters.Bprofile_fertilizer;
                        name.setText("Brinjal");
                        pic.setImageResource(R.drawable.eggplant);
                        break;
                    case 3:
                        water_am = Parameters.Tprofile_water;
                        fert_am = Parameters.Tprofile_fertilizer;
                        name.setText("Tomato");
                        pic.setImageResource(R.drawable.tomato);
                        break;
                    case 4:
                        water_am = Parameters.Pprofile_water;
                        fert_am = Parameters.Pprofile_fertilizer;
                        name.setText("Bell Pepper");
                        pic.setImageResource(R.drawable.bellpepper);
                        break;
                    case 5:
                        water_am = Parameters.Gprofile_water;
                        fert_am = Parameters.Gprofile_fertilizer;
                        name.setText("Green Chilli");
                        pic.setImageResource(R.drawable.chilli);
                        break;
                }
                break;
            }
            }
/*
        switch(Parameters.last_plant_no){
            case 1: water_am=Parameters.Cprofile_water; fert_am=Parameters.Cprofile_fertilizer; name.setText("Carrot");pic.setImageResource(R.drawable.carrot);break;
            case 2: water_am=Parameters.Bprofile_water; fert_am=Parameters.Bprofile_fertilizer; name.setText("Brinjal");pic.setImageResource(R.drawable.eggplant);break;
            case 3: water_am=Parameters.Tprofile_water; fert_am=Parameters.Tprofile_fertilizer; name.setText("Tomato");pic.setImageResource(R.drawable.tomato);break;
            case 4: water_am=Parameters.Pprofile_water; fert_am=Parameters.Pprofile_fertilizer; name.setText("Bell Pepper");pic.setImageResource(R.drawable.bellpepper);break;
            case 5: water_am=Parameters.Gprofile_water; fert_am=Parameters.Gprofile_fertilizer; name.setText("Green Chilli");pic.setImageResource(R.drawable.chilli);break;
        }*/

        info.setText("Site No: "+site_no+"\tPlant No: "+plant_no);




        //Date d1 = null;
        //Date d2 = null;
        SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        try {
            Date d1 = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            Date d2 = format.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //long diff = (d2.getTime() - d1.getTime())/ (24 * 60 * 60 * 1000);
        //String diff_st = Long.toString(diff);

        //txdetails.setText("Details:\n\tPlanted Date: "+date+"\n\tPlant Age:       "+diff_st+" days");




    }

    @Override
    public void onClick(View view) {

        if((view.getId() == R.id.btn1_water)) {
            String water_am_str= Integer.toString(water_am);
            str = "AW"+site_no+plant_no+water_am_str+"\n";   ///amount eka plant eka anuwaa
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=false;
            //process dialogbox
            final ProgressDialog dialog_box = new ProgressDialog(Services.this);
            dialog_box.setTitle("Wateing");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    finish();
                }
            }, watering_delay); // delay
            //finish();

        }
        else if(view.getId() == R.id.btn2_fert){
            String fert_am_str= Integer.toString(fert_am);
            str = "AW"+site_no+plant_no+fert_am_str+"\n";   ///amount eka plant eka anuwaa
            myTask mt = new myTask();
            mt.execute();
            Parameters.plflag=false;
            final ProgressDialog dialog_box = new ProgressDialog(Services.this);
            dialog_box.setTitle("Fertilizing");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    finish();
                }
            }, fertilizing_delay); // delay

        }
        else if(view.getId() == R.id.remove_btn){
            switch (plant_number){
                case 1: Parameters.flag_01="avbl";Parameters.plflag_01=false; Parameters.date_01="0"; break;
                case 2: Parameters.flag_02="avbl";Parameters.plflag_02=false; Parameters.date_02="0"; break;
                case 3: Parameters.flag_03="avbl";Parameters.plflag_03=false; Parameters.date_03="0"; break;
                case 4: Parameters.flag_04="avbl";Parameters.plflag_04=false; Parameters.date_04="0"; break;
                case 5: Parameters.flag_05="avbl";Parameters.plflag_05=false; Parameters.date_05="0"; break;
                case 6: Parameters.flag_06="avbl";Parameters.plflag_06=false; Parameters.date_06="0"; break;
                case 7: Parameters.flag_07="avbl";Parameters.plflag_07=false; Parameters.date_07="0"; break;
                case 8: Parameters.flag_08="avbl";Parameters.plflag_08=false; Parameters.date_08="0"; break;
                case 9: Parameters.flag_09="avbl";Parameters.plflag_09=false; Parameters.date_09="0"; break;
                case 10: Parameters.flag_10="avbl";Parameters.plflag_10=false; Parameters.date_10="0"; break;
                case 11: Parameters.flag_11="avbl";Parameters.plflag_11=false; Parameters.date_11="0"; break;
                case 12: Parameters.flag_12="avbl";Parameters.plflag_12=false; Parameters.date_12="0"; break;

            }
            finish();
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Parameters.plflag=false;
    }
}

package lk.uom.the2k.saasbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.os.Handler;
import android.app.Activity;
import android.app.ProgressDialog;
import java.text.DateFormat;
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
import android.widget.SeekBar;

public class Profile_update extends AppCompatActivity {

    private int plant_name;
    private int water_amount=0;
    private int fert_amount=0;

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    private int update_delay=5000;
    private EditText etDays;
    private SeekBar sb_water;
    private SeekBar sb_fert;
    private TextView plant;
    private String plant_nm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_update);

        //getting plant name....
        Intent intent = getIntent();
        plant_name = intent.getIntExtra("profile_name",0);

        TextView plant =(TextView) findViewById(R.id.plant_name);
        TextView info = (TextView) findViewById(R.id.tx_info);

        ImageView pic = (ImageView) findViewById(R.id.im_pic);

        //edittext
        etDays = (EditText)findViewById(R.id.edit_days);
        //etDays.setHint(Parameters.Cprofile_days); //>>>>>>>>>>>>>>>>>>>>>

        SeekBar sb_water = (SeekBar) findViewById(R.id.seekBar_water);
        //sb_water.setProgress(Parameters.Cprofile_water); //>>>>>>>>>>>>>
        SeekBar sb_fert = (SeekBar) findViewById(R.id.seekBar_fert);
        //sb_fert.setProgress(Parameters.Cprofile_fertilizer); //>>>>>>>>>>>>>>>>>

        switch (plant_name){
            case 1: {
                etDays.setHint(Parameters.Cprofile_days);
                sb_water.setProgress(Parameters.Cprofile_water);
                sb_fert.setProgress(Parameters.Cprofile_fertilizer);
                plant_nm = "Carrot";
                info.setText(Parameters.C_info);
                pic.setImageResource(R.drawable.carrot);
                break;
            }
            case 2: {
                etDays.setHint(Parameters.Bprofile_days);
                sb_water.setProgress(Parameters.Bprofile_water);
                sb_fert.setProgress(Parameters.Bprofile_fertilizer);
                plant_nm = "Brinjol";
                info.setText(Parameters.B_info);
                pic.setImageResource(R.drawable.eggplant);
                break;

            }
            case 3: {
                etDays.setHint(Parameters.Tprofile_days);
                sb_water.setProgress(Parameters.Tprofile_water);
                sb_fert.setProgress(Parameters.Tprofile_fertilizer);
                plant_nm = "Tomoto";
                info.setText(Parameters.T_info);
                pic.setImageResource(R.drawable.tomato);
                break;
            }
            case 4: {
                etDays.setHint(Parameters.Pprofile_days);
                sb_water.setProgress(Parameters.Pprofile_water);
                sb_fert.setProgress(Parameters.Pprofile_fertilizer);
                plant_nm = "Bellpeper";
                info.setText(Parameters.P_info);
                pic.setImageResource(R.drawable.bellpepper);
                break;

            }
            case 5: {
                etDays.setHint(Parameters.Gprofile_days);
                sb_water.setProgress(Parameters.Gprofile_water);
                sb_fert.setProgress(Parameters.Gprofile_fertilizer);
                plant_nm = "Green Chilli";
                info.setText(Parameters.G_info);
                pic.setImageResource(R.drawable.chilli);
                break;
            }
        }
        plant.setText(plant_nm);

        sb_water.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                water_amount = progress;
                //Parameters.profile_water =progress;

              /*  switch (plant_name) {
                    case 1: Parameters.Cprofile_water =progress;break;
                    case 2: Parameters.Bprofile_water =progress;break;
                    case 3: Parameters.Tprofile_water =progress;break;
                    case 4: Parameters.Pprofile_water =progress;break;
                    case 5: Parameters.Gprofile_water =progress;break;
                }*/
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        sb_fert.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                fert_amount = progress;
                //Parameters.profile_fertilizer =progress;

              /*  switch (plant_name) {
                    case 1: Parameters.Cprofile_fertilizer =progress;break;
                    case 2: Parameters.Bprofile_fertilizer =progress;break;
                    case 3: Parameters.Tprofile_fertilizer =progress;break;
                    case 4: Parameters.Pprofile_fertilizer =progress;break;
                    case 5: Parameters.Gprofile_fertilizer =progress;break;
                }*/
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void onButtonClick(View view) {

        if ((view.getId() == R.id.btn_update)) {
            String input_days = etDays.getText().toString();
            switch (plant_name) {
                case 1: Parameters.Cprofile_days =input_days;Parameters.Cprofile_fertilizer =fert_amount;Parameters.Cprofile_water =water_amount;break;
                case 2: Parameters.Bprofile_days =input_days;Parameters.Bprofile_fertilizer =fert_amount;Parameters.Bprofile_water =water_amount;break;
                case 3: Parameters.Tprofile_days =input_days;Parameters.Tprofile_fertilizer =fert_amount;Parameters.Tprofile_water =water_amount;break;
                case 4: Parameters.Pprofile_days =input_days;Parameters.Pprofile_fertilizer =fert_amount;Parameters.Pprofile_water =water_amount;break;
                case 5: Parameters.Gprofile_days =input_days;Parameters.Gprofile_fertilizer =fert_amount;Parameters.Gprofile_water =water_amount;break;
            }

            str = "*update*\n>>name - " + plant_name + "\n>>water - " + Integer.toString(water_amount) + "\n>>Fert - " + Integer.toString(fert_amount)+ "\n>>Days - " + input_days;
            //Profile_update.myTask mt = new Profile_update.myTask();
            //mt.execute();

            //process dialogbox
            final ProgressDialog dialog_box = new ProgressDialog(Profile_update.this);
            dialog_box.setTitle("Updating");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            dialog_box.setCancelable(false);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    finish();
                }
            }, update_delay); // delay


        }
    }

        class myTask extends AsyncTask<Void, Void, Void> {

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

                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }
        }

}

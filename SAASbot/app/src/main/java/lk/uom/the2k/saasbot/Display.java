package lk.uom.the2k.saasbot;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import android.widget.TextView;

/**
 * Created by Kosala on 9/1/2017.
 */

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.display);




    }


    public void onButtonClick(View v){
        if((v.getId() == R.id.btn_pln)){
            Intent i = new Intent(Display.this, Site_select.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_live)){
            Intent i = new Intent(Display.this, Site_select_forcamera.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_test)){
            Intent i = new Intent(Display.this, Site_select_fortest.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_profile)){
            Intent i = new Intent(Display.this, Profile_select.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_data)){
            Intent i = new Intent(Display.this, Data.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_weed)){
            Intent i = new Intent(Display.this, Site_select_weed.class);
            startActivity(i);
        }
        if((v.getId() == R.id.btn_close)){
            android.os.Process.killProcess(android.os.Process.myPid());
        }



        //String type = "login";
        //BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //backgroundWorker.execute(type, input_Name, input_Password);

    }
}
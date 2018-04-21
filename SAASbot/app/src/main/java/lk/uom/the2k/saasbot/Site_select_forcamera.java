package lk.uom.the2k.saasbot;

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

public class Site_select_forcamera extends AppCompatActivity {

    private static Socket s;
    private static ServerSocket ss;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_select_forcamera);

    }


    public void onButtonClick(View v){
        if((v.getId() == R.id.site_01_button_live)) {
            Intent i = new Intent(Site_select_forcamera.this, plant_select_forcamera.class);
            i.putExtra("site_number","1");
            startActivity(i);
        }
        if((v.getId() == R.id.site_02_button_live)) {
            Intent i = new Intent(Site_select_forcamera.this, plant_select_forcamera.class);
            i.putExtra("site_number","2");
            startActivity(i);
        }
        if((v.getId() == R.id.site_03_button_live)) {
            Intent i = new Intent(Site_select_forcamera.this, plant_select_forcamera.class);
            i.putExtra("site_number","3");
            startActivity(i);
        }
        if((v.getId() == R.id.site_04_button_live)) {
            Intent i = new Intent(Site_select_forcamera.this, plant_select_forcamera.class);
            i.putExtra("site_number","4");
            startActivity(i);
        }



    }

    class myTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            OutputStreamWriter osw;

            PrintWriter out = null;
            try {
                String ip = "10.10.25.53";
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

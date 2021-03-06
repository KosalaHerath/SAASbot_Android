package lk.uom.the2k.saasbot;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class plant_select_forcamera extends AppCompatActivity {

    private static Socket s;
    private static ServerSocket ss;
    private String str;
    //private int plant_number;
    private String site_number;
    private int cam_delay=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_select_forcamera);

        Intent intent = getIntent();
        site_number = intent.getStringExtra("site_number");
    }

    public void onButtonClick(View v) {
        if ((v.getId() == R.id.plant_01_cam)) {
            str = "AL"+site_number+"01\n";
            plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
            mt.execute();
            final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
            dialog_box.setTitle("Connecting");
            dialog_box.setMessage("please wait..");
            dialog_box.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    dialog_box.dismiss();
                    //finish();
                }
            }, cam_delay); // delay;
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
            startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_02_cam)) {
                str = "AL"+site_number+"02\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_03_cam)) {
                str = "AL"+site_number+"03\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_04_cam)) {
                str =  "AL"+site_number+"04\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);
        }
        if ((v.getId() == R.id.plant_05_cam)) {
                str =  "AL"+site_number+"05\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_06_cam)) {
                str =  "AL"+site_number+"06\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_07_cam)) {
                str =  "AL"+site_number+"07\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_08_cam)) {
                str =  "AL"+site_number+"08\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_09_cam)) {
                str =  "AL"+site_number+"09\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_10_cam)) {
                str =  "AL"+site_number+"10\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_11_cam)) {
                str =  "AL"+site_number+"11\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        if ((v.getId() == R.id.plant_12_cam)) {
                str =  "AL"+site_number+"12\n";
                plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
                mt.execute();
                final ProgressDialog dialog_box = new ProgressDialog(plant_select_forcamera.this);
                dialog_box.setTitle("Connecting");
                dialog_box.setMessage("please wait..");
                dialog_box.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        dialog_box.dismiss();
                        //finish();
                    }
                }, cam_delay); // delay;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.0.100:5000"));
                startActivity(browserIntent);

        }
        /*
        if ((v.getId() == R.id.btn_exit)) {
            str = "ALS\n";
            plant_select_forcamera.myTask mt = new plant_select_forcamera.myTask();
            mt.execute();
        }*/
    }

    class myTask extends AsyncTask<Void,Void,Void> {

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


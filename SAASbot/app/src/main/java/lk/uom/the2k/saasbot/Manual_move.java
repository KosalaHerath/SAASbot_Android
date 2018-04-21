package lk.uom.the2k.saasbot;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Manual_move extends AppCompatActivity {

    private static Socket s;
    private static ServerSocket ss;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_move);

        Button button1 = (Button) findViewById(R.id.btn_up);
        Button button2 = (Button) findViewById(R.id.btn_down);
        Button button3 = (Button) findViewById(R.id.btn_right);
        Button button4 = (Button) findViewById(R.id.btn_left);
        Button button5 = (Button) findViewById(R.id.btn_clock);
        Button button6 = (Button) findViewById(R.id.btn_anticlock);




        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAU"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAD"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAR"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAL"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
        button5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAC"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
        button6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    // Pressed
                    str = "MAA"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    // Released
                    str = "MAS"+"\n";
                    myTask mt = new myTask();
                    mt.execute();
                }
                return true;
            }
        });
    }
    public void onButtonClick(View v) {
        if ((v.getId() == R.id.btn_al)) {
            str = "MI"+"\n";
            myTask mt = new myTask();
            mt.execute();
        }
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

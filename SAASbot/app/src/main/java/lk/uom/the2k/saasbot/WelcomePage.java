package lk.uom.the2k.saasbot;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

/**
 * Created by Kosala on 9/2/2017.
 */

public class WelcomePage extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomepage);

        new Handler().postDelayed(new Runnable() {
            public void run(){
                Intent homeIndent = new Intent(WelcomePage.this, Display.class);
                startActivity(homeIndent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
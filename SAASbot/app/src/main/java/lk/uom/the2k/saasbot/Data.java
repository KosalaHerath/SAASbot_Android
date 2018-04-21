package lk.uom.the2k.saasbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
    }

    public void onButtonClick(View v){
        if((v.getId() == R.id.btn_mst)){
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/402211"));
            startActivity(browserIntent);
        }

        if((v.getId() == R.id.btn_tem)){
            //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://10.10.23.107:5000"));
            //startActivity(browserIntent);
        }



    }
}

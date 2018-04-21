package lk.uom.the2k.saasbot;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.color.white;

public class Site_select extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.site_select);


    }


    public void onButtonClick(View v) {

        if ((v.getId() == R.id.site_01_button)) {
            Intent i = new Intent(Site_select.this, The_Farm.class);
            i.putExtra("site_number",1);
            startActivity(i);
        }
        if ((v.getId() == R.id.site_02_button)) {
            Intent i = new Intent(Site_select.this, The_Farm.class);
            i.putExtra("site_number",2);
            startActivity(i);
        }
        if ((v.getId() == R.id.site_03_button)) {
            Intent i = new Intent(Site_select.this, The_Farm.class);
            i.putExtra("site_number",3);
            startActivity(i);
        }
        if ((v.getId() == R.id.site_04_button)) {
            Intent i = new Intent(Site_select.this, The_Farm.class);
            i.putExtra("site_number",4);
            startActivity(i);
        }
    }


}

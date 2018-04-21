package lk.uom.the2k.saasbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_select);
    }

    public void onButtonClick(View v) {
        if ((v.getId() == R.id.btn_carrot)) {
            Intent i = new Intent(Profile_select.this, Profile_update.class);
            i.putExtra("profile_name",1);
            startActivity(i);
        }
        if ((v.getId() == R.id.btn_brinjol)) {
            Intent i = new Intent(Profile_select.this, Profile_update.class);
            i.putExtra("profile_name",2);
            startActivity(i);
        }
        if ((v.getId() == R.id.btn_tomoto)) {
            Intent i = new Intent(Profile_select.this, Profile_update.class);
            i.putExtra("profile_name",3);
            startActivity(i);
        }
        if ((v.getId() == R.id.btn_bellpeper)) {
            Intent i = new Intent(Profile_select.this, Profile_update.class);
            i.putExtra("profile_name",4);
            startActivity(i);
        }
        if ((v.getId() == R.id.btn_greenchilli)) {
            Intent i = new Intent(Profile_select.this, Profile_update.class);
            i.putExtra("profile_name",5);
            startActivity(i);
        }

    }
}

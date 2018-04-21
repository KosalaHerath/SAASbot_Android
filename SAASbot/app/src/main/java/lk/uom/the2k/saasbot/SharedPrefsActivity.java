package lk.uom.the2k.saasbot;

/**
 * Created by Kosala on 1/12/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
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
import android.content.SharedPreferences;

public class SharedPrefsActivity extends Activity {

    public static final String PREFS_NAME = "MyApp_Settings";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("key", "some value");
        editor.commit();

        // Reading from SharedPreferences
        String value = settings.getString("key", "");
        //Log.d(TAG, value);
    }
}

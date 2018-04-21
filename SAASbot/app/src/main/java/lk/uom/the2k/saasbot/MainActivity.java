package lk.uom.the2k.saasbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Output;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //close app


        setContentView(R.layout.activity_main);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            //finish();
        }


        Name = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Output = (TextView)findViewById(R.id.txOutput);




    }

    public void onButtonClick(View v){
        String input_Name = Name.getText().toString();
        String input_Password = Password.getText().toString();
        if((v.getId() == R.id.bDisplay) && ( input_Name.equals("entc")) && ( input_Password.equals("123"))){
            Intent i = new Intent(MainActivity.this, WelcomePage.class);
            startActivity(i);
            Password.setText("");
            Name.setText("");
        }
        else {
          Output.setText("The username or password you entered did not match our records.Please double-check and try again" );
          Password.setHint("Password");
          Password.setText("");
          //finish();
        }

        //String type = "login";
        //BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //backgroundWorker.execute(type, input_Name, input_Password);

    }
}

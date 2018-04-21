package lk.uom.the2k.saasbot;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import static lk.uom.the2k.saasbot.R.id.plant_01_button;

public class The_Farm extends AppCompatActivity {
    private com.cuboid.cuboidcirclebutton.CuboidButton button01;
    private com.cuboid.cuboidcirclebutton.CuboidButton button02;
    private com.cuboid.cuboidcirclebutton.CuboidButton button03;
    private com.cuboid.cuboidcirclebutton.CuboidButton button04;
    private com.cuboid.cuboidcirclebutton.CuboidButton button05;
    private com.cuboid.cuboidcirclebutton.CuboidButton button06;
    private com.cuboid.cuboidcirclebutton.CuboidButton button07;
    private com.cuboid.cuboidcirclebutton.CuboidButton button08;
    private com.cuboid.cuboidcirclebutton.CuboidButton button09;
    private com.cuboid.cuboidcirclebutton.CuboidButton button10;
    private com.cuboid.cuboidcirclebutton.CuboidButton button11;
    private com.cuboid.cuboidcirclebutton.CuboidButton button12;
    //private Button resetbtn;
    //private String flag01="avbl",flag02="avbl",flag03="avbl",flag04="avbl",flag05="avbl",flag06="avbl",flag07="avbl",flag08="avbl",flag09="avbl",flag10="avbl",flag11="avbl",flag12="avbl";
    private int site_number;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the__farm);

        button01 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_01_button);
        button02 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_02_button);
        button03 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_03_button);
        button04 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_04_button);
        button05 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_05_button);
        button06 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_06_button);
        button07 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_07_button);
        button08 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_08_button);
        button09 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_09_button);
        button10 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_10_button);
        button11 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_11_button);
        button12 = (com.cuboid.cuboidcirclebutton.CuboidButton) findViewById(R.id.plant_12_button);
        //resetbtn = (Button) findViewById(R.id.reset_button);

        //Intent intent = getIntent();
        //site_number = intent.getIntExtra("site_number",0);
        Intent intent = getIntent();
        site_number = intent.getIntExtra("site_number",0);



    }

    @Override
    protected void onStart() {
        super.onStart();

        if(Parameters.plflag_01) {
            button01.setCircle_border_color(Color.GREEN);
            button01.setTextColor(Color.GREEN);
            //Parameters.plant_01=Parameters.last_plant;
        }
        else{
            button01.setCircle_border_color(Color.WHITE);
            button01.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_02) {
            button02.setCircle_border_color(Color.GREEN);
            button02.setTextColor(Color.GREEN);
            //Parameters.plant_02=Parameters.last_plant;
        }
        else{
            button02.setCircle_border_color(Color.WHITE);
            button02.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_03) {
            button03.setCircle_border_color(Color.GREEN);
            button03.setTextColor(Color.GREEN);
            //Parameters.plant_03=Parameters.last_plant;
        }
        else{
            button03.setCircle_border_color(Color.WHITE);
            button03.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_04) {
            button04.setCircle_border_color(Color.GREEN);
            button04.setTextColor(Color.GREEN);
            //Parameters.plant_04=Parameters.last_plant;
        }
        else{
            button04.setCircle_border_color(Color.WHITE);
            button04.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_05) {
            button05.setCircle_border_color(Color.GREEN);
            button05.setTextColor(Color.GREEN);
            //Parameters.plant_05=Parameters.last_plant;
        }
        else{
            button05.setCircle_border_color(Color.WHITE);
            button05.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_06) {
            button06.setCircle_border_color(Color.GREEN);
            button06.setTextColor(Color.GREEN);
            //Parameters.plant_06=Parameters.last_plant;
        }
        else{
            button06.setCircle_border_color(Color.WHITE);
            button06.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_07) {
            button07.setCircle_border_color(Color.GREEN);
            button07.setTextColor(Color.GREEN);
            //Parameters.plant_07=Parameters.last_plant;
        }
        else{
            button07.setCircle_border_color(Color.WHITE);
            button07.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_08) {
            button08.setCircle_border_color(Color.GREEN);
            button08.setTextColor(Color.GREEN);
            //Parameters.plant_08=Parameters.last_plant;
        }
        else{
            button08.setCircle_border_color(Color.WHITE);
            button08.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_09) {
            button09.setCircle_border_color(Color.GREEN);
            button09.setTextColor(Color.GREEN);
            //Parameters.plant_09=Parameters.last_plant;
        }
        else{
            button09.setCircle_border_color(Color.WHITE);
            button09.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_10) {
            button10.setCircle_border_color(Color.GREEN);
            button10.setTextColor(Color.GREEN);
            //Parameters.plant_10=Parameters.last_plant;
        }
        else{
            button10.setCircle_border_color(Color.WHITE);
            button10.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_11) {
            button11.setCircle_border_color(Color.GREEN);
            button11.setTextColor(Color.GREEN);
            //Parameters.plant_11=Parameters.last_plant;
        }
        else{
            button11.setCircle_border_color(Color.WHITE);
            button11.setTextColor(Color.WHITE);
        }
        if(Parameters.plflag_12) {
            button12.setCircle_border_color(Color.GREEN);
            button12.setTextColor(Color.GREEN);
            //Parameters.plant_12=Parameters.last_plant;
        }
        else{
            button12.setCircle_border_color(Color.WHITE);
            button12.setTextColor(Color.WHITE);
        }
        //auto_click for auto services...
        if(Parameters.plflag){
            switch (Parameters.last_plant){
                case 1: button01.performClick(); break;
                case 2: button02.performClick(); break;
                case 3: button03.performClick(); break;
                case 4: button04.performClick(); break;
                case 5: button05.performClick(); break;
                case 6: button06.performClick(); break;
                case 7: button07.performClick(); break;
                case 8: button08.performClick(); break;
                case 9: button09.performClick(); break;
                case 10: button10.performClick(); break;
                case 11: button11.performClick(); break;
                case 12: button12.performClick(); break;

            }
        }
    }

    public void onButtonClick(View v) {
        if ((v.getId() == R.id.plant_01_button)) {
            //Parameters.last_click=1;
            if(Parameters.plflag_01) {
                button01.setCircle_border_color(Color.GREEN);
                button01.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_01=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",1);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_01=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",1);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }

        }
        if ((v.getId() == R.id.plant_02_button)) {
            //Parameters.last_click=2;
            if(Parameters.plflag_02) {
                button02.setCircle_border_color(Color.GREEN);
                button02.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_02=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",2);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_02=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",2);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_03_button)) {
            //Parameters.last_click=3;
            if(Parameters.plflag_03) {
                button03.setCircle_border_color(Color.GREEN);
                button03.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_03=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",3);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_03=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",3);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_04_button)) {
            //Parameters.last_click=4;
            if(Parameters.plflag_04) {
                button04.setCircle_border_color(Color.GREEN);
                button04.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_04=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",4);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_04=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",4);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_05_button)) {
            //Parameters.last_click=5;
            if(Parameters.plflag_05) {
                button05.setCircle_border_color(Color.GREEN);
                button05.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_05=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",5);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_05=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",5);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_06_button)) {
            //Parameters.last_click=6;
            if(Parameters.plflag_06) {
                button06.setCircle_border_color(Color.GREEN);
                button06.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_06=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",6);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_06=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",6);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_07_button)) {
            //Parameters.last_click=7;
            if(Parameters.plflag_07) {
                button07.setCircle_border_color(Color.GREEN);
                button07.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_07=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",7);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_07=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",7);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_08_button)) {
            //Parameters.last_click=8;
            if(Parameters.plflag_08) {
                button08.setCircle_border_color(Color.GREEN);
                button08.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_08=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",8);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_08=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",8);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_09_button)) {
            //Parameters.last_click=9;
            if(Parameters.plflag_09) {
                button09.setCircle_border_color(Color.GREEN);
                button09.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_09=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",9);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_09=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",9);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_10_button)) {
            //Parameters.last_click=10;
            if(Parameters.plflag_10) {
                button10.setCircle_border_color(Color.GREEN);
                button10.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_10=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",10);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_10=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",10);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_11_button)) {
            //Parameters.last_click=11;
            if(Parameters.plflag_11) {
                button11.setCircle_border_color(Color.GREEN);
                button11.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_11=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",11);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_11=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",11);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.plant_12_button)) {
            //Parameters.last_click=12;
            if(Parameters.plflag_12) {
                button12.setCircle_border_color(Color.GREEN);
                button12.setTextColor(Color.GREEN);
            }
            if(Parameters.flag_12=="avbl") {
                Intent i = new Intent(The_Farm.this, Plants.class);
                i.putExtra("plant_number",12);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
            else if (Parameters.flag_12=="not_avbl"){
                Intent i = new Intent(The_Farm.this, Services.class);
                i.putExtra("plant_number",12);
                i.putExtra("site_number",site_number);
                startActivity(i);
            }
        }
        if ((v.getId() == R.id.reset_button)) {
            button01.setTextColor(Color.WHITE);
            button01.setCircle_border_color(Color.WHITE);
            button02.setTextColor(Color.WHITE);
            button02.setCircle_border_color(Color.WHITE);
            button03.setTextColor(Color.WHITE);
            button03.setCircle_border_color(Color.WHITE);
            button04.setTextColor(Color.WHITE);
            button04.setCircle_border_color(Color.WHITE);
            button05.setTextColor(Color.WHITE);
            button05.setCircle_border_color(Color.WHITE);
            button06.setTextColor(Color.WHITE);
            button06.setCircle_border_color(Color.WHITE);
            button07.setTextColor(Color.WHITE);
            button07.setCircle_border_color(Color.WHITE);
            button08.setTextColor(Color.WHITE);
            button08.setCircle_border_color(Color.WHITE);
            button09.setTextColor(Color.WHITE);
            button09.setCircle_border_color(Color.WHITE);
            button10.setTextColor(Color.WHITE);
            button10.setCircle_border_color(Color.WHITE);
            button11.setCircle_border_color(Color.WHITE);
            button11.setTextColor(Color.WHITE);
            button12.setCircle_border_color(Color.WHITE);
            button12.setTextColor(Color.WHITE);

            Parameters.flag_01="avbl";
            Parameters.flag_02="avbl";
            Parameters.flag_03="avbl";
            Parameters.flag_04="avbl";
            Parameters.flag_05="avbl";
            Parameters.flag_06="avbl";
            Parameters.flag_07="avbl";
            Parameters.flag_08="avbl";
            Parameters.flag_10="avbl";
            Parameters.flag_11="avbl";
            Parameters.flag_12="avbl";

            Parameters.plflag_01=false;
            Parameters.plflag_02=false;
            Parameters.plflag_03=false;
            Parameters.plflag_04=false;
            Parameters.plflag_05=false;
            Parameters.plflag_06=false;
            Parameters.plflag_07=false;
            Parameters.plflag_08=false;
            Parameters.plflag_09=false;
            Parameters.plflag_10=false;
            Parameters.plflag_11=false;
            Parameters.plflag_12=false;

            Parameters.date_01="0";
            Parameters.date_02="0";
            Parameters.date_03="0";
            Parameters.date_04="0";
            Parameters.date_05="0";
            Parameters.date_06="0";
            Parameters.date_07="0";
            Parameters.date_08="0";
            Parameters.date_09="0";
            Parameters.date_10="0";
            Parameters.date_11="0";
            Parameters.date_12="0";


        }
    }


}

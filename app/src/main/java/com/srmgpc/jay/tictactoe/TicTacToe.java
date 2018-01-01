package com.srmgpc.jay.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jay on 03-07-2016.
 */
public class TicTacToe extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Boolean cross=false;
    int temp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tic_tac);
        b1= (Button) findViewById(R.id.button11);
        b2= (Button) findViewById(R.id.button12);
        b3= (Button) findViewById(R.id.button13);
        b4= (Button) findViewById(R.id.button21);
        b5= (Button) findViewById(R.id.button22);
        b6= (Button) findViewById(R.id.button23);
        b7= (Button) findViewById(R.id.button31);
        b8= (Button) findViewById(R.id.button32);
        b9= (Button) findViewById(R.id.button33);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               isClicked(b1);
                b1.setClickable(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b2);
                b2.setClickable(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b3);
                b3.setClickable(false);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b4);
                b4.setClickable(false);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b5);
                b5.setClickable(false);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b6);
                b6.setClickable(false);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b7);
                b7.setClickable(false);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b8);
                b8.setClickable(false);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isClicked(b9);
                b9.setClickable(false);
            }
        });
    }
    public void cross(Button button){
        button.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }
    public void circle(Button button){
        button.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }
    /*Show which button is clicked and provide second player move*/
    public void isClicked(Button button){
        if (cross==true){
            circle(button);
            cross=false;
            button.setText("Circle");
            congrats(button);


        }else {
            cross(button);
            cross=true;
            button.setText("Cross");
            congrats(button);

        }

    }
    public void congrats(Button button) {
        temp=temp+1;
        String button1 = b1.getText().toString();
        String button2 = b2.getText().toString();
        String button3 = b3.getText().toString();
        String button4 = b4.getText().toString();
        String button5 = b5.getText().toString();
        String button6 = b6.getText().toString();
        String button7 = b7.getText().toString();
        String button8 = b8.getText().toString();
        String button9 = b9.getText().toString();



        if ((button1 == "Circle" && button2 == "Circle" && button3 == "Circle") |
                (button1 == "Circle" && button4 == "Circle" && button7 == "Circle") |
                (button3 == "Circle" && button6 == "Circle" && button9 == "Circle") |
                (button7 == "Circle" && button8 == "Circle" && button9 == "Circle") |
                (button4 == "Circle" && button5 == "Circle" && button6 == "Circle") |
                (button2 == "Circle" && button5 == "Circle" && button8 == "Circle") |
                (button1 == "Circle" && button5 == "Circle" && button9 == "Circle") |
                (button3 == "Circle" && button5 == "Circle" && button7 == "Circle")) {
            end("Blue Wins.........");


        } else if ((button1 == "Cross" && button2 == "Cross" && button3 == "Cross") |
                (button1 == "Cross" && button4 == "Cross" && button7 == "Cross") |
                (button3 == "Cross" && button6 == "Cross" && button9 == "Cross") |
                (button7 == "Cross" && button8 == "Cross" && button9 == "Cross") |
                (button4 == "Cross" && button5 == "Cross" && button6 == "Cross") |
                (button2 == "Cross" && button5 == "Cross" && button8 == "Cross") |
                (button1 == "Cross" && button5 == "Cross" && button9 == "Cross") |
                (button3 == "Cross" && button5 == "Cross" && button7 == "Cross")) {
            end("Yellow wins..............");
        }else if (temp==9){
            end("Draw");
        }

    }



    public void end(String color){
        Intent intent=new Intent(getApplicationContext(),Congratulation.class);
        intent.putExtra("winner",color);
//        Toast.makeText(getApplicationContext(),color,Toast.LENGTH_SHORT).show();
        startActivity(intent);
        finish();
    }
}

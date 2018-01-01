package com.srmgpc.jay.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.PrivateKey;

/**
 * Created by Jay on 04-07-2016.
 */
public class Congratulation extends Activity {
    TextView welcome;
    Button playAgain, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulation);

        welcome = (TextView) findViewById(R.id.textView);
        playAgain = (Button) findViewById(R.id.cButton1);
        exit = (Button) findViewById(R.id.cButton2);
        welcome.setText(getIntent().getExtras().getString("winner"));

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TicTacToe.class));
                finish();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }
}

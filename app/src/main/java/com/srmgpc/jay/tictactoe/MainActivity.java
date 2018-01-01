package com.srmgpc.jay.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView mAdView= (AdView) findViewById(R.id.Adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void credit(View v){
        startActivity(new Intent(getApplicationContext(),Credit.class));


    }
    public void start(View v){
        startActivity(new Intent(getApplicationContext(),TicTacToe.class));
        finish();
    }
}

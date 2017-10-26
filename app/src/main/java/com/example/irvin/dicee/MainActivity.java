package com.example.irvin.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    ImageView mImageViewL;
    ImageView mImageViewR;
    Button mButton;

    int[] diceImages = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageViewL = (ImageView) findViewById(R.id.leftDice);
        mImageViewR = (ImageView) findViewById(R.id.rightDice);
        mButton = (Button) findViewById(R.id.rollBtn);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numberL = random.nextInt(6);
                int numberR = random.nextInt(6);

                mImageViewL.setImageResource(diceImages[numberL]);
                mImageViewR.setImageResource(diceImages[numberR]);

                if (numberL == numberR) {
                    Toast.makeText(getApplicationContext(), "Double Trouble", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }




}

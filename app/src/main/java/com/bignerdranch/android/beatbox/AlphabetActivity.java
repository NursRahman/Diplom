package com.bignerdranch.android.beatbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity{
    ImageButton button;
    BeatBox mBeatBox;
    ImageView imageViewForAlphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        button = (ImageButton) findViewById(R.id.button_click_sound);
        mBeatBox = new BeatBox(getApplicationContext());
        imageViewForAlphabet = (ImageView)findViewById(R.id.imageForAlphabet);
        Intent intent = getIntent();
        final Sound mSound = (Sound) intent.getSerializableExtra("MSOUND");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setImageResource(R.drawable.mkyz);
                mBeatBox.play(mSound);
            }
        });
        Log.e("TAG",getResources().getDrawable(R.drawable.a)+" ");
        switch (mSound.getName()){
            case "a":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.a));
                Log.e("TAG",getResources().getDrawable(R.drawable.a)+" ");
                break;
            case "b":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.b));
                break;
            case "c":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.c));
                break;
            case "d":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.d));
                break;
            case "e":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.e));
                break;
            case "f":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.f));
                break;
            case "g":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.g));
                break;
            case "h":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.h));
                break;
            case "i":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.i));
                break;
            case "j":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.j));
                break;
            case "k":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.k));
                break;
            case "l":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.l));
                break;
            case "m":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.m));
                break;
            case "n":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.n));
                break;
            case "nn":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.nn));
                break;
            case "o":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.o));
                break;
            case "oo":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.oo));
                break;
            case "p":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.p));
                break;
            case "r":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.r));
                break;
            case "s":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.s));
                break;
            case "t":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.t));
                break;
            case "u":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.u));
                break;
            case "uu":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.uu));
                break;
            case "v":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.v));
                break;
            case "w":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.w));
                break;
            case "x":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.x));
                break;
            case "y":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.y));
                break;
            case "z":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.z));
                break;
            case "z1":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.z1));
                break;
            case "z2":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.z2));
                break;
            case "z3":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.z3));
                break;
            case "z4":
                imageViewForAlphabet.setImageDrawable(getResources().getDrawable(R.drawable.z4));
                break;
        }

    }
}

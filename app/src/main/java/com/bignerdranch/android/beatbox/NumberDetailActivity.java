package com.bignerdranch.android.beatbox;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NumberDetailActivity extends ActionBarActivity {
    ImageButton button;
    BeatBox mBeatBox;
    ImageView imageViewForNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        button = (ImageButton) findViewById(R.id.button_click_sound);
        mBeatBox = new BeatBox(getApplicationContext());
        imageViewForNumber = (ImageView)findViewById(R.id.imageForNumber);
        final Intent intent = getIntent();
        final Bundle bundle = (Bundle) getIntent().getExtras();
        final Integer integer = bundle.getInt("INTEGER_VALUE");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setImageResource(R.drawable.mkyz);
                //mBeatBox.play(integer);
            }
        });
        switch (integer.toString()) {
            case "1":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.bir));
                break;
            case "2":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.eki));
                break;
            case "3":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.uch));
                break;
            case "4":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.tort));
                break;
            case "5":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.besh));
                break;
            case "6":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.alty));
                break;
            case "7":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.jeti));
                break;
            case "8":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.segiz));
                break;
            case "9":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.toguz));
                break;
            case "10":
                imageViewForNumber.setImageDrawable(getResources().getDrawable(R.drawable.on));
                break;
        }
    }
}

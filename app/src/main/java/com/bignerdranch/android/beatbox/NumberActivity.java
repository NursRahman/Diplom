package com.bignerdranch.android.beatbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by nurs on 4/22/17.
 */

public class NumberActivity extends AppCompatActivity{
    ImageButton imageButton;
    BeatBox mBeatBox;
    ImageView imageViewForNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        imageButton = (ImageButton) findViewById(R.id.button_click_sound);
        imageViewForNumber = (ImageView) findViewById(R.id.imageForNumber);
        Intent intent = getIntent();
        final Sound mSound = (Sound) intent.getSerializableExtra("MSOUND");
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBeatBox.play(mSound);
            }
        }
        );

    }
}

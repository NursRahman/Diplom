package com.bignerdranch.android.beatbox;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageButton button = (ImageButton)findViewById(R.id.alphabet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(), BeatBoxActivity.class);
                startActivity(intent);
            }
        });

        ImageButton button1 = (ImageButton)findViewById(R.id.sandar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumberActivity.class);
                startActivity(intent);
            }
        });
    }
}

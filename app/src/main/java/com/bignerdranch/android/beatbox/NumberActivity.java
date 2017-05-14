package com.bignerdranch.android.beatbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by nurs on 4/22/17.
 */

public class NumberActivity extends AppCompatActivity{
    ImageButton imageButton;
    RecyclerView recyclerView;
    ArrayList<Integer> integers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_layout);
        setData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_for_number);
        imageButton = (ImageButton) findViewById(R.id.button_click_sound);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new NumberAdapter(this, integers));
    }
//
    private void setData(){
        integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
    }
}

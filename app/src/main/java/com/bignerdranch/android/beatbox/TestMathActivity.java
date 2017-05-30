package com.bignerdranch.android.beatbox;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class TestMathActivity extends AppCompatActivity {

    ImageButton bir, eki, uch, tort, besh, alty, jeti, segiz, toguz, nol, enter, clear, next;
    EditText editText;
    ImageView a, b, operator, d;

    public int result, answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_math);

        nol = (ImageButton) findViewById(R.id.zero);
        bir = (ImageButton) findViewById(R.id.one);
        eki = (ImageButton) findViewById(R.id.two);
        uch = (ImageButton) findViewById(R.id.three);
        tort = (ImageButton) findViewById(R.id.four);
        besh = (ImageButton) findViewById(R.id.five);
        alty = (ImageButton) findViewById(R.id.six);
        jeti = (ImageButton) findViewById(R.id.seven);
        segiz = (ImageButton) findViewById(R.id.eight);
        toguz = (ImageButton) findViewById(R.id.nine);
        enter = (ImageButton) findViewById(R.id.enter);
        clear = (ImageButton) findViewById(R.id.clear);
        next = (ImageButton) findViewById(R.id.next);
        editText = (EditText)findViewById(R.id.editText);
        a = (ImageView)findViewById(R.id.a);
        b = (ImageView)findViewById(R.id.b);
        operator = (ImageView)findViewById(R.id.operator);
        d = (ImageView)findViewById(R.id.answer);

        generateRandomNumbers();
        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });

        eki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        uch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        tort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        besh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });

        alty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });

        jeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });

        segiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        toguz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                generateRandomNumbers();
                d.setImageDrawable(getResources().getDrawable(R.drawable.suroo));
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String getEdit = editText.getText().toString();
                answer = new Integer(getEdit).intValue();
                if(answer==0){
                    Toast toast = Toast.makeText(getApplicationContext(), "Сан киргиз!!!", Toast.LENGTH_SHORT);
                    toast.show();
                }

                if (result==answer){
                    d.setImageResource(SetImageArray.arrayImagesAnswer[result]);
                    Toast toast = Toast.makeText(getApplicationContext(), "Туура!!!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    d.setImageResource(SetImageArray.arrayImagesAnswer[result]);
                    Toast toast = Toast.makeText(getApplicationContext(), "Туура эмес!!!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


    public void generateRandomNumbers(){
        int first_num;
        int second_num;
        Random random = new Random();
        int flag = random.nextInt(2);
        if (flag==0){
            first_num = random.nextInt(9) + 1;
            second_num = random.nextInt(first_num)+1;
            operator.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.minus));
            result = first_num - second_num;
        }
        else{
            first_num = random.nextInt(9) + 1;
            second_num = random.nextInt(9) + 1;
            result = first_num + second_num;
            operator.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.plus));
        }
        a.setImageResource(SetImageArray.arrayImages[first_num]);
        b.setImageResource(SetImageArray.arrayImages[second_num]);

    }
}

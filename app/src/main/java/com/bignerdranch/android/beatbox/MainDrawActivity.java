package com.bignerdranch.android.beatbox;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.UUID;

/**
 * Created by nurs on 4/30/17.
 */

public class MainDrawActivity extends Activity {
    private MainDrawingView draw;
    private RelativeLayout parent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = (RelativeLayout) findViewById(R.id.dd);
        draw = new MainDrawingView(this);
        parent.addView(draw);
    }


    private void save(){

        File sdCard = Environment.getExternalStorageDirectory();
        File dir = new File(sdCard.getAbsolutePath() + "/drawing");
        dir.mkdirs();
        File file = new File(dir, getRandomString(13)+".png");

        parent.setDrawingCacheEnabled(true);
        Bitmap b = parent.getDrawingCache();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            b.compress(Bitmap.CompressFormat.PNG, 90, fos);
            Toast.makeText(this,"image saved to drawing folder",Toast.LENGTH_LONG).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this,e.getMessage().toString(),Toast.LENGTH_LONG).show();
        }

        // b.compress(Bitmap.CompressFormat.PNG, 95, fos);
    }

    public static String getRandomString(int length)
    {
        String randomStr = UUID.randomUUID().toString();
        while(randomStr.length() < length) {
            randomStr += UUID.randomUUID().toString();
        }
        return randomStr.substring(0, length);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                save();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}

package com.mooduplabs.recipemaster;


import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


import java.io.InputStream;

public class Main3Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        TextView txtContent=(TextView)findViewById(R.id.tv1);
        TextView txtFileName=(TextView)findViewById(R.id.tv2);

        AssetManager assetManager=getAssets();

        try {

            String[] files =assetManager.list("Files");

            for (int i = 0; i < files.length;i++){
                txtContent.append("/n Files=>"+i+"Name"+files);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        InputStream input;

        try {

            input=assetManager.open("kodstrony.txt");

            int size=input.available();

            byte[] buffer=new byte[size];
            input.read(buffer);
            input.close();

            String text=new String(buffer);

            txtFileName.setText(text);

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        finish();
        return true;
    }
}

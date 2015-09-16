package com.mooduplabs.recipemaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void imageButtonOnClick(View v) {
        ImageButton imageButton2 = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void ButtononClick(View v){
        Button button2 = (Button) v;
        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
    }
    public void imageButtonOnClick4(View v) {
        ImageButton imageButton4 = (ImageButton) v;
        startActivity(new Intent(getApplicationContext(), Main4Activity.class));
    }
}

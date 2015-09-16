package com.mooduplabs.recipemaster;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;

public class Main4Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Save Image")
                .setOnMenuItemClickListener(this.SaveImageClickListener)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
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

    OnMenuItemClickListener SaveImageClickListener = new OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            Bitmap bitmap;
            OutputStream output;

            bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.pizza1);

            File filepath = Environment.getExternalStorageDirectory();

            File dir = new File(filepath.getAbsolutePath() + "/Save Pizza Image");
            dir.mkdirs();

            File file = new File(dir, "myimage.png");

            Toast.makeText(Main4Activity.this, "Image Saved to SD Card", Toast.LENGTH_SHORT).show();

            try {
                output = new FileOutputStream(file);

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, output);
                output.flush();
                output.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
    };

}

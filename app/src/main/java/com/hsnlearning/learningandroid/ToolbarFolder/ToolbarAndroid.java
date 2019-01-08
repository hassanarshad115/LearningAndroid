package com.hsnlearning.learningandroid.ToolbarFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.hsnlearning.learningandroid.R;

public class ToolbarAndroid extends AppCompatActivity {
    Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_android);

        toolbar1= this.<Toolbar>findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("Toolbar1");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu_rf,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.setting1){
            Toast.makeText(this, "Setting pr click kia h", Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.search1){
            Toast.makeText(this, "Search pr click kia h", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.hsnlearning.learningandroid.BackSwipeFolder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hsnlearning.learningandroid.R;

public class BackSwipeActivityOne extends AppCompatActivity {

    private Button swipebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_swipe_one);

        //just goto next activity
        swipebtn= this.<Button>findViewById(R.id.backswipebtnD);
        swipebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BackSwipeActivityOne.this,BackSwipeActivityTwo.class));

            }
        });
    }
}

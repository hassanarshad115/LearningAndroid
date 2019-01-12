package com.hsnlearning.learningandroid.FrameAnimationFolder;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hsnlearning.learningandroid.R;

public class FrameAnimationActivity extends AppCompatActivity {

    Button startbtn,stopbtn;
    ImageView imgview;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

       startbtn= this.<Button>findViewById(R.id.startFramebtn);
        stopbtn= this.<Button>findViewById(R.id.stopFramebtn);

        imgview= this.<ImageView>findViewById(R.id.imgViewFrame);

        if (imgview==null) throw new AssertionError();
        imgview.setBackgroundResource(R.drawable.boy_animation_rf);
        imgview.setVisibility(View.INVISIBLE);

        animationDrawable= (AnimationDrawable) imgview.getBackground();
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgview.setVisibility(View.VISIBLE);
                if (animationDrawable.isRunning())
                    animationDrawable.stop();
                animationDrawable.start();
            }
        });

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });
    }
}

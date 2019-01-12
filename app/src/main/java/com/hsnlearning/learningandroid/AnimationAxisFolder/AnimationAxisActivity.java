package com.hsnlearning.learningandroid.AnimationAxisFolder;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hsnlearning.learningandroid.R;

public class AnimationAxisActivity extends AppCompatActivity {

    Button xBtn, yBtn;
    ImageView imgviewAxis;
    RelativeLayout wrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_axis);

        xBtn = this.<Button>findViewById(R.id.animationXaxis);
        yBtn = this.<Button>findViewById(R.id.animationYaxis);
        imgviewAxis = this.<ImageView>findViewById(R.id.imgViewAxis);

        wrapper = this.<RelativeLayout>findViewById(R.id.wrapper);

        xBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int screenWidth = wrapper.getWidth();
                int targetX = screenWidth - imgviewAxis.getWidth();

                ObjectAnimator animator = ObjectAnimator.ofFloat(imgviewAxis, "x", targetX).setDuration(300);
                animator.start();
            }
        });

        //y axis k lye
        yBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int screenHeight = wrapper.getHeight();
                int targetY = screenHeight - imgviewAxis.getHeight();

                ObjectAnimator animator = ObjectAnimator.ofFloat(imgviewAxis, "y", targetY).setDuration(300);
                animator.start();
            }
        });

    }
}

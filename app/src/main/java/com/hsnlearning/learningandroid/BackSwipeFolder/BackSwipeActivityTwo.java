package com.hsnlearning.learningandroid.BackSwipeFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsnlearning.learningandroid.R;
import com.liuguangqiang.progressbar.CircleProgressBar;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class BackSwipeActivityTwo extends AppCompatActivity /*SwipeBackActivity*/ {

    private CircleProgressBar progressBar;
    private SwipeBackLayout swipeBackLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_swipe_two);

        initViews();
     // setDragEdge(SwipeBackLayout.DragEdge.BOTTOM);
    }

    private void initViews() {
        progressBar = (CircleProgressBar) findViewById(R.id.progressbar1);
        swipeBackLayout = (SwipeBackLayout) findViewById(R.id.swipe_layout);

        swipeBackLayout.setEnableFlingBack(false);

        swipeBackLayout.setOnPullToBackListener(new SwipeBackLayout.SwipeBackListener() {
            @Override
            public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
                progressBar.setProgress((int) (progressBar.getMax() * fractionAnchor));
            }
        });
    }
}

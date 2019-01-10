package com.hsnlearning.learningandroid.BackSwipeFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsnlearning.learningandroid.R;
import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class BackSwipeActivityTwo extends  SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_swipe_two);

      setDragEdge(SwipeBackLayout.DragEdge.BOTTOM);
    }
}

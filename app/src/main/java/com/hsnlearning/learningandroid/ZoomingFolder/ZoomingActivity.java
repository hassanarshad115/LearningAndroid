
package com.hsnlearning.learningandroid.ZoomingFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;
import com.hsnlearning.learningandroid.R;

public class ZoomingActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zooming);

        imageView= this.<ImageView>findViewById(R.id.zoomingImageBtn);

        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);
        photoViewAttacher.update();
    }
}

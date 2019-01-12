package com.hsnlearning.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hsnlearning.learningandroid.AnimationAxisFolder.AnimationAxisActivity;
import com.hsnlearning.learningandroid.BackSwipeFolder.BackSwipeActivityOne;
import com.hsnlearning.learningandroid.BackSwipeOrignalFolder.BackSwipeActivityOrignal;
import com.hsnlearning.learningandroid.BottomSheetViewFolder.BottomSheetViewActivity;
import com.hsnlearning.learningandroid.CameraPickerFolder.CameraTakePictureActivity;
import com.hsnlearning.learningandroid.ClipBoardFolder.CopyPasteActivity;
import com.hsnlearning.learningandroid.FrameAnimationFolder.FrameAnimationActivity;
import com.hsnlearning.learningandroid.LoadImageFromUrlFolder.LoadImageFromUrl;
import com.hsnlearning.learningandroid.PlayYoutubeFolder.PlayYoutubeActivity;
import com.hsnlearning.learningandroid.SlideImageWithViewPagerFolder.SlideImageViewPagerActivity;
import com.hsnlearning.learningandroid.SpinnerFolder.Spinner1;
import com.hsnlearning.learningandroid.ToolbarFolder.ToolbarAndroid;
import com.hsnlearning.learningandroid.ZoomingFolder.ZoomingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, spinner1btn, loadimgurlbtn, slideimageviewpagerbtn,zoombtn,bottomsheetbtn,clipboard,backswipe,getBackswipeorgnl;
    Button captureImage,webviewbtnklye,frameanimation,xyanimation;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = this.<Button>findViewById(R.id.btn1);
        spinner1btn = this.<Button>findViewById(R.id.spinner1);

        //dosra treeka
        loadimgurlbtn = this.<Button>findViewById(R.id.loadimageurlbtn);
        loadimgurlbtn.setOnClickListener(this);
        //SlidingImagewithViewPager
        slideimageviewpagerbtn = this.<Button>findViewById(R.id.SlidingImagewithViewPagerbtn);
        slideimageviewpagerbtn.setOnClickListener(this);

        //for zooming btn
        zoombtn= this.<Button>findViewById(R.id.zoomingbtn);
        zoombtn.setOnClickListener(this);

        //for bottomsheeet view btn
        bottomsheetbtn= this.<Button>findViewById(R.id.bottomsheetviewbtn);
        bottomsheetbtn.setOnClickListener(this);

        //clipboard btn k lye
        clipboard= this.<Button>findViewById(R.id.clipboardwbtn);
        clipboard.setOnClickListener(this);

        //back swipe btn
        backswipe= this.<Button>findViewById(R.id.backswipewbtnklye);
        backswipe.setOnClickListener(this);
        //backswipe orignal
        getBackswipeorgnl= this.<Button>findViewById(R.id.backswipeorignalbtn);
        getBackswipeorgnl.setOnClickListener(this);
        //caputure Image
        captureImage= this.<Button>findViewById(R.id.activityCamerabtn);
        captureImage.setOnClickListener(this);
        //webview btn klye
        webviewbtnklye= this.<Button>findViewById(R.id.webviewbtn);
        webviewbtnklye.setOnClickListener(this);

        //frameanimation
        frameanimation= this.<Button>findViewById(R.id.frameanimationbtn);
        frameanimation.setOnClickListener(this);
        //X Y animation
        xyanimation= this.<Button>findViewById(R.id.xyanimationbtn);
        xyanimation.setOnClickListener(this);

        textView1 = this.<TextView>findViewById(R.id.txtview1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ToolbarAndroid.class));
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView1.setText("Original");
            }
        });

        //goto spinner activity
        spinner1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Spinner1.class));
            }
        });


    }

    //dosra treeka implememt kia ha onClick wala oper class k sath he

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.loadimageurlbtn) {
            startActivity(new Intent(MainActivity.this, LoadImageFromUrl.class));
        }
        if (id == R.id.SlidingImagewithViewPagerbtn) {
            startActivity(new Intent(MainActivity.this, SlideImageViewPagerActivity.class));
        }
        if (id==R.id.zoomingbtn){
            startActivity(new Intent(MainActivity.this,ZoomingActivity.class));
        }
        if (id==R.id.bottomsheetviewbtn){
            startActivity(new Intent(MainActivity.this,BottomSheetViewActivity.class));
        }
        if (id==R.id.clipboardwbtn){
            startActivity(new Intent(MainActivity.this,CopyPasteActivity.class));
        }
        if (id==R.id.backswipewbtnklye){
            startActivity(new Intent(MainActivity.this,BackSwipeActivityOne.class));
        }
        if (id==R.id.backswipeorignalbtn){
            startActivity(new Intent(MainActivity.this,BackSwipeActivityOrignal.class));
        }
        if (id==R.id.activityCamerabtn){
            startActivity(new Intent(MainActivity.this,CameraTakePictureActivity.class));
        }if (id==R.id.webviewbtn){
            startActivity(new Intent(MainActivity.this,PlayYoutubeActivity.class));
        }
        if (id==R.id.frameanimationbtn){
            startActivity(new Intent(MainActivity.this,FrameAnimationActivity.class));
        }
        if (id==R.id.xyanimationbtn){
            startActivity(new Intent(MainActivity.this,AnimationAxisActivity.class));
        }
    }
}

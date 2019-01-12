package com.hsnlearning.learningandroid.CameraPickerFolder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hsnlearning.learningandroid.R;

public class CameraTakePictureActivity extends AppCompatActivity {

    private Button captureImagebtn;
    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_take_picture);

        captureImagebtn= this.<Button>findViewById(R.id.caputerImageBtn);
        imageView= this.<ImageView>findViewById(R.id.caputerImageView);

        //phla btn wala method
        captureImagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });

    }

    //dosra method oncreate sy bhr bnyga ctrl+o kr k

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap= (Bitmap) data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);
    }
}

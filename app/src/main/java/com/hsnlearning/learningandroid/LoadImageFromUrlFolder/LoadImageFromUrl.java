package com.hsnlearning.learningandroid.LoadImageFromUrlFolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.hsnlearning.learningandroid.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class LoadImageFromUrl extends AppCompatActivity {

    ImageView imageView;
    //String url="https://xshyfc.com/wp-content/uploads/data/2018/2/27/Wallpapers-1080-X-1920wallpapers-1080-x-1920-1080x1920-for-iphone-5s-PIC-WPXH445343.jpg";
    String url = "http://i.imgur.com/DvpvklR.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image_from_url);

        imageView = this.<ImageView>findViewById(R.id.imgLoadImageUrl);

        loadImageFromUrlMethod(url);
    }

    private void loadImageFromUrlMethod(String url) {
       /* Picasso.get().load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView,new Callback(){
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError(Exception e) {

                    }
                });*/
        Picasso.get().load(url).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView);


    }
}

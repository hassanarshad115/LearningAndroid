package com.hsnlearning.learningandroid.SlideImageWithViewPagerFolder;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hsnlearning.learningandroid.R;
import com.squareup.picasso.Picasso;


//view pager k lye pager adapter hoga
public class viewPagerAdapter extends PagerAdapter {
    //declare veriables
    Activity activity;
    String[] images;
    LayoutInflater inflater;


    //constructor bnaya ha alt+insert sy
    public viewPagerAdapter(Activity activity, String[] images) {
        this.activity = activity;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.viewpager_item_rf, container, false);

        ImageView imageView = view.<ImageView>findViewById(R.id.imgviewViewPagerD);

        DisplayMetrics dis = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dis);

        int height = dis.heightPixels;
        int width = dis.widthPixels;

        imageView.setMaxHeight(height);
        imageView.setMaxWidth(width);

        try {
            Picasso.get()
                    .load(images[position]) //images oper wala ha sbsy ooper wala
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(imageView); //ye image view ayga jo is method ma h
        } catch (Exception ex) {
            Log.d("HassanE", "instantiateItem: " + ex.getMessage());
        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((View)object);
    }
}

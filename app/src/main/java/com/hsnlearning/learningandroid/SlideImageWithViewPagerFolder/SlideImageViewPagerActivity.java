package com.hsnlearning.learningandroid.SlideImageWithViewPagerFolder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hsnlearning.learningandroid.R;

public class SlideImageViewPagerActivity extends AppCompatActivity {

ViewPager viewPager;
viewPagerAdapter viewPagerAdapter; //ye jo alg class bnae ti uska name h
    private String[] images={
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-0/p206x206/45627129_2214299228805625_8581932174574354432_n.jpg?_nc_cat=101&_nc_ht=scontent.flhe3-1.fna&oh=26cc2e8a36bf65370d5321eaa55d570a&oe=5CC537FB",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-9/45568526_2214299162138965_3507090592481935360_n.jpg?_nc_cat=103&_nc_ht=scontent.flhe3-1.fna&oh=fa16905d4591a965a15aced5158e62e0&oe=5CCFBE80",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-9/45461913_2214299118805636_7768886365701275648_n.jpg?_nc_cat=110&_nc_ht=scontent.flhe3-1.fna&oh=0f40fda932596372667fdf3f14719b07&oe=5CD072C6",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-0/p206x206/22221968_1985390805029803_8484273375594918514_n.jpg?_nc_cat=104&_nc_ht=scontent.flhe3-1.fna&oh=96d0bb445a0cf22a0838814517fbab8d&oe=5CCA234E",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-9/14962539_1824972114405007_6898373006858140970_n.jpg?_nc_cat=102&_nc_ht=scontent.flhe3-1.fna&oh=2eb2599307beb8260a4c7707b0b664c9&oe=5C8FF2C2",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-0/p206x206/22196160_1985390971696453_3850991736175537780_n.jpg?_nc_cat=110&_nc_ht=scontent.flhe3-1.fna&oh=370d6a4f131993c888bfe10019cd88d9&oe=5C9063E6",
            "https://scontent.flhe3-1.fna.fbcdn.net/v/t1.0-0/p206x206/38787442_2159484964287052_7636102130280955904_n.jpg?_nc_cat=106&_nc_ht=scontent.flhe3-1.fna&oh=8261c8a19e4fef9ee75b8b25ddacb565&oe=5CC1BF40"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_image_view_pager);

        viewPager= this.<ViewPager>findViewById(R.id.viewpagerslideimage);
        viewPagerAdapter=new viewPagerAdapter(SlideImageViewPagerActivity.this,images);
        viewPager.setAdapter(viewPagerAdapter);
    }
}

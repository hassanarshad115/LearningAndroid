package com.hsnlearning.learningandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hsnlearning.learningandroid.LoadImageFromUrlFolder.LoadImageFromUrl;
import com.hsnlearning.learningandroid.SpinnerFolderActivity.Spinner1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,spinner1btn,loadimgurlbtn;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= this.<Button>findViewById(R.id.btn1);
        spinner1btn= this.<Button>findViewById(R.id.spinner1);

        //dosra treeka
        loadimgurlbtn= this.<Button>findViewById(R.id.loadimageurlbtn);
        loadimgurlbtn.setOnClickListener(this);

        textView1= this.<TextView>findViewById(R.id.txtview1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ToolbarAndroid.class));
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
                startActivity(new Intent(MainActivity.this,Spinner1.class));
            }
        });


    }

    //dosra treeka implememt kia ha onClick wala oper class k sath he

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.loadimageurlbtn){
            startActivity(new Intent(MainActivity.this,LoadImageFromUrl.class));
        }
    }
}

package com.hsnlearning.learningandroid.SpinnerFolderActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.hsnlearning.learningandroid.R;

import java.util.ArrayList;
import java.util.List;

public class Spinner1 extends AppCompatActivity {

    List<String> lstSource=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner1);

        getData();

        Spinner spinne= this.<Spinner>findViewById(R.id.spinnerOriginal1);
        SpinnerAdapter adapter=new SpinnerAdapter(lstSource,Spinner1.this);
        spinne.setAdapter(adapter);
      //  spinne.setDropDownVerticalOffset(100);

    }

    private void getData() {
        for (int i=0;i<10;i++){
            lstSource.add("Item "+i);
        }
    }
}

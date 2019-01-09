package com.hsnlearning.learningandroid.BottomSheetViewFolder;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hsnlearning.learningandroid.R;

public class BottomSheetViewActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior bottomSheetBehavior;
    boolean isCall = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_view);

        View view = this.<View>findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(view);

        Button btn1 = this.<Button>findViewById(R.id.bottomsheetviewbtn1);
        Button btn2 = this.<Button>findViewById(R.id.bottomsheetviewbtn2);
        Button btn3 = this.<Button>findViewById(R.id.bottomsheetviewbtn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bottomsheetviewbtn1:
                if (isCall == false)
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                else
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                isCall = !isCall;

                break;
            default:
                break;
        }
    }
}

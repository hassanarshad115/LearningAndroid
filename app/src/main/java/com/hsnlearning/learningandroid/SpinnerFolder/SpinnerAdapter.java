package com.hsnlearning.learningandroid.SpinnerFolder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hsnlearning.learningandroid.R;

import java.util.List;

//spinner k lye base aapter hoga
public class SpinnerAdapter extends BaseAdapter {
    private List<String> listData;
    private Activity activity;
    private LayoutInflater layoutInflater;

    public SpinnerAdapter(List<String> listData, Activity activity) {
        this.listData = listData;
        this.activity = activity;
        this.layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.spinner_item_rf, null);
            TextView tv = view.<TextView>findViewById(R.id.txtviewSpinner1);
            tv.setText(listData.get(position));
        }
        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View view = super.getDropDownView(position, convertView, parent);

        LinearLayout linearLayout = (LinearLayout) view;
        TextView tv = view.<TextView>findViewById(R.id.txtviewSpinner1);
        tv.setGravity(Gravity.LEFT);
        tv.setTextColor(Color.parseColor("#333635"));
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        return view;
    }
}

package com.example.slidelayouttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    ArrayList<View> pagerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.page);

        LayoutInflater inflater = getLayoutInflater().from(this);
        View v1 = inflater.inflate(R.layout.layout1, null);
        View v2 = inflater.inflate(R.layout.layout2, null);
        pagerList = new ArrayList<>();
        pagerList.add(v1);
        pagerList.add(v2);

        pager.setAdapter(new MyPagerAdapter(pagerList));
        pager.setCurrentItem(0);
        System.out.println("132543265437654");
    }
}

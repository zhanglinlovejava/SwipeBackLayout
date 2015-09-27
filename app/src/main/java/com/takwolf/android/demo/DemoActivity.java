package com.takwolf.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.takwolf.android.widget.R;
import com.takwolf.android.widget.SwipeBackLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoActivity extends AppCompatActivity {

    @Bind(R.id.swipe_back_layout)
    protected SwipeBackLayout swipeBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.bind(this);

        swipeBackLayout.setSwipeBackListener(new SwipeBackLayout.SwipeBackFinishActivityListener(this));
    }

    @OnClick(R.id.button)
    protected void onBtnClick() {
        startActivity(new Intent(this, DemoActivity.class));
    }

}

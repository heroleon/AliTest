package com.example.kb.alitest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alivc.live.pusher.demo.ui.activity.SecondActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void liveRoom(View view) {
        Intent in = new Intent(this, SecondActivity.class);
        startActivity(in);
    }
}

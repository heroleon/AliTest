package com.example.kb.alitest;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.support.multidex.MultiDex;

import com.alivc.live.pusher.AlivcLivePusher;
import com.aliyun.pusher.core.utils.FileUtils;

//import com.squareup.leakcanary.LeakCanary;

public class MutiApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        AlivcLivePusher.showDebugView(this);
        //复制asset中的资源到内存卡
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            return;
//        }
//        LeakCanary.install(this);
    }



}

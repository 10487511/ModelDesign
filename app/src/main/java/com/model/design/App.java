package com.model.design;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "406b8a1fe6", false);
        Bugly.init(getApplicationContext(), "406b8a1fe6", false);
    }
}

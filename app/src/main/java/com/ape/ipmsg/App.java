package com.ape.ipmsg;

import android.app.Application;
import android.content.Context;

/**
 * Created by android on 16-5-3.
 */
public class App extends Application {
    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

    }
}

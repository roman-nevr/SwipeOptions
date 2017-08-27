package com.example.roma.swipeoptions;

import android.app.Application;
import android.content.Context;

/**
 * Created by roma on 27.08.17.
 */

public class App extends Application {
    private static Context context;
    public static Context getAppContext(){
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }
}

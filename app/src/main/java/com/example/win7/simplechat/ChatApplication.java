package com.example.win7.simplechat;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.parse.Parse;
import com.parse.ParseObject;

public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "ceGv48Yh4rTUXSZBxt7MIJU4VzsTwGVChPHJq4S9";
    public static final String YOUR_CLIENT_KEY = "sIvsDmfDEoLpCCOtCvTSZVrB7UMrtG0oHIgcxNzz";
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Message.class);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Register parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("W3AQ2Nwhmlyg36PTTSMFL18qWnOE9lfQJE4AJJvG")
                .clientKey("pPl1njzH0SdgiGWMb5A3LjnS0OTu3LnZBHP3ReqC")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}

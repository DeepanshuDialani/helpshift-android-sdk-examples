package com.example.helpshiftdemo;

import android.app.Application;

import com.helpshift.Core;
import com.helpshift.All;
import com.helpshift.support.Support;
import com.helpshift.exceptions.InstallException;

public class HelpshiftMainApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    // You initialize the library by calling Core.install(APPLICATION, API_KEY, DOMAIN,
    // APP_ID) in your application's onCreate()

    Core.init(All.getInstance());
    try {
      Core.install(this,
                   "<your api key>",
                   "<your domain>",
                   "<your app id>");
    } catch (InstallException e) {
      android.util.Log.e("Helpshift", "install call : ", e);
    }

    android.util.Log.d("Helpshift", Support.libraryVersion + " - is the version for gradle");

  }
}

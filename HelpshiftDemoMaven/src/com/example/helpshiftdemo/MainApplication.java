package com.example.helpshiftdemo;

import android.app.Application;

import com.helpshift.Core;
import com.helpshift.All;
import com.helpshift.support.Support;
import com.helpshift.exceptions.InstallException;

public class MainApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

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

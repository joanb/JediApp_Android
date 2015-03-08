package com.parse.tutorials.pushnotifications;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class Application extends android.app.Application {

  public Application() {
  }

  @Override
  public void onCreate() {
    super.onCreate();

	// Initialize the Parse SDK.
	Parse.initialize(this, getString(R.string.APP_ID), getString(R.string.CLIENT_KEY));

	// Specify an Activity to handle all pushes by default.
	PushService.setDefaultPushCallback(this, MainActivity.class);
  }
}
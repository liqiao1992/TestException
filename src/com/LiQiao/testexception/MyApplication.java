package com.LiQiao.testexception;

import com.LiQiao.catchexception.CrashHandler;

import android.app.Application;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		CrashHandler crashHandler = CrashHandler.getInstance();
		// 注册crashHandler
		crashHandler.init(getApplicationContext());
		// 发送以前没发送的报告(可选)
		crashHandler.sendPreviousReportsToServer();

	}
}

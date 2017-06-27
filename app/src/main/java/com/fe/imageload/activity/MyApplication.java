package com.fe.imageload.activity;

import android.app.Application;

import com.free.imageload.library.ImageLoadProxy;

/**
 * Created by chenpengfei on 2017/6/27.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoadProxy.getInstance().init(ImageLoadProxy.IMAGE_LOAD_GLIDE);
    }
}

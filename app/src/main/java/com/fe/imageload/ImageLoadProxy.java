package com.fe.imageload;

import com.fe.imageload.load.GlideImageLoad;
import com.fe.imageload.load.ImageLoad;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class ImageLoadProxy {

    private static ImageLoadProxy mInstance;
    private ImageLoad mImageLoad;

    public static ImageLoadProxy getInstance() {
        if (mInstance == null) {
            synchronized (ImageLoadProxy.class) {
                if (mInstance == null) {
                    mInstance = new ImageLoadProxy();
                }
            }
        }
        return mInstance;
    }


    public ImageLoadProxy() {
        mImageLoad = new GlideImageLoad();
    }

    public void load(ImageLoadConfiguration imageLoadCfg) {
        mImageLoad.load(imageLoadCfg);
    }



}

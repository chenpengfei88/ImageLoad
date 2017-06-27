package com.free.imageload.library;


import com.free.imageload.library.load.GlideImageLoad;
import com.free.imageload.library.load.ImageLoad;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class ImageLoadProxy {

    public static final int IMAGE_LOAD_GLIDE = 1;

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
    }

    public void init(int imageLoadType) {
        switch (imageLoadType) {
            case IMAGE_LOAD_GLIDE:
                mImageLoad = new GlideImageLoad();
                break;
            default:
                mImageLoad = new GlideImageLoad();
                break;
        }
    }

    public void load(ImageLoadConfiguration imageLoadCfg) {
        if (mImageLoad == null || imageLoadCfg == null) return;
        mImageLoad.load(imageLoadCfg);
    }



}

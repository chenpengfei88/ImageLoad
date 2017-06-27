package com.free.imageload.library.load;


import com.free.imageload.library.ImageLoadConfiguration;
import com.free.imageload.library.manager.GlideManager;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class GlideImageLoad implements ImageLoad {

    @Override
    public void load(ImageLoadConfiguration imageLoadCfg) {
        GlideManager.load(imageLoadCfg);
    }
}

package com.fe.imageload.load;

import com.fe.imageload.ImageLoadConfiguration;
import com.fe.imageload.manager.GlideManager;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class GlideImageLoad implements ImageLoad {

    @Override
    public void load(ImageLoadConfiguration imageLoadCfg) {
        GlideManager.load(imageLoadCfg);
    }
}

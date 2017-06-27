package com.free.imageload.library.manager;


import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.free.imageload.library.ImageLoadConfiguration;
import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class GlideManager {

    public static void load(ImageLoadConfiguration imageLoadCfg) {
        DrawableTypeRequest dtRequest = Glide.with(imageLoadCfg.context).load(imageLoadCfg.url);
        if(imageLoadCfg.isCircle) dtRequest.bitmapTransform(new CropCircleTransformation(imageLoadCfg.context));
        if(imageLoadCfg.isGray) dtRequest.bitmapTransform(new GrayscaleTransformation(imageLoadCfg.context));
        if(imageLoadCfg.imageWidth != 0 && imageLoadCfg.imageHeight != 0) dtRequest.override(imageLoadCfg.imageWidth, imageLoadCfg.imageHeight);
        dtRequest.into(imageLoadCfg.imageView);
    }
}

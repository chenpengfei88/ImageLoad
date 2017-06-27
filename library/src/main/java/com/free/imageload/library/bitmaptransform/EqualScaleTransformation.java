package com.free.imageload.library.bitmaptransform;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;

/**
 * Created by chenpengfei on 2017/4/26.
 */
public class EqualScaleTransformation  implements Transformation<Bitmap> {

    private int mMaxWidth, mMaxHeight;

    public EqualScaleTransformation(int maxWdith, int maxHeight) {
        mMaxWidth = maxWdith;
        mMaxHeight = maxHeight;
    }

    @Override
    public Resource<Bitmap> transform(Resource<Bitmap> resource, int outWidth, int outHeight) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}

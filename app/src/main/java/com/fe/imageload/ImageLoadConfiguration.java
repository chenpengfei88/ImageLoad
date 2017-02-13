package com.fe.imageload;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by chenpengfei on 2017/1/23.
 */
public class ImageLoadConfiguration {

    public final Context context;
    public final ImageView imageView;
    public final String url;
    public final int defaultImageResId;
    public final boolean isCircle;
    public final boolean isGray;
    public final int imageWidth;
    public final int imageHeight;

    public ImageLoadConfiguration(Builder builder) {
        context = builder.context;
        imageView = builder.imageView;
        url = builder.url;
        defaultImageResId = builder.defaultImageResId;
        isCircle = builder.isCircle;
        isGray = builder.isGray;
        imageWidth = builder.imageWidth;
        imageHeight = builder.imageHeight;
    }

    public static final class Builder {

        private Context context;
        private ImageView imageView;
        private String url;
        private int defaultImageResId;
        private boolean isCircle;
        private boolean isGray;
        private int imageWidth;
        private int imageHeight;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder defaultImageResId(int defaultImageResId) {
            this.defaultImageResId = defaultImageResId;
            return this;
        }

        public Builder isCircle(boolean isCircle) {
            this.isCircle = isCircle;
            return this;
        }

        public Builder isGray(boolean isGray) {
            this.isGray = isGray;
            return this;
        }

        public Builder imageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        public Builder imageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        public Builder imageView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public ImageLoadConfiguration build() {
            return new ImageLoadConfiguration(this);
        }

    }
}

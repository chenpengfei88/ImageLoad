package com.fe.imageload.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.fe.imageload.ImageLoadConfiguration;
import com.fe.imageload.ImageLoadProxy;
import com.fe.imageload.R;

public class MainActivity extends AppCompatActivity {

    private String url = "http://imgsrc.baidu.com/baike/pic/item/7aec54e736d12f2ee289bffe4cc2d5628435689b.jpg";
    private String urlTwo = "http://images.china.cn/attachement/jpg/site1000/20081006/0019b91ec9440a53c9b922.jpg";
    private String urlThree = "http://tupian.enterdesk.com/2014/xll/12/06/1/liyifeng1.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewOne = (ImageView) findViewById(R.id.imageview_one);
        ImageView imageViewTwo = (ImageView) findViewById(R.id.imageview_two);
        ImageView imageViewThree = (ImageView) findViewById(R.id.imageview_three);

        ImageLoadProxy.getInstance().load(new ImageLoadConfiguration.Builder(this).url(url).isCircle(true).imageView(imageViewOne).build());
        ImageLoadProxy.getInstance().load(new ImageLoadConfiguration.Builder(this).url(urlTwo).isGray(true).imageView(imageViewTwo).build());
        ImageLoadProxy.getInstance().load(new ImageLoadConfiguration.Builder(this).url(urlThree).imageHeight(1400).imageWidth(1600).imageView(imageViewThree).build());
    }
}

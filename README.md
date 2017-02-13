# ImageLoad
图片加载封装 ImageLoad

 ![image](https://github.com/chenpengfei88/ImageLoad/blob/master/app/src/main/res/drawable/xg.png)
 
#使用

 ImageLoadProxy.getInstance().load(
 new ImageLoadConfiguration.Builder(this).url(url).isCircle(true).imageView(imageViewOne).build());
 
 ImageLoadProxy.getInstance().load(
 new ImageLoadConfiguration.Builder(this).url(urlTwo).isGray(true).imageView(imageViewTwo).build());
 
 ImageLoadProxy.getInstance().load(
 new ImageLoadConfiguration.Builder(this).url(urlThree).imageHeight(1400).imageWidth(1600).imageView(imageViewThree).build());
 
 三个请求分别代表三张图片的显示效果

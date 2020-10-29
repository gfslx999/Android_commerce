package com.lx.lib_core.weight.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.lx.lib_core.R;

public

/*
 @author : 阿森
 @date : 2020-10-16 09:46
 @params :
 @description:
 */
class GlideUtil {
    private static GlideUtil instance = new GlideUtil();

    public static GlideUtil getInstance() {
        return instance;
    }

    public void showImg(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url).error(R.drawable.error).placeholder(R.drawable.loading_grey).into(imageView);
    }

    public void showCircleImg(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url).error(R.drawable.error).placeholder(R.drawable.place_holder).transform(new CircleCrop()).into(imageView);
    }

    public void showCornerImg(Context context, String url, ImageView imageView,int radius) {
        RoundedCorners roundedCorners = new RoundedCorners(radius);
        RequestOptions requestOptions = RequestOptions.bitmapTransform(roundedCorners);

        Glide.with(context).load(url).apply(requestOptions).error(R.drawable.error).placeholder(R.drawable.loading_grey).into(imageView);
    }

}

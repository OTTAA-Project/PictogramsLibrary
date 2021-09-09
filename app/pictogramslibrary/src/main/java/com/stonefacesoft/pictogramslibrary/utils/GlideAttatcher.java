package com.stonefacesoft.pictogramslibrary.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.stonefacesoft.pictogramslibrary.Interfaces.GlideModelTypes;
import com.stonefacesoft.pictogramslibrary.R;

import java.io.File;
import java.net.URL;

import static com.stonefacesoft.pictogramslibrary.utils.ValidateContext.isValidContextFromGlide;

public class GlideAttatcher implements GlideModelTypes {
    private final Glide glide;
    private final Context mContext;
    private int height = 150;
    private int width = 150;
    private int radius = 20;
    private int scaleType=0;
    private boolean useDiskCacheStrategy;
    private boolean useCornerRadious;
    private boolean useDecodeFormat;


    public GlideAttatcher(@NonNull Context mContext) {
        this.mContext = mContext;
        glide = Glide.get(this.mContext);
    }

    /*
    * Use this flag in order to set an scaleoption
    * */
    public GlideAttatcher setScale(int scaleType) {
        this.scaleType = scaleType;
        return this;
    }

    public GlideAttatcher useDiskCacheStrategy(){
        this.useDiskCacheStrategy = true;
        return this;
    }

    public GlideAttatcher useDecodeFormatRGB565(){
        this.useDecodeFormat = true;
        return this;
    }

    /**
     * clean the glide memory if you need
     */
    public void clearMemory() {
        if(getAvailableMemory().lowMemory)
            glide.clearMemory();
    }


    private Glide getGlide() {
        return glide;
    }

    /**
     * verify the Glide context
     *
     * @return true if the activity exist or false when the activity not exist
     */


    public GlideAttatcher setHeight(int height) {
        this.height = height;
        return this;
    }

    public GlideAttatcher setWidth(int width) {
        this.width = width;
        return this;
    }

    public GlideAttatcher setRadius(int radius) {
        this.radius = radius;
        return this;
    }
    /**
     * Use this option in order to create a corner radious pictogram
     * */
    public GlideAttatcher UseCornerRadius(boolean useCornerRadious) {
        this.useCornerRadious = useCornerRadious;
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Bitmap bitmap, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(bitmap).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Drawable drawable, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable String string, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(string).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Uri uri, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(uri).fallback(R.drawable.ic_baseline_cloud_download_24).error(R.drawable.ic_baseline_cloud_download_24).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable File file, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(file).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Integer resourceId, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(resourceId).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @Override
    public Object loadDrawable(@Nullable URL url, ImageView imageView) {
        if (isValidContextFromGlide(mContext)){
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(url).fallback(R.drawable.ic_baseline_cloud_download_24).error(R.drawable.ic_baseline_cloud_download_24).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable byte[] model, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(model).override(width, height))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Object model, ImageView imageView) {
        if (isValidContextFromGlide(mContext)) {
            glideScaleItem(cornerRadious(useDecodeFormat(useDiskCacheStrategic(getGlide().getRequestManagerRetriever().get(mContext).load(model))))).into(imageView);
            clearMemory();
        }
        return this;
    }

    /**
     * scale option method
     * 0 default value
     * 1 center inside
     * 2 center crop
     * 3 fitcenter
     * 4 option center inside
     * 5 option center crop
     * 6 option center fit
     */
    public RequestBuilder<Drawable> glideScaleItem(RequestBuilder<Drawable> drawableRequestBuilder) {
        switch (scaleType) {
            case 0:
                return drawableRequestBuilder;
            case 1:
                return drawableRequestBuilder.centerInside();
            case 2:
                return drawableRequestBuilder.centerCrop();
            case 3:
                return drawableRequestBuilder.fitCenter();
            case 4:
                return drawableRequestBuilder.optionalCenterInside();
            case 5:
                return drawableRequestBuilder.optionalCenterCrop();
            case 6:
                return drawableRequestBuilder.optionalFitCenter();
            default:
                return drawableRequestBuilder;
        }
    }

    public RequestBuilder<Drawable> cornerRadious(RequestBuilder<Drawable> drawableRequestBuilder) {
        if (useCornerRadious)
            return drawableRequestBuilder.transform(new RoundedCorners(radius));
        return drawableRequestBuilder;
    }

    public RequestBuilder<Drawable>  useDiskCacheStrategic(RequestBuilder<Drawable> drawableRequestBuilder){
        if(useDiskCacheStrategy)
            return drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.AUTOMATIC);
        return drawableRequestBuilder;
    }

    public RequestBuilder<Drawable> useDecodeFormat(RequestBuilder<Drawable> drawableRequestBuilder){
        if(useDecodeFormat){
            return drawableRequestBuilder.format(DecodeFormat.PREFER_RGB_565);
        }
        return drawableRequestBuilder;
    }

    private ActivityManager.MemoryInfo getAvailableMemory(){
            ActivityManager activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
    }





}

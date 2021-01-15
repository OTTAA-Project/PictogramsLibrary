package com.stonefacesoft.pictogramslibrary.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.stonefacesoft.pictogramslibrary.Interfaces.GlideModelTypes;

import java.io.File;
import java.net.URL;

public class GlideAttatcher implements GlideModelTypes {
    private Glide glide;
    private Context mContext;
    private int height=150;
    private int width=150;
    private int radius=20;


    public GlideAttatcher(@NonNull Context mContext)
    {
        this.mContext=mContext;
        glide=Glide.get(this.mContext);
    }
    /**
     * Attached a picture in an Imageview
     * */
    public void attachedOnImaView(@NonNull Object drawable,@NonNull ImageView imageView){
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(150,150).transform(new RoundedCorners(16)).into(imageView);
    }


    public void attachedOnImaView(@NonNull ImageView imageView,@NonNull Object drawable){
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(150,150).transform(new RoundedCorners(20)).into(imageView);
    }
    public void attachedOnImaView(@NonNull ImageView imageView,@NonNull Object drawable,String pathuri){

        if(isValidContextFromGlide(mContext))
            if(pathuri.isEmpty()) {
                getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(150, 150).transform(new RoundedCorners(16)).into(imageView);
            }else{
                File file=new File(pathuri);
                getGlide().getRequestManagerRetriever().get(mContext).load(file).listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                }).override(width,height).transform(new RoundedCorners(20)).into(imageView);
            }
    }
    /**
     *  clean the glide memory if you need
     * */
    public void clearMemory(){
        glide.clearMemory();
    }


    private Glide getGlide() {
        return glide;
    }
    /**
     * verify the Glide context
     * @return
     * true if the activity exist or false when the activity not exist
     * */
    private boolean isValidContextFromGlide(Context context){
        Activity activity=getmActivityFromContext(context);
        if(activity==null)
            return false;
        return !isActivityDestroyed(activity);
    }
    /**
     * @return
     * call the activity by context and return that
     * */
    private Activity getmActivityFromContext(Context context){
        if(context instanceof Activity){
            return (Activity) context;
        }
        return null;
    }
    /**
     * @return show if the activity exist or not.
     * */
    private boolean isActivityDestroyed(Activity activity){
        return  activity.isDestroyed()||activity.isFinishing()||activity.isChangingConfigurations();
    }

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

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Bitmap bitmap, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
             getGlide().getRequestManagerRetriever().get(mContext).load(bitmap).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Drawable drawable, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable String string, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(string).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Uri uri, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(uri).override(width,height).into(imageView);
        return this;    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable File file, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(file).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Integer resourceId, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(resourceId).override(width,height).into(imageView);
        return this;
    }

    @Override
    public Object loadDrawable(@Nullable URL url, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(url).override(width,height).into(imageView);
        return this;    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable byte[] model, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(model).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadDrawable(@Nullable Object model, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(model).override(width,height).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable Bitmap bitmap, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(bitmap).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable Drawable drawable, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(drawable).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable String string, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(string).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable Uri uri, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(uri).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable File file, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(file).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable Integer resourceId, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(resourceId).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @Override
    public Object loadCircleDrawable(@Nullable URL url, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(url).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable byte[] model, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(model).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }

    @NonNull
    @Override
    public Object loadCircleDrawable(@Nullable Object model, ImageView imageView) {
        if(isValidContextFromGlide(mContext))
            getGlide().getRequestManagerRetriever().get(mContext).load(model).override(width,height).transform(new RoundedCorners(radius)).into(imageView);
        return this;
    }
}

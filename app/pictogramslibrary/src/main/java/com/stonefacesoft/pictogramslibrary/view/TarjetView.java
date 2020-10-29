package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;
import com.stonefacesoft.pictogramslibrary.Interfaces.ModelTypes;
import com.stonefacesoft.pictogramslibrary.Tarjeta;

import java.io.File;
import java.net.URL;

public class TarjetView extends ConstraintLayout implements ModelTypes {
    protected TextView StrTittle;
    protected ImageView icon;
    protected ImageView Color;
    protected int id;
    protected String Custom_Texto;
    protected Drawable Custom_Imagen;
    protected Glide glide;

    public TarjetView(@NonNull Context context) {
        super(context);
    }

    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable Bitmap bitmap) {
        Glide.with(getContext()).load(bitmap).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable Drawable drawable) {
        Glide.with(getContext()).load(drawable).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable String string) {
        Glide.with(getContext()).load(string).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable Uri uri) {
        Glide.with(getContext()).load(uri).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable File file) {
        Glide.with(getContext()).load(file).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable Integer resourceId) {
        Glide.with(getContext()).load(resourceId).into(icon);
        return this;
    }

    @Override
    public TarjetView loadDrawable(@Nullable URL url) {
        Glide.with(getContext()).load(url).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable byte[] model) {
        Glide.with(getContext()).load(model).into(icon);
        return this;
    }

    @NonNull
    @Override
    public TarjetView loadDrawable(@Nullable Object model) {
        Glide.with(getContext()).load(model).into(icon);
        return this;
    }
}

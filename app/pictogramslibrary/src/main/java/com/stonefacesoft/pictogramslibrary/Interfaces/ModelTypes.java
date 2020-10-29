package com.stonefacesoft.pictogramslibrary.Interfaces;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;

import java.io.File;
import java.net.URL;

public interface  ModelTypes<TarjetView> {
    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable String string);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable Uri uri);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable File file);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@RawRes @DrawableRes @Nullable Integer resourceId);

    @Deprecated
    @CheckResult
    TarjetView loadDrawable(@Nullable URL url);

    @NonNull
    @CheckResult
    TarjetView loadDrawable(@Nullable byte[] model);

    @NonNull
    @CheckResult
    @SuppressWarnings("unchecked")
    TarjetView  loadDrawable(@Nullable Object model);

}

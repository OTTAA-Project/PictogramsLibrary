package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class TarjetView extends ConstraintLayout {
    protected TextView StrTittle;
    protected ImageView icon;
    protected ImageView Color;
    protected int id;
    protected String Custom_Texto;
    protected Drawable Custom_Imagen;

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
}

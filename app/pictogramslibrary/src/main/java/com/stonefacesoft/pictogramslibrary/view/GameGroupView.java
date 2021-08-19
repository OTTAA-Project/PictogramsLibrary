package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.stonefacesoft.pictogramslibrary.Classes.GameGroup;
import com.stonefacesoft.pictogramslibrary.Classes.Group;
import com.stonefacesoft.pictogramslibrary.R;

import java.io.File;

public class GameGroupView extends TarjetView{
    private ImageView tagScore;
    private ImageView Color;
    private int Custom_Color;
    private GameGroup pictogramsLibraryGameGroup;

    public GameGroupView(@NonNull Context context) {
        super(context);
        init();
    }

    public GameGroupView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
            //    Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }

    public GameGroupView(@NonNull  Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
            //    Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }



    private void init() {
        inflate(getContext(), R.layout.gamegroup, this);
        this.StrTittle = findViewById(R.id.grid_text);
        this.icon = findViewById(R.id.grid_image);
        this.Color = findViewById(R.id.color_Picto);
        this.kind_of_pictogram = findViewById(R.id.kind_of_Picto);
        this.tagScore = findViewById(R.id.tagCalendario);
    }

    public void setPictogramsLibraryGameGroup(GameGroup pictogramsLibraryGameGroup) {
        this.pictogramsLibraryGameGroup = pictogramsLibraryGameGroup;
        setData();
    }

    private void setData() {
        id = pictogramsLibraryGameGroup.getId();
        setCustom_Texto(pictogramsLibraryGameGroup.getObjectName());
        if (pictogramsLibraryGameGroup.getEditedPictogram().isEmpty()) {
            glideAttatcher.setHeight(icon.getHeight()).setWidth(icon.getWidth()).useDiskCacheStrategy().loadDrawable(mContext.getResources().getDrawable(mContext.getResources().getIdentifier(pictogramsLibraryGameGroup.getPictogram(),
                    "drawable", mContext.getPackageName())), this.icon);
        } else {
            File picto = new File(pictogramsLibraryGameGroup.getEditedPictogram());
            if (picto.exists())
                glideAttatcher.useDiskCacheStrategy().loadDrawable(picto, this.icon);
            else
                glideAttatcher.useDiskCacheStrategy().loadDrawable(Uri.parse(pictogramsLibraryGameGroup.getUrl()), this.icon);
        }
    }
    public void setCustom_Texto(String t) {
        this.Custom_Texto = t;
        StrTittle.setText(t);
        invalidate();
        requestLayout();
    }

    public void setCustom_Img(Drawable imagen) {
        Glide.with(getContext()).load(imagen).into(icon);
        this.Custom_Imagen = imagen;
        invalidate();
        requestLayout();
    }


    public void setTagScore(ImageView tagScore) {
        this.tagScore = tagScore;
    }

    public void setDrawableScore(Drawable drawable){
        this.tagScore.setImageDrawable(drawable);
    }


}

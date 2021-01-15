package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.stonefacesoft.pictogramslibrary.Classes.Group;
import com.stonefacesoft.pictogramslibrary.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class GroupView extends TarjetView{
    private ImageView tagHora,tagUbicacion,tagSexo,tagEdad;
    private ImageView Color;
    private int Custom_Color;
    private Group pictogramsLibraryGroup;


    public GroupView(@NonNull Context context) {
        super(context);
        init();
    }

    public GroupView(@NonNull Context context, @Nullable AttributeSet attrs) {
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

    public GroupView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        inflate(getContext(), R.layout.group, this);
        this.StrTittle = findViewById(R.id.grid_text);
        this.icon = findViewById(R.id.grid_image);
        this.Color = findViewById(R.id.color_Picto);
        this.tagEdad=findViewById(R.id.tagCalendario);
        this.tagHora=findViewById(R.id.tagHora);
        this.tagUbicacion=findViewById(R.id.tagUbicacion);
        this.tagSexo=findViewById(R.id.tagClima);
    }

    public void setCustom_Img(Drawable imagen) {
        Glide.with(getContext()).load(imagen).into(icon);
        this.Custom_Imagen = imagen;
        invalidate();
        requestLayout();
    }

    public void setName(String name){
                StrTittle.setText(name);
    }

    public void setPictogramsLibraryGroup(Group pictogramsLibraryGroup) {
        this.pictogramsLibraryGroup = pictogramsLibraryGroup;
        setData();
    }

    private void setData(){
        id= pictogramsLibraryGroup.getId();
        this.setCustom_Texto(pictogramsLibraryGroup.getObjectName());
        if(pictogramsLibraryGroup.getEditedPictogram().isEmpty()){
            glideAttatcher.loadDrawable(mContext.getResources().getDrawable(mContext.getResources().getIdentifier(pictogramsLibraryGroup.getPictogram(),
                    "drawable", mContext.getPackageName())),this.icon);
        }else{
            File picto=new File(pictogramsLibraryGroup.getEditedPictogram());
            glideAttatcher.loadDrawable(picto,this.icon);
        }
    }

    public void setCustom_Texto(String t) {
        this.Custom_Texto = t;
        StrTittle.setText(t);
        invalidate();
        requestLayout();
    }

}

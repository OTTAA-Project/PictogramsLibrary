package com.stonefacesoft.pictogramslibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class Tarjeta extends ConstraintLayout {
    protected int id;
    protected String Custom_Texto;
    protected Drawable Custom_Imagen;
    protected Integer Custom_Color;
    protected String localeText;
    protected String englishText;
    protected JSONObject object;
    protected TextView tv;
    protected ImageView Img;
    protected ImageView Color;
    protected ConstraintSet set;
    public Tarjeta(@NonNull Context context) {
        super(context);
        init();
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
//            Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
//            Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
//            Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }


    public void loadJsonObjectData(){

    }
    public JSONObject toJSonObject(){
        if(object!=null)
            return object;
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getCustom_Imagen() {
        return Custom_Imagen;
    }

    public void setCustom_Imagen(Drawable custom_Imagen) {
        Custom_Imagen = custom_Imagen;
    }

    public String getLocaleText() {
        return localeText;
    }

    public void setLocaleText(String localeText) {
        this.localeText = localeText;
    }

    public String getEnglishText() {
        return englishText;
    }

    public void setEnglishText(String englishText) {
        this.englishText = englishText;
    }

    public JSONObject getObject() {
        return object;
    }

    public void setObject(JSONObject object) {
        this.object = object;
    }

    private void init() {
        inflate(getContext(), R.layout.pictogram, this);
        this.tv = findViewById(R.id.grid_text);
        this.Img = findViewById(R.id.Imagen_Picto);
        this.Color = findViewById(R.id.color_Picto);
    }
}

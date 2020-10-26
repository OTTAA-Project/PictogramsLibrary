package com.stonefacesoft.pictogramas;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Picto extends Tarjeta {

    private Integer Custom_Color;
    private boolean isClicked;
    private int id;

    TextView tv;
    ImageView Img;
    ImageView Color;
    public Picto(@NonNull Context context) {
        super(context);
        init();
    }

    public Picto(@NonNull Context context, @Nullable AttributeSet attrs) {
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

    public Picto(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

    public Picto(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
    private void init() {
        inflate(getContext(), R.layout.pictogram, this);
        this.tv = findViewById(R.id.grid_text);
        this.Img = findViewById(R.id.Imagen_Picto);
        this.Color = findViewById(R.id.color_Picto);
    }
    /**
     * Set the color of the pictogram
     * */
    public void setCustom_Color(Integer color) {
        this.Custom_Color = color;
        //Img.setBackgroundColor(color);

        Color.setColorFilter(color);

        invalidate();
        requestLayout();
    }

    /**
     * set the icon of the pictogram
     * */
    public void setCustom_Img(Drawable imagen) {
        this.Custom_Imagen = imagen;
        Img.setImageDrawable(imagen);
        invalidate();
        requestLayout();
    }
    /**
     * Set up the name of the pictogram
     * */
    public void setCustom_Texto(String t) {
        this.Custom_Texto = t;
        tv.setText(t);
        invalidate();
        requestLayout();
    }

    public String getCustom_Texto()  {return Custom_Texto;}

    public int getCustom_Color()  {return Custom_Color;}

    public Drawable getCustom_Imagen()  {return Custom_Imagen;}

    public void goneCustomTexto(){
        tv.setVisibility(GONE);
    }
    public void setInvisibleCustomTexto(){
        tv.setVisibility(INVISIBLE);
    }

    public void setVisibleText(){
        tv.setVisibility(VISIBLE);
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public boolean isClicked() {
        return isClicked;
    }
    /**
     * Set up the id of the pictogram
     * */
    public void setIdPictogram(int id) {
        this.id = id;
    }


    public int getIdPictogram() {
        return id;
    }



}

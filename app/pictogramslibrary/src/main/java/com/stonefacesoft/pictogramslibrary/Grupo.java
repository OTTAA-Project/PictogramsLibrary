package com.stonefacesoft.pictogramslibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Grupo extends Tarjeta {

    private TextView tv;
    private ImageView Img,tagHora,tagUbicacion,tagSexo,tagEdad;
    private ImageView Color;
    public Grupo(@NonNull Context context) {
        super(context);
        init();
    }

    public Grupo(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
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

    public Grupo(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
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

    public Grupo(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
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
        this.tv = findViewById(R.id.grid_text);
        this.Img = findViewById(R.id.grid_image);
        this.Color = findViewById(R.id.color_Picto);
        this.tagEdad=findViewById(R.id.tagCalendario);
        this.tagHora=findViewById(R.id.tagHora);
        this.tagUbicacion=findViewById(R.id.tagUbicacion);
        this.tagSexo=findViewById(R.id.tagClima);
    }

    public void setName(String locale){
        switch (locale){
            case "en":
                tv.setText(englishText);
                break;
            default:
                tv.setText(localeText);
        }
    }
}

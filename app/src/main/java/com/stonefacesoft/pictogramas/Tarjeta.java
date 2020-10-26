package com.stonefacesoft.pictogramas;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.json.JSONObject;

public class Tarjeta extends ConstraintLayout {
    protected int id;
    protected String Custom_Texto;
    protected Drawable Custom_Imagen;
    protected Integer Custom_Color;
    protected String localeText;
    protected String englishText;
    protected JSONObject object;

    public Tarjeta(@NonNull Context context) {
        super(context);
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Tarjeta(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
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
}

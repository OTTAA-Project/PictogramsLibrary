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

public class Grupo extends Tarjeta {

    public Grupo(JSONObject object){
        super(object);
    }

    public Grupo(String localeName, String englisName, Drawable drawable, int id) {
        super(localeName, englisName, drawable, id);
    }
}

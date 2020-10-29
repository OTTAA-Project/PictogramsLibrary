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

    public Grupo(JSONObject object,String locale){
        super(object,locale);
    }

    public Grupo(String localeName, String englisName, Drawable drawable, int id,String locale) {
        super(localeName, englisName, drawable, id,locale);
    }

    @Override
    public JSONObject toJsonObject() {
        if(DataObject==null)
            DataObject=JsonManager.createJsonObject();
        JsonManager.JsonObjectloadInt(DataObject,"id",id,"Grupo");
        JSONObject text=JsonManager.createJsonObject();
        JsonManager.JsonObjectloadString(text,locale,localeName,"Grupo");
        JsonManager.JsonObjectloadString(text,"en",englisName,"Grupo");
        JsonManager.JsonObjectloadObject(DataObject,"texto",text,"Grupo");

        return DataObject;
    }


}

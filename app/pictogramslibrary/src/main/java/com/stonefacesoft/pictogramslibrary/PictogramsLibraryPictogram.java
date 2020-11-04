package com.stonefacesoft.pictogramslibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintSet;

public class PictogramsLibraryPictogram extends Tarjeta {
    private int color;

    public PictogramsLibraryPictogram(JSONObject object, String locale) {
        super(object,locale);
        color=JsonManager.JsonObjectGetInt(DataObject,"tipo","Picto");
    }

    public PictogramsLibraryPictogram(String localeName, String englisName, Drawable drawable, int id, int color, String locale) {
        super(localeName, englisName, drawable, id,locale);
        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public JSONObject toJsonObject() {
        if(DataObject==null)
            DataObject=JsonManager.createJsonObject();
        JsonManager.JsonObjectloadInt(DataObject,"id",id,"Picto");
        JSONObject text=JsonManager.createJsonObject();
        JsonManager.JsonObjectloadString(text,locale,localeName,"Picto");
        JsonManager.JsonObjectloadString(text,"en",englisName,"Picto");
        JsonManager.JsonObjectloadObject(DataObject,"texto",text,"Picto");


        return DataObject;
    }


}

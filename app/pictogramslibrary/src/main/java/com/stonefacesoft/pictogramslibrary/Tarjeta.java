package com.stonefacesoft.pictogramslibrary;

import android.graphics.drawable.Drawable;

import org.json.JSONObject;

import com.stonefacesoft.pictogramslibrary.JsonUtils.JSONObjectManager;

import java.util.ArrayList;

public class Tarjeta {
    protected String localeName,englisName;
    protected Drawable drawable;
    protected int id;
    protected ArrayList<String> tags;
    protected JSONObject DataObject;
    protected JSONObjectManager JsonManager;
    protected String locale;


    public Tarjeta(JSONObject object,String locale){
        this.DataObject=object;
        this.JsonManager=new JSONObjectManager();
        this.locale=locale;
        processData();
    }

    public Tarjeta(String localeName, String englisName, Drawable drawable, int id,String locale) {
        this.localeName = localeName;
        this.englisName = englisName;
        this.drawable = drawable;
        this.id = id;
        this.JsonManager=new JSONObjectManager();
        this.locale=locale;
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    public String getEnglisName() {
        return englisName;
    }

    public void setEnglisName(String englisName) {
        this.englisName = englisName;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public JSONObject toJsonObject(){
        if(DataObject==null)
            DataObject=JsonManager.createJsonObject();

        return DataObject;
    }

    public void processData(){
        this.id=JsonManager.JsonObjectGetInt(DataObject,"id","Tarjeta");
        JSONObject text=JsonManager.JsonObjectGetJSONObject(DataObject,"text","Tarjeta");
        this.localeName=JsonManager.JsonObjectGetString(text,"es","Tarjeta");
        this.englisName=JsonManager.JsonObjectGetString(text,"en","Tarjeta");
    }

    public void setDataObject(JSONObject dataObject) {
        DataObject = dataObject;
        processData();
    }

    public void loadData(){

    }
}
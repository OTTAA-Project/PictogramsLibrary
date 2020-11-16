package com.stonefacesoft.pictogramslibrary;

import android.graphics.drawable.Drawable;

import org.json.JSONObject;

import com.stonefacesoft.pictogramslibrary.JsonUtils.JSONObjectManager;

import java.util.ArrayList;
/**
 * <H1> Description </H1>
 * Use this class in order to create one object such as a pictogram or a group or another derived class
 * <H2>How to implements</H2>
 *
 * <code>
 *     // Loading a json object class
 *     <br>
 *     Tarjeta t=new Tarjeta(JsonObject object,Locale locale);
 * </code><br>
 *<code>
 *     // Loading a normal Tarjet object
 *     <br>
 *     Tarjeta t=new Tarjeta(String name,String englishName,Drawable drawable,int id,String locale);
 *</code>
 * <br>
 *Pay attention this class is implemented in order to create another kind of objects such as a group or a pictogram
 *
 * */
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
    /**
     * This method return the name of the object in the locale language
     * */
    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }
    /**
     * This method return the name of the object in english
     * */
    public String getEnglisName() {
        return englisName;
    }
    /**
     * This method set up the name about the object
     * */
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

    /**
     * This method return one Json Object
     * */
    public JSONObject toJsonObject(){
        if(DataObject==null)
            DataObject=JsonManager.createJsonObject();

        return DataObject;
    }

    /**
     * This method is designed in order to load the data about one pictogram or group from one json object.
     * */
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
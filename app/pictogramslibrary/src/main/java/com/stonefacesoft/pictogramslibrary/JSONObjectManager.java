package com.stonefacesoft.pictogramslibrary;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONObjectManager {
    public JSONObject createJsonObject(){
        JSONObject object=new JSONObject();
        return object;
    }

    public void JsonObjectloadString(JSONObject object,String name,String value,String className){
        try {
            object.put(name,value);
        } catch (JSONException e) {
            Log.e(className, "JsonObjectloadString: "+ e.getMessage() );
        }
    }
    public void JsonObjectloadInt(JSONObject object,String name,int value,String className){
        try {
            object.put(name,value);
        } catch (JSONException e) {
            Log.e(className, "JsonObjectloadString: "+ e.getMessage() );
        }
    }
    public void JsonObjectloadValue(JSONObject object,String name,boolean value,String className){
        try {
            object.put(name,value);
        } catch (JSONException e) {
            Log.e(className, "JsonObjectloadString: "+ e.getMessage() );
        }
    }

    public String JsonObjectGetString(JSONObject object,String value,String className){
        try {
           return object.getString(value);
        } catch (JSONException e) {
            Log.e(className, "JsonObjectGetString: "+e.getMessage() );
        }
        return "";
    }
    public JSONObject JsonObjectGetJSONObject(JSONObject object,String value,String className){
        try {
          return   object.getJSONObject(value);
        } catch (JSONException e) {
            Log.e(className, "JsonObjectGetJSONObject: "+ e.getMessage() );
        }
        return null;
    }


}

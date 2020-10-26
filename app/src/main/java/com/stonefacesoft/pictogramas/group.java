package com.stonefacesoft.pictogramas;

import android.content.Context;

import org.json.JSONObject;

public class group {
    private Grupo grupo;
    private JSONObjectManager jsonObjectManager;
    private JSONObject object;
    private String locale;
    public group(Context mContext, JSONObject object,String locale){
         grupo=new Grupo(mContext);
         jsonObjectManager=new JSONObjectManager();
         this.object=object;
         this.locale=locale;
    }
    public group ProcessData(){
        JSONObject data=jsonObjectManager.JsonObjectGetJSONObject(object,"text","Group");
        grupo.setLocaleText(jsonObjectManager.JsonObjectGetString(data,locale,"Group"));
        grupo.setEnglishText(jsonObjectManager.JsonObjectGetString(data,locale,"Group"));
        return this;
    }
}

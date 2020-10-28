package com.stonefacesoft.pictogramslibrary;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

public class PictogramsLibraryGroup {
    private Grupo grupo;
    private JSONObjectManager jsonObjectManager;
    private JSONObject object;
    private String locale;
    public PictogramsLibraryGroup(Context mContext, JSONObject object, String locale){
         grupo=new Grupo(mContext);
         jsonObjectManager=new JSONObjectManager();
         this.object=object;
         this.locale=locale;
    }
    public PictogramsLibraryGroup ProcessData(){
        JSONObject data=jsonObjectManager.JsonObjectGetJSONObject(object,"text","Group");
        Log.e("Group", "ProcessData: "+data.toString() );
        grupo.setLocaleText(jsonObjectManager.JsonObjectGetString(data,locale,"Group"));
        grupo.setEnglishText(jsonObjectManager.JsonObjectGetString(data,"en","Group"));
        grupo.setName(locale);
        return this;
    }

    public Grupo getGrupo() {
        return grupo;
    }
}

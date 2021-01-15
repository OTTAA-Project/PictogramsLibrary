package com.stonefacesoft.pictogramslibrary.Classes;

import com.stonefacesoft.pictogramslibrary.JsonUtils.JSONObjectManager;

import org.json.JSONObject;

public class Group extends OTTAAProjectObjects {

    public Group(JSONObject object, String locale) {
        super(object, locale);
    }
    @Override
    public void createObject() {
        super.createObject();
        if(object==null){
            object=new JSONObject();
        }

    }

    @Override
    public JSONObject toJsonObject() {
        JSONObjectManager manager=new JSONObjectManager();
        JSONObject object= manager.createJsonObject();
        JSONObject texto=manager.createJsonObject();
        manager.JsonObjectloadString(texto,"en",name_en,"Pictogram");
        manager.JsonObjectloadString(texto,locale,name,"Pictogram");
        JSONObject childLogo=manager.createJsonObject();
        manager.JsonObjectloadString(childLogo,"picto",pictogram,"Pictogram");
        manager.JsonObjectloadString(childLogo,"pictoEditado",editedPictogram,"Pictogram");
        manager.JsonObjectloadString(childLogo,"urlFoto", url,"Pictogram");
        manager.JsonObjectloadString(childLogo,"pushKey",push,"Pictogram");
        manager.JsonObjectloadObject(object,"texto",texto,"Pictogram");
        manager.JsonObjectloadObject(object,"imagen",childLogo,"Pictogram");
        manager.JsonObjectGetJsonObject(object,"relacion",relationShip,"Pictogram");
        manager.JsonObjectGetJsonObject(object,"hora",hour,"Pictogram");
        manager.JsonObjectGetJsonObject(object,"sexo",gender,"Pictogram");
        manager.JsonObjectGetJsonObject(object,"edad",age,"Pictogram");
        manager.JsonObjectGetJsonObject(object,"ubicacion",location,"Pictogram");
        return object;
    }
}

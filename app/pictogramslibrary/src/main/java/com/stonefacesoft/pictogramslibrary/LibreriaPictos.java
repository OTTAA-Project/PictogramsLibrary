package com.stonefacesoft.pictogramslibrary;

import android.content.Context;

public class LibreriaPictos {
    private Picto picto;
    private Grupo grupo;
    public void createPictogram(Context mContext){
        picto=new Picto(mContext);
    }
    public void createGroup(Context mContext){
        grupo=new Grupo(mContext);
    }


    public Picto getPictogram(){
        return picto;
    }

    public Grupo getGrupo(){
        return grupo;
    }



}

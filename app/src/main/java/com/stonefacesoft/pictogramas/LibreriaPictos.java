package com.stonefacesoft.pictogramas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

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

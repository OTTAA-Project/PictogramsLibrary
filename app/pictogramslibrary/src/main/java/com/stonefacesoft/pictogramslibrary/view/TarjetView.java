package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.stonefacesoft.pictogramslibrary.utils.GlideAttatcher;

public class TarjetView extends ConstraintLayout  {
    protected TextView StrTittle;
    protected ImageView icon;
    protected ImageView Color;
    protected volatile ImageView kind_of_pictogram;
    protected int id;
    protected String Custom_Texto;
    protected Drawable Custom_Imagen;
    protected GlideAttatcher glideAttatcher;
    protected Context mContext;
    protected int height;
    protected int width;

    public TarjetView(@NonNull Context context) {
        super(context);
        this.mContext=context;

    }

    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TarjetView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setUpContext(Context mContext){
        this.mContext=mContext;
    }

    public void setUpGlideAttatcher(Context mContext){
        glideAttatcher=new GlideAttatcher(mContext);
    }

    public GlideAttatcher getGlideAttatcher() {
        return glideAttatcher;
    }

    public ImageView getKindOfPictogramImageView(){
        return kind_of_pictogram;
    }

    public void changeKindOfPictogramVisibility(){
       if(kind_of_pictogram.getVisibility()==VISIBLE)
        kind_of_pictogram.setVisibility(GONE);
       else
        kind_of_pictogram.setVisibility(VISIBLE);
    }

    public void selectIcon(){

    }

    public void setGlideAttatcher(GlideAttatcher glideAttatcher) {
        this.glideAttatcher = glideAttatcher;
    }



    @Override
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
    }

    protected Drawable findResource(){
        return null;
    }

    protected  void setData(){

    }

    public void setData(int height,int with){

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if(glideAttatcher!=null){
            glideAttatcher.destroy();
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

package com.stonefacesoft.pictogramslibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.stonefacesoft.pictogramslibrary.Classes.Group;
import com.stonefacesoft.pictogramslibrary.R;

import java.io.File;

public class GroupView extends TarjetView {
    private ImageView tagHora, tagUbicacion, tagSexo, tagEdad;
    private ImageView Color;
    private int Custom_Color;
    private Group pictogramsLibraryGroup;


    public GroupView(@NonNull Context context) {
        super(context);
        init();
    }

    public GroupView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
            //    Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }

    public GroupView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Custom_Picto,
                0, 0);
        try {
            Custom_Texto = a.getString(R.styleable.Custom_Picto_Texto);
            Custom_Color = a.getColor(R.styleable.Custom_Picto_Color, getResources().getColor(R.color.Black));
            //    Custom_Imagen = a.getInteger(R.styleable.Custom_Picto_Imagen, 0);
        } finally {
            a.recycle();
        }
        init();
    }


    private void init() {
        inflate(getContext(), R.layout.group, this);
        this.StrTittle = findViewById(R.id.grid_text);
        this.icon = findViewById(R.id.grid_image);
        this.Color = findViewById(R.id.color_Picto);
        this.kind_of_pictogram = findViewById(R.id.kind_of_Picto);
        this.tagEdad = findViewById(R.id.tagCalendario);
        this.tagHora = findViewById(R.id.tagHora);
        this.tagUbicacion = findViewById(R.id.tagUbicacion);
        this.tagSexo = findViewById(R.id.tagClima);
    }

    public void setCustom_Img(Drawable imagen) {
        Glide.with(getContext()).load(imagen).into(icon);
        this.Custom_Imagen = imagen;
        invalidate();
        requestLayout();
    }

    public void setName(String name) {
        StrTittle.setText(name);
    }

    public void setPictogramsLibraryGroup(Group pictogramsLibraryGroup) {
        this.pictogramsLibraryGroup = pictogramsLibraryGroup;
        setData();
    }

    private void setData() {
        id = pictogramsLibraryGroup.getId();
        this.setCustom_Texto(pictogramsLibraryGroup.getObjectName());
        if (pictogramsLibraryGroup.getEditedPictogram().isEmpty()) {
            glideAttatcher.setHeight(icon.getHeight()).setWidth(icon.getWidth()).useDiskCacheStrategy().loadDrawable(mContext.getResources().getDrawable(mContext.getResources().getIdentifier(pictogramsLibraryGroup.getPictogram(),
                    "drawable", mContext.getPackageName())), this.icon);
        } else {
            File picto = new File(pictogramsLibraryGroup.getEditedPictogram());
            if (picto.exists())
                glideAttatcher.useDiskCacheStrategy().loadDrawable(picto, this.icon);
            else
                glideAttatcher.useDiskCacheStrategy().loadDrawable(Uri.parse(pictogramsLibraryGroup.getUrl()), this.icon);
        }
    }

    public void loadHourIcon(boolean value) {
        tagHora.setImageResource(value ? R.drawable.ic_timer_black_24dp : R.drawable.ic_timer_off_black_24dp);
    }

    public void loadGenderIcon(boolean value) {
        tagSexo.setImageResource(value ? R.drawable.ic_baseline_wc_24 : R.drawable.ic_baseline_disable_24);
    }

    public void loadLocationIcon(boolean value) {
        tagUbicacion.setImageResource(value ? R.drawable.ic_location_on_black_24dp : R.drawable.ic_location_off_black_24dp);
    }

    public void loadAgeIcon(boolean value) {
        tagEdad.setImageResource(value ? R.drawable.ic_face_black_on_24dp : R.drawable.ic_face_black_24dp);
    }


    public void setCustom_Texto(String t) {
        this.Custom_Texto = t;
        StrTittle.setText(t);
        invalidate();
        requestLayout();
    }

}

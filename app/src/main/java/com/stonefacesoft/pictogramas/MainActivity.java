package com.stonefacesoft.pictogramas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.stonefacesoft.pictogramslibrary.Grupo;
import com.stonefacesoft.pictogramslibrary.LibreriaPictos;
import com.stonefacesoft.pictogramslibrary.view.PictogramsLibraryGroupView;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the PeripheralManager
 * For example, the snippet below will open a GPIO pin and set it to HIGH:
 * <p>
 * PeripheralManager manager = PeripheralManager.getInstance();
 * try {
 * Gpio gpio = manager.openGpio("BCM6");
 * gpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * gpio.setValue(true);
 * } catch (IOException e) {
 * Log.e(TAG, "Unable to access GPIO");
 * }
 * <p>
 * You can find additional examples on GitHub: https://github.com/androidthings
 */
public class MainActivity extends AppCompatActivity {

    private PictogramsLibraryGroupView groupView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Grupo grupo=new Grupo("hola","hello",getResources().getDrawable(R.drawable.ic_lock_outline_black_24dp),0);
        groupView=findViewById(R.id.pictogram0);
        groupView.setGrupo(grupo);


    }


}

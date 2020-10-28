package com.stonefacesoft.pictogramas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.stonefacesoft.pictogramslibrary.PictogramsLibraryGroup;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JSONObject object=new JSONObject();
        JSONObject language=new JSONObject();
        try {
            language.put("en","hello");
            language.put("es","hola");
            object.put("text",language);
            Log.e("Object", "onCreate: "+object.toString() );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        PictogramsLibraryGroup grupo=new PictogramsLibraryGroup(this,object,"es");
        grupo.ProcessData();
        setContentView(grupo.getGrupo());

    }


}

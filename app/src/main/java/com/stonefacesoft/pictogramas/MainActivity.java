package com.stonefacesoft.pictogramas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stonefacesoft.pictogramslibrary.PictogramsLibraryGroup;
import com.stonefacesoft.pictogramslibrary.PictogramsLibraryPictogram;
import com.stonefacesoft.pictogramslibrary.view.GroupView;
import com.stonefacesoft.pictogramslibrary.view.PictoView;

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

    private GroupView groupView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        PictogramsLibraryGroup pictogramsLibraryGroup =new PictogramsLibraryGroup("hola","hello",getResources().getDrawable(R.mipmap.ic_launcher),0,"es");
        PictogramsLibraryPictogram pictogramsLibraryPictogram =new PictogramsLibraryPictogram("hola","hello",getResources().getDrawable(R.mipmap.ic_launcher_round),1,2,"es");
        groupView=findViewById(R.id.pictogram0);
        groupView.loadDrawable(R.mipmap.ic_launcher);
        groupView.setPictogramsLibraryGroup(pictogramsLibraryGroup);
        PictoView pictogramsView=findViewById(R.id.pictogram1);
        pictogramsView.setPictogramsLibraryPictogram(pictogramsLibraryPictogram);



    }


}

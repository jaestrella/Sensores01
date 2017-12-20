package com.iesvirgendelcarmen.dam.sensores01;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Sensores01 extends AppCompatActivity {
    private TextView salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensores01);

        salida=(TextView)findViewById(R.id.salida);

        SensorManager sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor>listaSensores=sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(Sensor sensor:listaSensores){
            salida.append(sensor.getName()+"\n");
        }
    }
}

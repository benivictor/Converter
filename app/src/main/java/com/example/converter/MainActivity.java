package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.converter.divisa.Divisa;
import com.example.converter.longitud.Longitud;
import com.example.converter.temperatura.Temperatura;
import com.example.converter.tiempo.Tiempo;
import com.example.converter.masa.Masa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void masa(View view){
            Intent masa = new Intent(this, Masa.class);
            startActivity(masa);
    }

    public void tiempo(View view){
        Intent tiempo = new Intent(this, Tiempo.class);
        startActivity(tiempo);
    }

    public void divisa(View view){
        Intent divisa = new Intent(this, Divisa.class);
        startActivity(divisa);
    }

    public void longitud(View view){
        Intent longitud = new Intent(this, Longitud.class);
        startActivity(longitud);
    }

    public void temperatura(View view){
        Intent temperatura = new Intent(this, Temperatura.class);
        startActivity(temperatura);
    }

}
package com.example.converter.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Celsius extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius);

        Intent intent = getIntent();
        Double celsiu = Double.parseDouble(intent.getStringExtra("Celsius"));
        // Celsius
        TextView celsius = findViewById(R.id.textView175);
        celsius.setText(celsiu.toString());

        // Fahrenheit
        TextView Fahrenheit = findViewById(R.id.textView176);
        Fahrenheit.setText(toFahrenheit(celsiu));

        // Kelvin
        TextView kelvin = findViewById(R.id.textView177);
        kelvin.setText(toKelvin(celsiu));

    }

    private String toKelvin(Double celsius){
        Double conversion = celsius+273.15;
        return conversion.toString();
    }

    private String toFahrenheit(Double celsius){
        Double conversion = ((celsius*(9/5))+32);
        return conversion.toString();
    }
}
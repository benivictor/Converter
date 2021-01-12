package com.example.converter.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Kelvin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);

        Intent intent = getIntent();
        Double kelvines = Double.parseDouble(intent.getStringExtra("Kelvin"));
        // Celsius
        TextView celsiu = findViewById(R.id.textView169);
        celsiu.setText(toCelsius(kelvines));

        // Fahrenheit
        TextView Fahrenheit = findViewById(R.id.textView170);
        Fahrenheit.setText(toFahrenheit(kelvines));

        // Kelvin
        TextView kelvin = findViewById(R.id.textView171);
        kelvin.setText(kelvines.toString());

    }

    private String toCelsius(Double kelvin){
        Double conversion = kelvin-273.15;
        return conversion.toString();
    }

    private String toFahrenheit(Double kelvin){
        Double conversion = ((kelvin-273.15)*(9/5)+32);
        return conversion.toString();
    }

}
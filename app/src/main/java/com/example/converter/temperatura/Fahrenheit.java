 package com.example.converter.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

 public class Fahrenheit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);

        Intent intent = getIntent();
        Double faren = Double.parseDouble(intent.getStringExtra("Fahrenheit"));
        // Celsius
        TextView celsius = findViewById(R.id.textView181);
        celsius.setText(toCelsius(faren));

        // Fahrenheit
        TextView Fahrenheit = findViewById(R.id.textView182);
        Fahrenheit.setText(faren.toString());

        // Kelvin
        TextView kelvin = findViewById(R.id.textView183);
        kelvin.setText(toKelvin(faren));

    }

     private String toKelvin(Double fahrenheit){
         Double conversion = ((fahrenheit-32)*(5/9)+273.15);
         return conversion.toString();
     }

     private String toCelsius(Double fahrenheit){
         Double conversion = ((fahrenheit-32)*(5/9));
         return conversion.toString();
    }
}
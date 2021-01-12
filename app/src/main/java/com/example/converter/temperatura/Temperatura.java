package com.example.converter.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.converter.R;
import com.example.converter.masa.Gramo;
import com.example.converter.masa.Libra;
import com.example.converter.masa.Quilate;

public class Temperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);
    }

    public void fahrenheit(View view){
        Intent fahrenheit = new Intent(this, Fahrenheit.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        fahrenheit.putExtra("Fahrenheit", valor);
        startActivity(fahrenheit);
    }

    public void celsius(View view){
        Intent celsius = new Intent(this, Celsius.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        celsius.putExtra("Celsius", valor);
        startActivity(celsius);
    }

    public void kelvin(View view){
        Intent kelvin = new Intent(this, Kelvin.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        kelvin.putExtra("Kelvin", valor);
        startActivity(kelvin);
    }
}
package com.example.converter.masa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Libra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libra);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double libras = Double.parseDouble(intent.getStringExtra("Libra"));
        // Kilo
        TextView kilos = findViewById(R.id.textView23);
        kilos.setText(toKilos(libras));

        // Gramo
        TextView gramo = findViewById(R.id.textView24);
        gramo.setText(toGramos(libras));

        // Libra
        TextView libra = findViewById(R.id.textView25);
        libra.setText(libras.toString());

        // Quilate
        TextView quilates = findViewById(R.id.textView26);
        quilates.setText(toQuilate(libras));
    }

    private String toKilos(Double libras){
        Double conversion = libras*0.45359237;
        return conversion.toString();
    }

    private String toGramos(Double libras){
        Double conversion = (libras*453.59237);
        return conversion.toString();
    }

    private String toQuilate(Double libras){
        Double conversion = (libras*2267.96185);
        return conversion.toString();
    }
}
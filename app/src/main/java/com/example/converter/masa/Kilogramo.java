package com.example.converter.masa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Kilogramo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogramo);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double kilos = Double.parseDouble(intent.getStringExtra("Kilo"));
        // Kilo
        TextView kilogramo = findViewById(R.id.textView7);
        kilogramo.setText(kilos.toString());

        // Gramo
        TextView gramo = findViewById(R.id.textView8);
        gramo.setText(toGramos(kilos));

        // Libra
        TextView libras = findViewById(R.id.textView9);
        libras.setText(toLibras(kilos));

        // Quilate
        TextView quilates = findViewById(R.id.textView11);
        quilates.setText(toQuilate(kilos));
    }

    private String toGramos(Double kilo){
        Double conversion = kilo*1000;
        return conversion.toString();
    }

    private String toLibras(Double kilo){
        Double conversion = (kilo*2.2046226218);
        return conversion.toString();
    }

    private String toQuilate(Double kilo){
        Double conversion = (kilo*5000);
        return conversion.toString();
    }
}
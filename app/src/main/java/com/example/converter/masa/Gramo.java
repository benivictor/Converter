package com.example.converter.masa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Gramo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramo);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double gramos = Double.parseDouble(intent.getStringExtra("Gramo"));

        // Kilogramo
        TextView kilos = findViewById(R.id.textView15);
        kilos.setText(toKilos(gramos));

        // Gramo
        TextView gramo = findViewById(R.id.textView16);
        gramo.setText(gramos.toString());

        // Libra
        TextView libras = findViewById(R.id.textView17);
        libras.setText(toLibras(gramos));

        // Quilate
        TextView quilates = findViewById(R.id.textView18);
        quilates.setText(toQuilate(gramos));
    }

    private String toKilos(Double gramo){
        Double conversion = gramo/1000;
        return conversion.toString();
    }

    private String toLibras(Double gramo){
        Double conversion = (gramo*0.0022046226);
        return conversion.toString();
    }

    private String toQuilate(Double gramo){
        Double conversion = (gramo*5);
        return conversion.toString();
    }
}
package com.example.converter.masa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Quilate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quilate);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double quilates = Double.parseDouble(intent.getStringExtra("Quilate"));

        // Kilogramo
        TextView kilos = findViewById(R.id.textView31);
        kilos.setText(toKilos(quilates));

        // Gramo
        TextView gramo = findViewById(R.id.textView32);
        gramo.setText(toGramo(quilates));

        // Libra
        TextView libras = findViewById(R.id.textView33);
        libras.setText(toLibras(quilates));

        // Quilate
        TextView quilate = findViewById(R.id.textView34);
        quilate.setText(quilates.toString());
    }

    private String toKilos(Double quilate){
        Double conversion = quilate*0.0002;
        return conversion.toString();
    }

    private String toGramo(Double quilate){
        Double conversion = (quilate*0.2);
        return conversion.toString();
    }

    private String toLibras(Double quilate){
        Double conversion = (quilate*0.0004409245);
        return conversion.toString();
    }

}
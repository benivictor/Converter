package com.example.converter.divisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Dolar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        Intent intent = getIntent();
        Double dolares = Double.parseDouble(intent.getStringExtra("Dolar"));
        // Euro
        TextView euro = findViewById(R.id.textView146);
        euro.setText(toEuro(dolares));

        // Dolar
        TextView dolar = findViewById(R.id.textView147);
        dolar.setText(dolares.toString());

        // Libra
        TextView libra = findViewById(R.id.textView148);
        libra.setText(toLibra(dolares));

        // Yen
        TextView yen = findViewById(R.id.textView149);
        yen.setText(toYen(dolares));
    }

    private String toLibra(Double dolar){
        Double conversion = dolar*0.7395;
        return conversion.toString();
    }

    private String toYen(Double dolar){
        Double conversion = (dolar*104.1327);
        return conversion.toString();
    }

    private String toEuro(Double dolar){
        Double conversion = (dolar*0.8223);
        return conversion.toString();
    }
}
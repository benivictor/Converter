package com.example.converter.divisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Euro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        Intent intent = getIntent();
        Double euros = Double.parseDouble(intent.getStringExtra("Euro"));
        // Euro
        TextView euro = findViewById(R.id.textView138);
        euro.setText(euros.toString());

        // Dolar
        TextView dolar = findViewById(R.id.textView139);
        dolar.setText(toDolar(euros));

        // Libra
        TextView libra = findViewById(R.id.textView140);
        libra.setText(toLibra(euros));

        // Yen
        TextView yen = findViewById(R.id.textView141);
        yen.setText(toYen(euros));
    }

    private String toLibra(Double euros){
        Double conversion = euros*0.8993;
        return conversion.toString();
    }

    private String toYen(Double euros){
        Double conversion = (euros*126.6324);
        return conversion.toString();
    }

    private String toDolar(Double euros){
        Double conversion = (euros*1.2161);
        return conversion.toString();
    }
}
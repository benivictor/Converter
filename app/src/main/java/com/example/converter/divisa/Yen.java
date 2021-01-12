package com.example.converter.divisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Yen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yen);

        Intent intent = getIntent();
        Double yenes = Double.parseDouble(intent.getStringExtra("Yen"));
        // Euro
        TextView euro = findViewById(R.id.textView162);
        euro.setText(toEuro(yenes));

        // Dolar
        TextView dolar = findViewById(R.id.textView163);
        dolar.setText(toDolar(yenes));

        // Libra
        TextView libra = findViewById(R.id.textView164);
        libra.setText(toLibra(yenes));

        // Yen
        TextView yen = findViewById(R.id.textView165);
        yen.setText(yenes.toString());
    }

    private String toDolar(Double yen){
        Double conversion = yen/104.1327;
        return conversion.toString();
    }

    private String toLibra(Double yen){
        Double conversion = (yen/140.8178);
        return conversion.toString();
    }

    private String toEuro(Double yen){
        Double conversion = (yen/126.6324);
        return conversion.toString();
    }
}
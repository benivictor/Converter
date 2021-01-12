package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Yarda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yarda);
        Intent intent = getIntent();
        Double yardas = Double.parseDouble(intent.getStringExtra("Yarda"));
        // Kilometro
        TextView kilometro = findViewById(R.id.textView113);
        kilometro.setText(toKilometro(yardas));

        // Metro
        TextView metro = findViewById(R.id.textView114);
        metro.setText(toMetro(yardas));

        // Milla
        TextView milla = findViewById(R.id.textView115);
        milla.setText(toMilla(yardas));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView116);
        millaNautica.setText(toMillaNautica(yardas));

        // Yarda
        TextView yarda = findViewById(R.id.textView117);
        yarda.setText(yardas.toString());

        // Pulgada
        TextView pulgada = findViewById(R.id.textView118);
        pulgada.setText(toPulgadas(yardas));

        // Pie
        TextView pie = findViewById(R.id.textView119);
        pie.setText(toPie(yardas));
    }

    private String toKilometro(Double yardas){
        Double conversion = yardas*0.0009144;
        return conversion.toString();
    }

    private String toMetro(Double yardas){
        Double conversion = yardas*0.9144;
        return conversion.toString();
    }

    private String toMilla(Double yardas){
        Double conversion = yardas*0.0005681818;
        return conversion.toString();
    }

    private String toMillaNautica(Double yardas){
        Double conversion = yardas *0.0004937365;
        return conversion.toString();
    }

    private String toPulgadas(Double yardas){
        Double conversion = yardas*36;
        return conversion.toString();
    }

    private String toPie(Double yardas){
        Double conversion = yardas*3;
        return conversion.toString();
    }
}
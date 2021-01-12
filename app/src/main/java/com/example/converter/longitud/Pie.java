package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Pie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        Intent intent = getIntent();
        Double pies = Double.parseDouble(intent.getStringExtra("Pie"));
        // Kilometro
        TextView kilometro = findViewById(R.id.textView127);
        kilometro.setText(toKilometro(pies));

        // Metro
        TextView metro = findViewById(R.id.textView128);
        metro.setText(toMetro(pies));

        // Milla
        TextView milla = findViewById(R.id.textView129);
        milla.setText(toMilla(pies));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView130);
        millaNautica.setText(toMillaNautica(pies));

        // Yarda
        TextView yarda = findViewById(R.id.textView131);
        yarda.setText(toYarda(pies));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView132);
        pulgada.setText(toPulgadas(pies));

        // Pie
        TextView pie = findViewById(R.id.textView133);
        pie.setText(toYarda(pies));
    }

    private String toKilometro(Double pies){
        Double conversion = pies*0.0003048;
        return conversion.toString();
    }

    private String toMetro(Double pies){
        Double conversion = pies*0.3048;
        return conversion.toString();
    }

    private String toMilla(Double pies){
        Double conversion = pies*0.0001893939;
        return conversion.toString();
    }

    private String toMillaNautica(Double pies){
        Double conversion = pies *0.0001645788;
        return conversion.toString();
    }

    private String toPulgadas(Double pies){
        Double conversion = pies*12;
        return conversion.toString();
    }

    private String toYarda(Double pies){
        Double conversion = pies*0.3333333333334;
        return conversion.toString();
    }
}
package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Milla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milla);

        Intent intent = getIntent();
        Double millas = Double.parseDouble(intent.getStringExtra("Milla"));
        // Kilometro
        TextView kilometro = findViewById(R.id.textView85);
        kilometro.setText(toKilometro(millas));

        // Metro
        TextView metro = findViewById(R.id.textView86);
        metro.setText(toMetro(millas));

        // Milla
        TextView milla = findViewById(R.id.textView87);
        milla.setText(millas.toString());

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView88);
        millaNautica.setText(toMillaNautica(millas));

        // Yarda
        TextView yarda = findViewById(R.id.textView89);
        yarda.setText(toYarda(millas));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView90);
        pulgada.setText(toPulgada(millas));

        // Pie
        TextView pie = findViewById(R.id.textView91);
        pie.setText(toPie(millas));
    }

    private String toKilometro(Double millas){
        Double conversion = millas*1.609344;
        return conversion.toString();
    }

    private String toMetro(Double millas){
        Double conversion = millas*1609.344;
        return conversion.toString();
    }

    private String toPulgada(Double pulgada){
        Double conversion = pulgada*63360;
        return conversion.toString();
    }

    private String toYarda(Double pulgada){
        Double conversion = pulgada*1760;
        return conversion.toString();
    }

    private String toMillaNautica(Double pulgada){
        Double conversion = pulgada*0.8689762419;
        return conversion.toString();
    }

    private String toPie(Double milla){
        Double conversion = milla*5280;
        return conversion.toString();
    }
}
package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Pulgada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulgada);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Double pulgadas = Double.parseDouble(intent.getStringExtra("Pulgada"));
        // Kilometro
        TextView kilometro = findViewById(R.id.textView57);
        kilometro.setText(toKilometro(pulgadas));

        // Metro
        TextView metro = findViewById(R.id.textView58);
        metro.setText(toMetro(pulgadas));

        // Milla
        TextView milla = findViewById(R.id.textView59);
        milla.setText(toMilla(pulgadas));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView60);
        millaNautica.setText(toMillaNautica(pulgadas));

        // Yarda
        TextView yarda = findViewById(R.id.textView61);
        yarda.setText(toYarda(pulgadas));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView62);
        pulgada.setText(pulgadas.toString());

        // Pie
        TextView pie = findViewById(R.id.textView63);
        pie.setText(toPie(pulgadas));
    }

    private String toKilometro(Double pulgada){
        Double conversion = pulgada*0.0000254;
        return conversion.toString();
    }

    private String toMetro(Double pulgada){
        Double conversion = pulgada*0.0254;
        return conversion.toString();
    }

    private String toMilla(Double pulgada){
        Double conversion = pulgada*0.0000157828;
        return conversion.toString();
    }

    private String toYarda(Double pulgada){
        Double conversion = pulgada*0.0277777778;
        return conversion.toString();
    }

    private String toMillaNautica(Double pulgada){
        Double conversion = pulgada*0.0000137149;
        return conversion.toString();
    }

    private String toPie(Double pulgada){
        Double conversion = pulgada*0.0833333333;
        return conversion.toString();
    }

}
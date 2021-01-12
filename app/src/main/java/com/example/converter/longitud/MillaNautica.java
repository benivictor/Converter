package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class MillaNautica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_millanautica);
        Intent intent = getIntent();
        Double millasNauticas = Double.parseDouble(intent.getStringExtra("MillaNautica"));
        // Kilometro
        TextView kilometro = findViewById(R.id.textView99);
        kilometro.setText(toKilometro(millasNauticas));

        // Metro
        TextView metro = findViewById(R.id.textView100);
        metro.setText(toMetro(millasNauticas));

        // Milla
        TextView milla = findViewById(R.id.textView101);
        milla.setText(toMilla(millasNauticas));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView102);
        millaNautica.setText(millaNautica.toString());

        // Yarda
        TextView yarda = findViewById(R.id.textView103);
        yarda.setText(toYarda(millasNauticas));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView104);
        pulgada.setText(toPulgadas(millasNauticas));

        // Pie
        TextView pie = findViewById(R.id.textView105);
        pie.setText(toPie(millasNauticas));
    }

    private String toKilometro(Double millaNautica){
        Double conversion = millaNautica*1.852;
        return conversion.toString();
    }

    private String toMetro(Double millaNautica){
        Double conversion = millaNautica*1852;
        return conversion.toString();
    }

    private String toMilla(Double millaNautica){
        Double conversion = millaNautica*1.150779448;
        return conversion.toString();
    }

    private String toYarda(Double millaNautica){
        Double conversion = millaNautica*2.0253718285*1000;
        return conversion.toString();
    }

    private String toPulgadas(Double millaNautica){
        Double conversion = millaNautica*7.2913385827*10000;
        return conversion.toString();
    }

    private String toPie(Double millaNautica){
        Double conversion = millaNautica*6.0761154856*1000;
        return conversion.toString();
    }
}
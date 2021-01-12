package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Kilometro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometro);

        Intent intent = getIntent();
        Double kilometros = Double.parseDouble(intent.getStringExtra("Kilometro"));

        // Kilometro
        TextView kilometro = findViewById(R.id.textView43);
        kilometro.setText(kilometros.toString());

        // Metro
        TextView metro = findViewById(R.id.textView44);
        metro.setText(toMetro(kilometros));

        // Milla
        TextView milla = findViewById(R.id.textView45);
        milla.setText(toMilla(kilometros));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView46);
        millaNautica.setText(toMillaNautica(kilometros));

        // Yarda
        TextView yarda = findViewById(R.id.textView47);
        yarda.setText(toYarda(kilometros));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView48);
        pulgada.setText(toPulgadas(kilometros));

        // Pie
        TextView pie = findViewById(R.id.textView49);
        pie.setText(toPie(kilometros));
    }



    private String toMetro(Double kilometros){
        Double conversion = kilometros*1000;
        return conversion.toString();
    }

    private String toMilla(Double kilometros){
        Double conversion = kilometros*0.6213711922;
        return conversion.toString();
    }

    private String toYarda(Double kilometros){
        Double conversion = kilometros*1.0936132983*1000;
        return conversion.toString();
    }

    private String toMillaNautica(Double kilometros){
        Double conversion = kilometros*0.5399568035;
        return conversion.toString();
    }

    private String toPulgadas(Double kilometros){
        Double conversion = kilometros*3.937007874*10000;
        return conversion.toString();
    }
    private String toPie(Double kilometros){
        Double conversion = kilometros*3.280839895*1000;
        return conversion.toString();
    }
}
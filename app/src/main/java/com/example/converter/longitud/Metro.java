package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class Metro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);

        Intent intent = getIntent();
        Double metros = Double.parseDouble(intent.getStringExtra("Metro"));

        // Kilometro
        TextView kilometro = findViewById(R.id.textView71);
        kilometro.setText(toKilometro(metros));

        // Metro
        TextView metro = findViewById(R.id.textView72);
        metro.setText(metros.toString());

        // Milla
        TextView milla = findViewById(R.id.textView77);
        milla.setText(toMilla(metros));

        // MillaNautica
        TextView millaNautica = findViewById(R.id.textView73);
        millaNautica.setText(toMillaNautica(metros));

        // Yarda
        TextView yarda = findViewById(R.id.textView74);
        yarda.setText(toYarda(metros));

        // Pulgada
        TextView pulgada = findViewById(R.id.textView75);
        pulgada.setText(toPulgadas(metros));

        // Pie
        TextView pie = findViewById(R.id.textView76);
        pie.setText(toPie(metros));
    }



    private String toKilometro(Double metros){
        Double conversion = metros/1000;
        return conversion.toString();
    }

    private String toMilla(Double metros){
        Double conversion = metros*0.0006213711922;
        return conversion.toString();
    }

    private String toYarda(Double metros){
        Double conversion = metros*1.0936132983;
        return conversion.toString();
    }

    private String toMillaNautica(Double metros){
        Double conversion = metros*0.0005399568035;
        return conversion.toString();
    }

    private String toPulgadas(Double metros){
        Double conversion = metros*3.937007874*10;
        return conversion.toString();
    }
    private String toPie(Double metros){
        Double conversion = metros*3.280839895;
        return conversion.toString();
    }
}
package com.example.converter.divisa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.converter.R;

public class LibraEsterlina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libraesterlina);

        Intent intent = getIntent();
        Double libras = Double.parseDouble(intent.getStringExtra("Libra"));
        // Euro
        TextView euro = findViewById(R.id.textView154);
        euro.setText(toEuro(libras));

        // Dolar
        TextView dolar = findViewById(R.id.textView155);
        dolar.setText(toDolar(libras));

        // Libra
        TextView libra = findViewById(R.id.textView156);
        libra.setText(libras.toString());

        // Yen
        TextView yen = findViewById(R.id.textView157);
        yen.setText(toYen(libras));
    }

    private String toDolar(Double libra){
        Double conversion = libra*1.3523;
        return conversion.toString();
    }

    private String toYen(Double libra){
        Double conversion = (libra*140.8178);
        return conversion.toString();
    }

    private String toEuro(Double libra){
        Double conversion = (libra*1.112);
        return conversion.toString();
    }
}
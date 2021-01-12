package com.example.converter.longitud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.converter.R;
import com.example.converter.masa.Gramo;
import com.example.converter.masa.Kilogramo;
import com.example.converter.masa.Libra;
import com.example.converter.masa.Quilate;

public class Longitud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);
    }

    public void metro(View view){
        Intent metro = new Intent(this, Metro.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        metro.putExtra("Metro", valor);
        startActivity(metro);
    }

    public void kilometro(View view){
        Intent kilometro = new Intent(this, Kilometro.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        kilometro.putExtra("Kilometro", valor);
        startActivity(kilometro);
    }

    public void milla(View view){
        Intent milla = new Intent(this, Milla.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        milla.putExtra("Milla", valor);
        startActivity(milla);
    }

    public void yarda(View view){
        Intent yarda = new Intent(this, Yarda.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        yarda.putExtra("Yarda", valor);
        startActivity(yarda);
    }

    public void millaNautica(View view){
        Intent millaNautica = new Intent(this, MillaNautica.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        millaNautica.putExtra("MillaNautica", valor);
        startActivity(millaNautica);
    }

    public void pulgada(View view){
        Intent pulgada = new Intent(this, Pulgada.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        pulgada.putExtra("Pulgada", valor);
        startActivity(pulgada);
    }

    public void pie(View view){
        Intent pie = new Intent(this, Pie.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal2);
        String valor = editText.getText().toString();
        pie.putExtra("Pie", valor);
        startActivity(pie);
    }
}
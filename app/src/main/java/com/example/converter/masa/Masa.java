package com.example.converter.masa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.converter.R;

public class Masa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);
    }

    public void kilogramo(View view){
        Intent kilogramo = new Intent(this, Kilogramo.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        kilogramo.putExtra("Kilo", valor);
        startActivity(kilogramo);
    }

    public void gramo(View view){
        Intent gramo = new Intent(this, Gramo.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        gramo.putExtra("Gramo", valor);
        startActivity(gramo);
    }

    public void libra(View view){
        Intent libra = new Intent(this, Libra.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        libra.putExtra("Libra", valor);
        startActivity(libra);
    }

    public void quilates(View view){
        Intent quilate = new Intent(this, Quilate.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal4);
        String valor = editText.getText().toString();
        quilate.putExtra("Quilate", valor);
        startActivity(quilate);
    }

}
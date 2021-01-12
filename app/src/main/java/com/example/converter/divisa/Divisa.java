package com.example.converter.divisa;

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

public class Divisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisa);
    }

    public void euro(View view){
        Intent euro = new Intent(this, Euro.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal3);
        String valor = editText.getText().toString();
        euro.putExtra("Euro", valor);
        startActivity(euro);
    }

    public void dolar(View view){
        Intent dolar = new Intent(this, Dolar.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal3);
        String valor = editText.getText().toString();
        dolar.putExtra("Dolar", valor);
        startActivity(dolar);
    }

    public void libraEsterlina(View view){
        Intent libraEsterlina = new Intent(this, LibraEsterlina.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal3);
        String valor = editText.getText().toString();
        libraEsterlina.putExtra("LibraEsterlina", valor);
        startActivity(libraEsterlina);
    }

    public void yen(View view){
        Intent yen = new Intent(this, Yen.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal3);
        String valor = editText.getText().toString();
        yen.putExtra("Yen", valor);
        startActivity(yen);
    }
}
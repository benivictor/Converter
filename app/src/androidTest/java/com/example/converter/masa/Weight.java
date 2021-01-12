package com.example.converter.masa;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.converter.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kgToPb(View view){
        Intent intent = new Intent(this, Kilogramos.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}

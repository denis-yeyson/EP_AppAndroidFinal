package com.denisyeyson.ep_appandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explicito extends AppCompatActivity {

    Button pantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicito);

        pantalla = findViewById(R.id.btnPantalla);

        pantalla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Explicito.this, ImagenPaisaje.class);
                startActivity(intent3);
            }
        });
    }
}
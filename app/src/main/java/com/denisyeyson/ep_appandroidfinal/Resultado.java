package com.denisyeyson.ep_appandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView nombres, apellidos,genero,edad,direccion,telefono;
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nombres = findViewById(R.id.lblNombres);
        apellidos = findViewById(R.id.lblApellidos);
        genero = findViewById(R.id.lblGenero);
        edad = findViewById(R.id.lblEdad);
        direccion = findViewById(R.id.lblDireccion);
        telefono = findViewById(R.id.lblTelefono);
        atras = findViewById(R.id.btnAtras3);

        Bundle receptor = getIntent().getExtras();
        String nom = receptor.getString("NOMBRES");
        String ape = receptor.getString("APELLIDOS");
        String gen = receptor.getString("GENERO");
        String eda = receptor.getString("EDAD");
        String dir = receptor.getString("DIRECCION");
        String tel = receptor.getString("TELEFONO");

        nombres.setText("Nombre: "+ nom);
        apellidos.setText("Apellido: "+ape);
        genero.setText("Genero: "+ gen);
        edad.setText("Edad: "+eda);
        direccion.setText("Direccion: "+ dir);
        telefono.setText("Telefono: "+tel);

        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
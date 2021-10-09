package com.denisyeyson.ep_appandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {
    EditText nombres, apellidos, genero, edad, direccion, telefono;
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nombres = findViewById(R.id.txtNombres);
        apellidos = findViewById(R.id.txtApellidos);
        genero = findViewById(R.id.txtGenero);
        edad = findViewById(R.id.txtEdad);
        direccion = findViewById(R.id.txtDireccion);
        telefono = findViewById(R.id.txtTelefono);
        ingresar = findViewById(R.id.btnEnviar);

        ingresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String nom = nombres.getText().toString();
                String ape = apellidos.getText().toString();
                String gen = genero.getText().toString();
                String eda = edad.getText().toString();
                String dir = direccion.getText().toString();
                String tel = telefono.getText().toString();

                Intent intent = new Intent(Formulario.this, Resultado.class);
                intent.putExtra("NOMBRES",nom);
                intent.putExtra("APELLIDOS",ape);
                intent.putExtra("GENERO",gen);
                intent.putExtra("EDAD",eda);
                intent.putExtra("DIRECCION",dir);
                intent.putExtra("TELEFONO",tel);
                startActivity(intent);
            }
    });
    }

}
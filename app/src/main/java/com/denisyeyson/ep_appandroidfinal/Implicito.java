package com.denisyeyson.ep_appandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Implicito extends AppCompatActivity {
    Button google, youtube,maps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicito);

        google = findViewById(R.id.btnGoolgle);
        youtube = findViewById(R.id.btnYoutube);
        maps = findViewById(R.id.btnMaps);

        google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent implicito = new Intent(Intent.ACTION_VIEW);
                implicito.setData(Uri.parse("https://www.google.com.pe"));
                startActivity(implicito);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=tgZJvW32K-Y"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        maps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:<11.8726542>,<-77.0219015>?q=<11.8726542>,<-77.0219015>(15z)"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=tgZJvW32K-Y"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });
    }
}
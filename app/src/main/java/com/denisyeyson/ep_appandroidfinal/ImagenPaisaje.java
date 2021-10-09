package com.denisyeyson.ep_appandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class ImagenPaisaje extends AppCompatActivity {
    ImageView imagenpantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_paisaje);
        imagenpantalla= findViewById(R.id.imageView2);
        Uri imgUri=Uri.parse("https://i.imgur.com/cHtRCm1.jpg");
        imagenpantalla.setImageURI(imgUri);
    }
}
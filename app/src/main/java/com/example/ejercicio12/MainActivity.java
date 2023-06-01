package com.example.ejercicio12;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int DELAY_MILLIS = 3000; // 3 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrasar la transición a la siguiente actividad después de 3 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Iniciar la segunda actividad
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                finish(); // Finalizar la actividad actual para que no se pueda volver atrás
            }
        }, DELAY_MILLIS);
    }
}

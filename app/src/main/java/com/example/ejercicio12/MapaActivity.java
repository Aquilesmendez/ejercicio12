package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MapaActivity extends AppCompatActivity {

    private ImageView mapImageView;

    private TextView addressTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        mapImageView = findViewById(R.id.mapImageView);
        addressTextView = findViewById(R.id.addressTextView);

        String restaurantAddress = getIntent().getStringExtra("address");
        addressTextView.setText(restaurantAddress);
    }
}

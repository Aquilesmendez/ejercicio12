package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private ListView dishListView;
    private ArrayAdapter<Dish> dishAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dishListView = findViewById(R.id.dishListView);

        // Crear una lista de platos
        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish("La Hamburgueseria", R.drawable.hamburguesa, "Los Almendros 4444", "Ranchero", "9500"));
        dishList.add(new Dish("Pizza Steve", R.drawable.pizza, "Los Cedros 2222", "4 Estaciones", "14000"));
        dishList.add(new Dish("Sushi Moto", R.drawable.sushi, "jupiter 5555", "hebi roll", "4500"));
        dishList.add(new Dish("Cesar Ensalada", R.drawable.ensalada, "Los Poetas 456", "Ensalaa Julio", "8000"));
        dishList.add(new Dish("Pasta al Dente", R.drawable.pasta, "avenida cinco 7845", "Fontanna", "14000"));

        // Crear el adaptador personalizado
        dishAdapter = new ArrayAdapter<Dish>(this, R.layout.list_item_dish, dishList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.list_item_dish, parent, false);
                }

                Dish dish = getItem(position);

                TextView nameTextView = convertView.findViewById(R.id.nameTextView);
                ImageView imageView = convertView.findViewById(R.id.imageView);
                TextView menuTextView = convertView.findViewById(R.id.menuTextView);
                TextView priceTextView = convertView.findViewById(R.id.priceTextView);

                nameTextView.setText(dish.getName());
                imageView.setImageResource(dish.getImageResId());
                menuTextView.setText(dish.getMenu());
                priceTextView.setText(dish.getPrice());


                return convertView;
            }
        };

        dishListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dish selectedDish = dishAdapter.getItem(position);
                String restaurantAddress = selectedDish.getAddress();

                Intent intent = new Intent(SecondActivity.this, MapaActivity.class);
                intent.putExtra("address", restaurantAddress);
                startActivity(intent);
            }
        });

        // Asignar el adaptador a la ListView
        dishListView.setAdapter(dishAdapter);
    }
}

package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
        dishList.add(new Dish("La Hamburgueseria", R.drawable.hamburguesa));
        dishList.add(new Dish("Pizza Steve", R.drawable.pizza));
        dishList.add(new Dish("Sushi Moto", R.drawable.sushi));
        dishList.add(new Dish("Cesar Ensalada", R.drawable.ensalada));
        dishList.add(new Dish("Pasta al Dente", R.drawable.pasta));

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

                nameTextView.setText(dish.getName());
                imageView.setImageResource(dish.getImageResId());

                return convertView;
            }
        };

        // Asignar el adaptador a la ListView
        dishListView.setAdapter(dishAdapter);
    }
}

package com.example.kevin4k;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });


    }
    public void sortear(View view) {
        int numero = new Random().nextInt(5);

        TextView textResultado = findViewById(R.id.textResultado);

        if(numero == 0) {
            textResultado.setText("Parabensssssss");
        } else if(numero == 1){
            textResultado.setText("I am mui guapo");
        } else if(numero == 2){
            textResultado.setText("soy lindo");
        } else if(numero == 3){
            textResultado.setText("pq deus me fez tao lindo");
        } else if(numero == 4){
            textResultado.setText("tenho medo de mulher bonita");
        }

    }

}
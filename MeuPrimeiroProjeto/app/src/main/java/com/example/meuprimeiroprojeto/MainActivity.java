package com.example.meuprimeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aleatorizaNum(View view){

        Random rand = new Random();

        int numRandom = rand.nextInt(11);

        String numRand = Integer.toString(numRandom);

        TextView texto = findViewById(R.id.resultado);
        texto.setText(numRand);

    }
}

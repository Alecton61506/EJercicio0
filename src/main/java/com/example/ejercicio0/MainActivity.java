package com.example.ejercicio0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Myboton;
    private EditText Mientrada;
    private TextView Misalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Myboton = findViewById(R.id.button);
        Mientrada = findViewById(R.id.editText1);
        Misalida = findViewById(R.id.textView);
        Myboton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                String Nombre = Mientrada.getText().toString();
                Misalida.setText("Hola " + Nombre+"!!!");
            }


        });

    }
}
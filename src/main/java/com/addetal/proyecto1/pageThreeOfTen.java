package com.addetal.proyecto1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pageThreeOfTen extends AppCompatActivity {


    String numero1 = "";
    EditText etc;
    Button button2;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three_of_ten);
        etc = findViewById(R.id.numberWrite);

        button2= findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent( pageThreeOfTen.this, MainActivity.class);
                startActivity(i);
            }

        });



    }

    public void escribirUno(View view) {
        numero1 = numero1 + "1";
             display(numero1);

    }
    public void escribirDos(View view) {
        numero1 = numero1 + "2";
        display(numero1);
    }
    public void escribirTres(View view) {
        numero1 = numero1 + "3";
        display(numero1);
    }
    public void escribirCuatro(View view) {
        numero1 = numero1 + "4";
        display(numero1);
    }
    public void escribirCinco(View view) {
        numero1 = numero1 + "5";
        display(numero1);
    }
    public void escribirSeis(View view) {
        numero1 = numero1 + "6";
        display(numero1);
    }
    public void escribirSiete(View view) {
        numero1 = numero1 + "7";
        display(numero1);
    }
    public void escribirOcho(View view) {
        numero1 = numero1 + "8";
        display(numero1);
    }
    public void escribirNueve(View view) {
        numero1 = numero1 + "9";
        display(numero1);
    }
    public void escribirCero(View view) {
        numero1 = numero1 + "0";
        display(numero1);
    }
    public void borrar(View view) {
        numero1 = "";
        display(numero1);
    }


    private void display(String s) {
        TextView numero1TextView = findViewById(R.id.numberWrite);
                numero1TextView.setText(s);

    }


    public void ok (View view){
        String s = etc.getText().toString();



        if(s.length() == 0){
            Toast.makeText( this, "Debes ingresar numero de telefono", Toast.LENGTH_LONG).show();

        }
        if(s.length() >= 11){
            Toast.makeText( this, "Maximo 10 digitos", Toast.LENGTH_LONG).show();


        }
        if(s.length() <= 9){
            Toast.makeText( this, "Deben ser 10 digitos", Toast.LENGTH_LONG).show();

        }

        if(s.length()== 10){
            Toast.makeText( this, "Registro procesando...", Toast.LENGTH_LONG).show();

        }

        if(s.length()== 10){
            Toast.makeText( this, "¡BIENVENIDO!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, activity_page_four_of_ten.class );
            startActivity( intent );




        }


    }
}
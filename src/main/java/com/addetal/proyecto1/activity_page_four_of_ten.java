package com.addetal.proyecto1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class activity_page_four_of_ten extends AppCompatActivity {

    private static final String[] DOCUMENTOS = new String[]{
            "Tarjeta de Identidad", "Cédula de ciudadanía", "Cédula de extranjería"






    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_four_of_ten);


        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, DOCUMENTOS);
        editText.setAdapter(adapter);





    }
}
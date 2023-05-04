package com.example.gymsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
            startActivity(new Intent(getApplicationContext(),Login.class));
            finish();
    }

    String[] item = {"Masculino", "Femenino"};

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_genero, item);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                autoCompleteTextView.showDropDown();
            }
        });
    }
}






package com.example.ciudades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private EditText editTextCiudad;
    private TextView textViewCiudad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCiudad = (EditText) findViewById(R.id.editTextCiudad);
        textViewCiudad = (TextView) findViewById(R.id.textViewCiudadIncompleta);
        spinner = (Spinner) findViewById(R.id.spinnerCiudades);

        String [] opciones = {"Badajoz","Mérida","Zafra","Plasencia"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String seleccion = spinner.getSelectedItem().toString();
        if (seleccion.equals("Badajoz")){
            textViewCiudad.setText("B______");
        }else if(seleccion.equals("Mérida")){
            textViewCiudad.setText("M_____");
        }else if(seleccion.equals("Zafra")){
            textViewCiudad.setText("Z____");
        }else{
            textViewCiudad.setText("P________");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
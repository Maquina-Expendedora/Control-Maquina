package com.example.controlmaquina;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Modelo.Medicina;

public class FormularioMedicina extends AppCompatActivity {
    NumberPicker numberPicker;
    TextView txtStock;
    String token=null;
    EditText editTextNombre;
    EditText editTextPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_medicina);
        numberPicker = (NumberPicker) findViewById(R.id.numPicker);
        txtStock=(TextView)findViewById(R.id.txtStock);
        editTextNombre=(EditText)findViewById(R.id.editTextNombre);
        editTextPrecio=(EditText)findViewById(R.id.editTextPrecio);
        token = getIntent().getStringExtra("llave");

        //Populate NumberPicker values from minimum and maximum value range
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(20);
        numberPicker.setWrapSelectorWheel(true);

        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                txtStock.setText("Stock : "+newVal);
            }
        });
    }

    public void nuevaMedicina(View view){
        String nombre=editTextNombre.getText().toString();
        float precio=Float.parseFloat(editTextPrecio.getText().toString());
        int stock=numberPicker.getValue();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Medicinas");
        DatabaseReference nuevaRef=myRef.push();
        String postId = nuevaRef.getKey();
        nuevaRef.setValue(new Medicina(nombre,postId,stock,precio));
        finish();

    }
}
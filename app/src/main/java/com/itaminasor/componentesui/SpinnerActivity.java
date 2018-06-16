package com.itaminasor.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import es.dmoral.toasty.Toasty;

public class SpinnerActivity extends AppCompatActivity {

    private static  final String TAG= SpinnerActivity.class.getSimpleName();

    private Spinner countrySpinner;
    private Button actionButton;
    private TextView resultadoText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        countrySpinner = findViewById(R.id.country_spinner);
        actionButton = findViewById(R.id.actionButton);
        resultadoText = findViewById(R.id.resultadoText);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                executeAction();
            }
        });

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String country = (String)parent.getItemAtPosition(position);
                String mensaje="El valor seleccionado es : " + country;
                Toasty.success(SpinnerActivity.this, mensaje, Toast.LENGTH_LONG).show();
            }
            public  void onNothingSelected (AdapterView<?>  parent){

            }

        });
    }

    private void executeAction(){
        String country= (String) countrySpinner.getSelectedItem();


        Log.d(TAG,"executeAction: "+country);

        String mensaje="El valor seleccionado es : " + country;
        resultadoText.setText(mensaje);

    }
}



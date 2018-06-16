package com.itaminasor.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class EditTextActivity extends AppCompatActivity {

    private static final String TAG=EditTextActivity.class.getSimpleName();

    private EditText nombresInput;

    private EditText apellidosInput;

    private Button generarButton;

    private TextView displayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        nombresInput= findViewById(R.id.nombres_text);
        apellidosInput= findViewById(R.id.apellidos_text);
        generarButton= findViewById(R.id.generar_button);
        displayName= findViewById(R.id.displayName);

        generarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generarUsuario();
            }
        });


    }

    public void generarUsuario(){
        Log.d(TAG, "calling  callActionOne method...");

        try{

            String nombres = nombresInput.getText().toString();
            String apellidos = apellidosInput.getText().toString();

            if (nombres.isEmpty() || apellidos.isEmpty() ){
                Toasty.success(this, "Complete todos los datos", Toast.LENGTH_SHORT, true).show();
                return;
            }

            StringBuilder sb= new StringBuilder();
            StringBuilder usuario=sb.append(nombres.substring(0,1));

            displayName.setText(usuario);

        }catch(Throwable t){
            Log.e(TAG, t.getMessage(),t);
        }

    }


}

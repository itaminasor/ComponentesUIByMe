package com.itaminasor.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MyEditTextActivity extends AppCompatActivity {


    private static final String TAG=MyEditTextActivity.class.getSimpleName();
    private EditText firstName, lastName;
    private TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_edit_text);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);
    }

    public void register(View view) {
        /*String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        if(getFirstName.length() == 0 || getLastName.length() == 0)
            displayname.setText("These fields are required");
        else
            displayname.setText("Your username is " + getFirstName + " " + getLastName);*/

        Log.d(TAG, "calling  callActionOne method...");

        try{

            String nombres = firstName.getText().toString();
            String apellidos = lastName.getText().toString();

            if (nombres.isEmpty() || apellidos.isEmpty() ){
                Log.d(TAG, "campos vacios");
                //Toasty.success(this, "Complete todos los datos", Toast.LENGTH_SHORT, true).show();
                Toast.makeText(MyEditTextActivity.this, "Veamos veamos",Toast.LENGTH_LONG).show();
                return;
            }

            StringBuilder sb= new StringBuilder();
            StringBuilder usuario=sb.append(nombres.substring(0,1));

            displayname.setText(usuario);

        }catch(Throwable t){
            Log.e(TAG, t.getMessage(),t);
        }

    }


}

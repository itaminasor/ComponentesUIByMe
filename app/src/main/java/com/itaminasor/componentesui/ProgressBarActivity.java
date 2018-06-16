package com.itaminasor.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class ProgressBarActivity extends AppCompatActivity {

    private EditText numbertext;
    private ProgressBar progressbar1;
    private ProgressBar progressbar2;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        numbertext = (EditText) findViewById(R.id.numberText);
        progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        progressbar1.setProgress(30);

        showButton = (Button) findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarValor();
            }
        });

        progressbar2 = (ProgressBar) findViewById(R.id.progressbar2);

    }

    public void show(View view){
        int value = Integer.parseInt(numbertext.getText().toString());
        progressbar1.setProgress(value);
    }


    public void mostrarValor(){
        String valor = numbertext.getText().toString();

        if (valor.isEmpty()){
            Toasty.error(this,"Indique un valor", Toast.LENGTH_LONG).show();

        }else{
            int value = Integer.parseInt(valor);
            progressbar1.setProgress(value);
        }
    }

    public void detenerAction(View view){
        progressbar2.setVisibility(View.GONE);
    }

}

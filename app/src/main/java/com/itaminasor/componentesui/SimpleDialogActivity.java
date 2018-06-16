package com.itaminasor.componentesui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class SimpleDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_dialog);
    }

    public void showDialog(View view){

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Alert Dialog Title");
        alertDialog.setMessage("Here is android alert dialog message");
        alertDialog.setCancelable(false);
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        //dialog.dismiss();// use dismiss to cancel alert dialog
                        Toasty.info(SimpleDialogActivity.this,"Selecciono OK", Toast.LENGTH_SHORT).show();
                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancelar",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        //dialog.dismiss();// use dismiss to cancel alert dialog
                        Toasty.info(SimpleDialogActivity.this,"Selecciono Cancelar", Toast.LENGTH_SHORT).show();
                    }
                });

        alertDialog.show();

    }

}

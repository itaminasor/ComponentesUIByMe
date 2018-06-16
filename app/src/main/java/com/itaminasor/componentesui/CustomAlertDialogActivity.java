package com.itaminasor.componentesui;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);
    }

    public void showDialog(View view){

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);
        // Custom Android Allert Dialog Title
        dialog.setTitle("Custom Dialog Example");

        Button customDialogOk = (Button) dialog.findViewById(R.id.customDialogOk);
        // Click cancel to dismiss android custom dialog box
        customDialogOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(CustomAlertDialogActivity.this, "Cancel process!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }


        });


        /*
        // Your android custom dialog ok action
        // Action for custom dialog ok button click
        dialogButtonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Success process!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });*/

        dialog.show();

    }
}


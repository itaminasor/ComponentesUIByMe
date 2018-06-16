package com.itaminasor.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView rateDisplay;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        rateDisplay = (TextView) findViewById(R.id.ratingDisplay);
        actionButton = (Button) findViewById(R.id.actionButton);

        rateDisplay.setText("Rate:");
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numstars = ratingBar.getNumStars();
                float rating  = ratingBar.getRating();
                Toast.makeText(getApplicationContext(), "Rate: " + rating, Toast.LENGTH_LONG).show();
            }
        });

    }

    public void rateSubmit(View view) {
        String ratingValue = String.valueOf(ratingBar.getRating());
        rateDisplay.setText("Rate: " + ratingValue);
        Toast.makeText(getApplicationContext(), "Rate: " + ratingValue, Toast.LENGTH_LONG).show();
    }
}


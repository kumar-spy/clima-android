package com.londonappbrewery.climapm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class chagneCityControlller extends AppCompatActivity {
    EditText editText;
    ImageButton BackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city_layout);
        editText=(EditText)findViewById(R.id.queryET);
        BackButton=(ImageButton)findViewById(R.id.backButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String city = editText.getText().toString();
                Intent newCityIntent = new Intent(chagneCityControlller.this,WeatherController.class);
                newCityIntent.putExtra("city",city);
                startActivity(newCityIntent);
                return false;
            }
        });

    }
}

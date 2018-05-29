package com.example.android.androidbasicsudacityprojectfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //move to Country activity
        TextView country = (TextView) findViewById(R.id.country);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });
        //move to Folk activity
        TextView folk = (TextView) findViewById(R.id.folk);
        folk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent folkIntent = new Intent(MainActivity.this, FolkActivity.class);
                startActivity(folkIntent);
            }
        });
        //move to Pop activity
        TextView pop = (TextView) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });
        //move to Rock activity
        TextView rock = (TextView) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });
    }
}

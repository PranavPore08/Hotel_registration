package com.example.hotel_registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {
    ExpandableTextView etxt1,etxt2,etxt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxt1 = (ExpandableTextView) findViewById(R.id.covid_text_view).findViewById(R.id.covid_text_view);
        etxt1.setText(getString(R.string.covid_policy));

        etxt2 = (ExpandableTextView) findViewById(R.id.privacy_text_view).findViewById(R.id.privacy_text_view);
        etxt2.setText(getString(R.string.property_policy));

        etxt3 = (ExpandableTextView) findViewById(R.id.cacellation_text_view).findViewById(R.id.cacellation_text_view);
        etxt3.setText(getString(R.string.cancellation_policy));

    }
}
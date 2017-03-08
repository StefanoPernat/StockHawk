package com.udacity.stockhawk.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udacity.stockhawk.R;

//  This is the activity that display

public class StockTrendActivity extends AppCompatActivity {

    private String mSelectedSymbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_trend);

        Intent intent = getIntent();

        if (intent != null && intent.getStringExtra(MainActivity.SYMBOL_SELECTED_EXTRA) != null){
            mSelectedSymbol = intent.getStringExtra(MainActivity.SYMBOL_SELECTED_EXTRA);
            getSupportActionBar().setTitle(getString(R.string.stock_trend_title, mSelectedSymbol));
        }
    }
}

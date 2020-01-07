package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText amount = (EditText) findViewById(R.id.amount);
        double value = Double.parseDouble(amount.getText().toString());

        double converted_amt = value * 0.014;

        String amt = String.format("%.2f", converted_amt);

        Toast.makeText(this, "$" + amt, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

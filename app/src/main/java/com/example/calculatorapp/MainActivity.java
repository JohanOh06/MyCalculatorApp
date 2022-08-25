package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double sum = num1 + num2;
            numberSumTV.setText("" + sum);
        } catch (Exception e) {
            numberSumTV.setText("" + "please enter a number");
        }
    }

    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double diff = num1 - num2;
            numberSumTV.setText("" + diff);
        } catch (Exception e) {
            numberSumTV.setText("" + "please enter a number");
        }
    }

    public void findProd(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double prod = num1 * num2;
            numberSumTV.setText("" + prod);
        } catch (Exception e) {
            numberSumTV.setText("" + "please enter a number");
        }
    }

    public void findQuot(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double num2 = Double.parseDouble((number2ET.getText().toString()));
            double quot = num1 / num2;
            numberSumTV.setText("" + quot);
        } catch (Exception e) {
            numberSumTV.setText("" + "please enter a number");
        }
    }

    public void findSquare(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            double num1 = Double.parseDouble((number1ET.getText().toString()));
            double square = num1 * num1;
            numberSumTV.setText("" + square);
        } catch (Exception e) {
            numberSumTV.setText("" + "please enter a number");
        }
    }
    public void clearAll(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        
        String num1 = " ";
        String num2 = " ";
        String clear = " ";

        numberSumTV.setText("" + clear);
    }
}
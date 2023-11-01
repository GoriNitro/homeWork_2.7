package com.example.homework_27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Double first, second, third;
    private String operation;
    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void onNumberClick(View view) {
        String textButton = ((MaterialButton) view).getText().toString();

        if (textButton.equals("AC")) {
            textView.setText("0");
            first = 0.0;
        } else if (textView.getText().toString().equals("0")|| isOperationClick) {
            textView.setText(textButton);
        } else {
            textView.append(textButton);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        String textButton = ((MaterialButton) view).getText().toString();
        switch (textButton) {
            case "÷":
                first = Double.valueOf(textView.getText().toString());
                operation = "÷";
                isOperationClick = true;
                break;
            case "x":
                first = Double.valueOf(textView.getText().toString());
                operation = "x";
                isOperationClick = true;
                break;
            case "-":
                first = Double.valueOf(textView.getText().toString());
                operation = "-";
                isOperationClick = true;
                break;
            case "+":
                first = Double.valueOf(textView.getText().toString());
                operation = "+";
                isOperationClick = true;
                break;
            case "%":
                first = Double.valueOf(textView.getText().toString());
                operation = "%";
                isOperationClick = true;
                break;
            case "+/-":
                first = Double.valueOf(textView.getText().toString());
                operation = "+/-";
                isOperationClick = true;
                break;
            case ".":
                first = Double.valueOf(textView.getText().toString());
                operation = ".";
                isOperationClick = true;
            case "=":
                second = Double.valueOf(textView.getText().toString());
            if (operation.equals("+")) {
                third = first + second;
                textView.setText(third.toString());
            } else if (operation.equals("÷")) {
                third = first/second;
                textView.setText(third.toString());
            } else if (operation.equals("x")) {
                third = first * second;
                textView.setText(third.toString());
            } else if (operation.equals("-")) {
                third = first - second;
                textView.setText(third.toString());
            } else if (operation.equals("%")) {
                third = (first/100) * second;
                textView.setText(third.toString());
            }else if (operation.equals("+/-")) {
                third = first - first * 2;
                textView.setText(third.toString());
            } else if (operation.equals(".")) {
                third = first + first;
                textView.setText(textButton.toString());
            }
            isOperationClick = true;
        }
    }
}

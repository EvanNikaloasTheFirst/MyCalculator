package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
        Button[] Numbers = null;
        Button[] Operators = null;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            TextView display = findViewById(R.id.calculator_display);
            Numbers = new Button[]{
                    (Button) findViewById(R.id.one),
                    (Button) findViewById(R.id.two),
                    (Button) findViewById(R.id.three),
                    (Button) findViewById(R.id.four),
                    (Button) findViewById(R.id.five),
                    (Button) findViewById(R.id.six),
                    (Button) findViewById(R.id.seven),
                    (Button) findViewById(R.id.eight),
                    (Button) findViewById(R.id.nine),
                    (Button) findViewById(R.id.zero),
            };
            Operators = new Button[]{
                    (Button) findViewById(R.id.add),
                    (Button) findViewById(R.id.minus),
                    (Button) findViewById(R.id.multiply),
                    (Button) findViewById(R.id.divide),
                    (Button) findViewById(R.id.equals),
                    (Button) findViewById(R.id.clear)
            };

//            Displays the numbered buttons which have been clicked
            for (int i = 0; i < Numbers.length; i++) {
                final int finalI = i;
                Numbers[i].setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display.append(Numbers[finalI].getText().toString());
                    }
                });
            }
//            Displays the operator buttons which have been clicked
        Map<Integer, List<String>> myMap = new HashMap<>();


            for (int i = 0; i < Operators.length; i++) {
                final int buttonIndex = i;
                Operators[i].setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display.append(" ");
                        display.append(Operators[buttonIndex].getText().toString());
                        display.append(" ");
                    }
                });
            }

//                 Declare and initialize the map outside the onClick method
                Operators[4].setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s = display.getText().toString();
                        Scanner scanner = new Scanner(s);
                        int num1 = scanner.nextInt();
                        String operator = scanner.next();
                        int num2 = scanner.nextInt();
                        int result = 0;
                        switch (operator) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                result = num1 / num2;
                                break;
                        }
                        String res = String.valueOf(result);
                        display.setText(res);

                        }
                });

        Operators[5].setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
            });
        }

    }

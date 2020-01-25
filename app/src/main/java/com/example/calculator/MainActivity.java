package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    private Button cBT, parcentBT, rootBT, delBT, oneBT, twoBT, threeBT, fourBT, fiveBT, sixBT,sevenBT, eightBT,
            nineBT, zeroBT, pointBT, plusBT, multiplyBT, divisionBT, subtractionBT, equalBT;

    private TextView resultTV;
    private boolean cal = false;
    private double firstNumber = 0;
    private int scendNumberIndex = 0;
    private char currentOP;
    private double finalResult = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();

        cBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.setText("");
            }
        });
        delBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (finalResult == 0) {
                    String displayElements = resultTV.getText().toString();
                    int length = displayElements.length();
                    if (length > 0) {
                        displayElements = displayElements.substring(0, length - 1);
                        resultTV.setText(displayElements);
                    }
                }
            }
        });
        parcentBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                firstNumber = Double.parseDouble(screenContent);
                resultTV.append("%");
                cal = true;
                currentOP = '%';
            }
        });
        rootBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                resultTV.setText("√");
                cal = true;
                currentOP = '√';
            }
        });
        zeroBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("0");
            }
        });

        oneBT.setOnClickListener(v -> {
            resultTV.append("1");
        });

        twoBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("2");
            }
        });

        threeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("3");
            }
        });

        fourBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("4");

            }
        });

        fiveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("5");

            }
        });

        sixBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("6");

            }
        });

        sevenBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("7");

            }
        });

        eightBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("8");

            }
        });

        nineBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append("9");

            }
        });

        plusBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                firstNumber = Double.parseDouble(screenContent);
                resultTV.append("+");
                cal = true;
                currentOP = '+';
            }
        });

        subtractionBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                firstNumber = Double.parseDouble(screenContent);
                resultTV.append("-");
                cal = true;
                currentOP = '-';
            }
        });

        multiplyBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                firstNumber = Double.parseDouble(screenContent);
                resultTV.append("*");
                cal = true;
                currentOP = '*';
            }
        });

        divisionBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String screenContent = resultTV.getText().toString();
                scendNumberIndex = screenContent.length() + 1;
                firstNumber = Double.parseDouble(screenContent);
                resultTV.append("/");
                cal = true;
                currentOP = '/';
            }
        });

        pointBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTV.append(".");
            }
        });

        equalBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cal){
                    if (currentOP == '+'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = secondNumber + firstNumber;
                        resultTV.setText(String.valueOf(finalResult));
                    }
                    if (currentOP == '-'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = firstNumber - secondNumber;
                        resultTV.setText(String.valueOf(finalResult));
                    }
                    if (currentOP == '*'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = firstNumber * secondNumber;
                        resultTV.setText(String.valueOf(finalResult));
                    }
                    if (currentOP == '/'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = firstNumber / secondNumber;
                        resultTV.setText(String.valueOf(finalResult));
                    }
                    if (currentOP == '%'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = (firstNumber / 100) * secondNumber;
                        resultTV.setText(String.valueOf(finalResult));
                    }

                    if (currentOP == '√'){
                        String screenContent = resultTV.getText().toString();
                        String secondNumberString = screenContent.
                                substring(scendNumberIndex, screenContent.length());
                        double secondNumber = Double.parseDouble(secondNumberString);
                        finalResult = Math.sqrt(secondNumber);
                        resultTV.setText(String.valueOf(finalResult));
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Input Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initialization() {

        resultTV = findViewById(R.id.result);

        cBT = findViewById(R.id.cBT);
        parcentBT = findViewById(R.id.parcentBT);
        rootBT = findViewById(R.id.rootBT);
        delBT = findViewById(R.id.delBT);
        oneBT = findViewById(R.id.oneBT);
        twoBT = findViewById(R.id.twoBT);
        threeBT = findViewById(R.id.threeBT);
        fourBT = findViewById(R.id.fourBT);
        fiveBT = findViewById(R.id.fiveBT);
        sixBT = findViewById(R.id.sixBT);
        sevenBT = findViewById(R.id.sevenBT);
        eightBT = findViewById(R.id.eightBT);
        nineBT = findViewById(R.id.nineBT);
        zeroBT = findViewById(R.id.zeroBT);
        pointBT = findViewById(R.id.pointBT);
        plusBT = findViewById(R.id.plusBT);
        subtractionBT = findViewById(R.id.subtractionBT);
        multiplyBT = findViewById(R.id.multiplyBT);
        divisionBT = findViewById(R.id.divisionBT);
        equalBT = findViewById(R.id.equalBT);
    }
}

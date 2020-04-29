package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Path;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean minus = false;

    enum Operations
    {
        NONE,
        SUM,
        SUBTRACT,
        MULT,
        DIV
    }

    private double firstInput;
    private double secondInput;
    private String res;
    private Operations operations;
    private boolean equalIsClicked;

    private TextView textView;

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonZero;
    private Button buttonDot;


    private Button buttonRoot;
    private Button buttonSquare;
    private Button buttonClearAll;
    private Button buttonDelete;
    private Button buttonEqual;
    private Button buttonAddition;
    private Button buttonSubtraction;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonTangent;
    private Button buttonFactorial;
    private Button buttonLog;
    private Button buttonLn;
    private Button buttonDifPower;
    private Button buttonNRoot;
    private Button buttonPercent;




//    protected void onSaveInstanceState(@Nullable Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString("textView", textView.getText().toString());
//    }
//
//    protected void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        textView.setText(savedInstanceState.getString(textView.getText().toString()));
//    }

//    public double Logarithm(double a, double b) {
//        return Math.log(a) / Math.log(b);
//    }
//
//    public int Factorial(int number) {
//        int factorial = 1;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        return factorial;
//    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = 0;
        secondInput = 0;
        equalIsClicked = false;
        operations = Operations.NONE;
        textView = findViewById(R.id.textView);




        textView = (TextView) findViewById(R.id.textView);

        buttonOne = (Button) findViewById(R.id.one);
        buttonTwo = (Button) findViewById(R.id.two);
        buttonThree = (Button) findViewById(R.id.three);
        buttonFour = (Button) findViewById(R.id.four);
        buttonFive = (Button) findViewById(R.id.five);
        buttonSix = (Button) findViewById(R.id.six);
        buttonSeven = (Button) findViewById(R.id.seven);
        buttonEight = (Button) findViewById(R.id.eight);
        buttonNine = (Button) findViewById(R.id.nine);
        buttonZero = (Button) findViewById(R.id.zero);

        buttonAddition = (Button) findViewById(R.id.plus);
        buttonSubtraction = (Button) findViewById(R.id.subtr);
        buttonDivision = (Button) findViewById(R.id.division);
        buttonMultiplication = (Button) findViewById(R.id.multiply);
        buttonClearAll = (Button) findViewById(R.id.clear);
        buttonDelete = (Button) findViewById(R.id.del);
        buttonEqual = (Button) findViewById(R.id.equal);
        buttonPercent = (Button) findViewById(R.id.percent);
        buttonRoot = (Button) findViewById(R.id.sqrt);
        buttonSquare = (Button) findViewById(R.id.power);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonSin = (Button) findViewById(R.id.sin);
        buttonCos = (Button) findViewById(R.id.cos);
        buttonTangent = (Button) findViewById(R.id.tan);
        buttonLog = (Button) findViewById(R.id.log);
        buttonLn = (Button) findViewById(R.id.ln);
        buttonFactorial = (Button) findViewById(R.id.factorial);
        buttonDifPower = (Button) findViewById(R.id.difPow);
        buttonNRoot = (Button) findViewById(R.id.NRoot);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {

                    if (equalIsClicked) {
                        textView.setText("1");
                        equalIsClicked = false;
                    } else {
                        textView.setText("1");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("1");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "1";
                        textView.setText(res);
                    }
                }
            }
        });


        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("2");
                        equalIsClicked = false;
                    } else {
                        textView.setText("2");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("2");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "2";
                        textView.setText(res);
                    }
                }
            }
        });


        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("3");
                        equalIsClicked = false;
                    } else {
                        textView.setText("3");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("3");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "3";
                        textView.setText(res);
                    }
                }
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("4");
                        equalIsClicked = false;
                    } else {
                        textView.setText("4");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("4");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "4";
                        textView.setText(res);
                    }
                }
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("5");
                        equalIsClicked = false;
                    } else {
                        textView.setText("5");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("5");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "5";
                        textView.setText(res);
                    }
                }
            }
        });


        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("6");
                        equalIsClicked = false;
                    } else {
                        textView.setText("6");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("6");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "6";
                        textView.setText(res);
                    }
                }
            }
        });


        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN")|| textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("7");
                        equalIsClicked = false;
                    } else {
                        textView.setText("7");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("7");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "7";
                        textView.setText(res);
                    }
                }
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("8");
                        equalIsClicked = false;
                    } else {
                        textView.setText("8");
                    }

                } else {
                    if (equalIsClicked) {
                        textView.setText("8");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "8";
                        textView.setText(res);
                    }
                }
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN")|| textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("9");
                        equalIsClicked = false;
                    } else {
                        textView.setText("9");
                    }
                } else {
                    if (equalIsClicked) {
                        textView.setText("9");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "9";
                        textView.setText(res);
                    }
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("NaN") || textView.getText().equals("На 0 делить нельзя")){
                    operations = Operations.NONE;
                    textView.setText("");
                    firstInput = 0;
                    secondInput = 0;
                    minus = false;
                }
                if (textView.getText().equals("") ) {
                    if (equalIsClicked) {
                        textView.setText("0");
                        equalIsClicked = false;
                    } else {
                        textView.setText("0");
                    }
                } else if (!textView.getText().equals("0") && !textView.getText().equals("")) {
                    if (equalIsClicked) {
                        textView.setText("0");
                        equalIsClicked = false;
                    } else {
                        res = textView.getText().toString() + "0";
                        textView.setText(res);
                    }
                }
            }
        });


        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operations == Operations.NONE) {
                    if (textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                        textView.setText("");
                    }
                    if (!textView.getText().equals("")) {
                        firstInput = Double.parseDouble(textView.getText().toString());
                        operations = Operations.SUM;
                        textView.setText("");
                    }
                } else {
                    operations = Operations.SUM;
                    textView.setText("");
                }
            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                    textView.setText("");
                }
                    else {
                        firstInput = Double.parseDouble(textView.getText().toString());
                        operations = Operations.SUBTRACT;
                        textView.setText("");
                    }

            }
        });


        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operations == Operations.NONE) {
                    if (textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                        textView.setText("");
                    }
                    if (!textView.getText().equals("") ) {

                        firstInput = Double.parseDouble(textView.getText().toString());
                        operations = Operations.MULT;
                        textView.setText("");
                    }
                } else {
                    operations = Operations.MULT;
                    textView.setText("");
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operations == Operations.NONE) {
                    if (textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                        textView.setText("");
                    }
                    if (!textView.getText().equals("")) {
                        firstInput = Double.parseDouble(textView.getText().toString());
                        operations = Operations.DIV;
                        textView.setText("");
                    }
                } else {
                    operations = Operations.DIV;
                    textView.setText("");
                }
            }
        });


        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().equals("") && !textView.getText().toString().contains(".") && !textView.getText().equals("На 0 делить нельзя") &&
                !textView.getText().equals("NaN")) {
                    res = textView.getText().toString() + ".";
                    textView.setText(res);
                }
            }
        });


        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().equals("") && !textView.getText().equals("На 0 делить нельзя") && !textView.getText().equals("NaN")) {
                    res = textView.getText().toString().substring(0, textView.getText().length() - 1);
                    textView.setText(res);
                }
            }
        });


        buttonClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                operations = Operations.NONE;
                firstInput = 0;
                secondInput = 0;
                minus = false;
            }
        });


        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                    firstInput = Math.pow(Double.parseDouble(textView.getText().toString()), 2);
                    res = Double.toString(firstInput);
                    textView.setText(res);
                }
            }
        });


        buttonRoot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (!textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                    firstInput = Math.sqrt(Double.parseDouble(textView.getText().toString()));
                    res = Double.toString(firstInput);
                    textView.setText(res);
                }
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().equals("") || textView.getText().equals("На 0 делить нельзя") || textView.getText().equals("NaN")) {
                    textView.setText("");
                }
                    else if(!textView.getText().equals("0")){
                        double a = Double.parseDouble(textView.getText().toString()) * (-1);
                        textView.setText(Double.toString(a));
                    }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!textView.getText().equals("")) {
                        secondInput = Double.parseDouble(textView.getText().toString());
                        if (operations == Operations.SUM) {
                            res = Double.toString(firstInput + secondInput);
                            if(res.equals("-0.0")){
                                res = "0.0";
                            }
                            textView.setText(res);
                        }

                        if (operations == Operations.SUBTRACT) {
                            res = Double.toString(firstInput - secondInput);
                            if(res.equals("-0.0")){
                                res = "0.0";
                            }
                            textView.setText(res);
                        }

                        if (operations == Operations.DIV) {
                            if (secondInput != 0) {
                                res = Double.toString(firstInput / secondInput);
                                if(res.equals("-0.0")){
                                    res = "0.0";
                                }
                                textView.setText(res);

                            } else {
                                textView.setText("На 0 делить нельзя");
                            }
                        }
                        if (operations == Operations.MULT) {
                                res = Double.toString(firstInput * secondInput);
                                if(res.equals("-0.0") || textView.getText().equals("NaN")){
                                    res = "0.0";
                                    firstInput = 0;
                                    secondInput = 0;
                                }
                                textView.setText(res);

                        }

                        operations = Operations.NONE;
                        equalIsClicked = true;

            }
        }
        });
}
}
package com.example.cbustamante.umb_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main_calculadora extends AppCompatActivity {

    Button btZero, btOne, btTwo, btThree, btFour, btFive, btSix, btSeven,btEight, btNine,btClear, btMultip, btSubst, btSum, btDot, btEqual;
    EditText etResult, etChain;
    double Value1, Value2, Result;
    String Operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);
        btZero = (Button) findViewById(R.id.btZero);
        btOne = (Button) findViewById(R.id.btOne);
        btTwo = (Button) findViewById(R.id.btTwo);
        btThree = (Button) findViewById(R.id.btThree);
        btFour = (Button) findViewById(R.id.btFour);
        btFive = (Button) findViewById(R.id.btFive);
        btSix = (Button) findViewById(R.id.btSix);
        btSeven = (Button) findViewById(R.id.btSeven);
        btEight = (Button) findViewById(R.id.btEight);
        btNine = (Button) findViewById(R.id.btNine);
        btClear = (Button) findViewById(R.id.btClear);
        btMultip = (Button) findViewById(R.id.btMultip);
        btSubst = (Button) findViewById(R.id.btSubst);
        btSum = (Button) findViewById(R.id.btSum);
        btDot = (Button) findViewById(R.id.btDot);
        btEqual = (Button) findViewById(R.id.btEqual);
        etResult = (EditText) findViewById(R.id.etResult);

        btZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"0");
            }

        });
        btOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"1");
            }
        });
        btTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"2");
            }
        });
        btThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"5");
            }
        });
        btSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"6");
            }
        });
        btSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"7");
            }
        });
        btEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"8");
            }
        });
        btNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+"9");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                etResult.setText(etChain.getText().toString()+".");
            }
        });

        btSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Operator = "+";
                etChain = (EditText) findViewById(R.id.etResult);
                Value1 = Double.parseDouble(etChain.getText().toString());
                etResult.setText("");
            }
        });
        btSubst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Operator = "-";
                etChain = (EditText) findViewById(R.id.etResult);
                Value1 = Double.parseDouble(etChain.getText().toString());
                etResult.setText("");
            }
        });

        btEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etChain = (EditText)findViewById(R.id.etResult);
                Value2 = Double.parseDouble((etChain.getText().toString()));
                if (Operator.equals("+")){
                    etResult.setText("");
                    Result = Value1 + Value2;

                }
                if (Operator.equals("-")){
                    etResult.setText("");
                    Result = Value1 - Value2;

                }
                etResult.setText(String.valueOf(Result));
            }
        });









    }
}

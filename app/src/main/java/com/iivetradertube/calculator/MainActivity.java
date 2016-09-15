package com.iivetradertube.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAdd;
    private Button btnMin;
    private Button Div;
    private Button Mult;
    private TextView txtResult;
    private Button btnClr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMin = (Button) findViewById(R.id.btnMin);
        Div = (Button) findViewById(R.id.Div);
        Mult = (Button) findViewById(R.id.Mult);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnClr = (Button) findViewById(R.id.btnClr);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());

                double theResult = oper1 + oper2;
                txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter both ooperands", Toast.LENGTH_LONG).show();
                }

            }
        });

        btnMin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double opr1 = Double.parseDouble(operand1.getText().toString());
                    double opr2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = opr1 - opr2;
                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter both ooperands", Toast.LENGTH_LONG).show();
                }
            }
        });

        Div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter both ooperands", Toast.LENGTH_LONG).show();
                }
            }
        });

        Mult.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter both ooperands", Toast.LENGTH_LONG).show();
                    }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
                operand2.requestFocus();


            }
        });

    }
}

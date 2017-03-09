package com.ma.mj.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText8);
        e2 = (EditText)findViewById(R.id.editText9);
        b1 = (Button)findViewById(R.id.button6);
        b2 = (Button)findViewById(R.id.button7);
        b3 = (Button)findViewById(R.id.button8);
        b4 = (Button)findViewById(R.id.button9);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String num1 = e1.getText().toString();
                num1 = num1.trim();
                String num2 = e2.getText().toString();
                num2 = num2.trim();
                if (num1.getBytes().length == 0 ){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(num2.getBytes().length == 0){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    int presult = Integer.parseInt(num1) + Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + presult + "입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String num1 = e1.getText().toString();
                num1 = num1.trim();
                String num2 = e2.getText().toString();
                num2 = num2.trim();
                if (num1.getBytes().length == 0 ){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(num2.getBytes().length == 0){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    int miresult = Integer.parseInt(num1) - Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "빼기 계산 결과는 " + miresult + "입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String num1 = e1.getText().toString();
                num1 = num1.trim();
                String num2 = e2.getText().toString();
                num2 = num2.trim();
                if (num1.getBytes().length == 0 ){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(num2.getBytes().length == 0){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    int muresult = Integer.parseInt(num1) * Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "곱하기 계산 결과는 " + muresult + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String num1 = e1.getText().toString();
                num1 = num1.trim();
                String num2 = e2.getText().toString();
                num2 = num2.trim();
                if (num1.getBytes().length == 0 ){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(num2.getBytes().length == 0){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    if(Float.parseFloat(num2) == 0) Toast.makeText(getApplicationContext(),"0으로는 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                    else {
                        int dresult = (int) (Float.parseFloat(num1) / Float.parseFloat(num2));
                        Toast.makeText(getApplicationContext(), "나누기 계산 결과는 " + dresult + "입니다.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

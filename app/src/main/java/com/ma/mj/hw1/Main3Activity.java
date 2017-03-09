package com.ma.mj.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText2);
        e2 = (EditText)findViewById(R.id.editText);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String year = e1.getText().toString();
                int result1 = (2017 - Integer.parseInt(year) + 1);

                Toast.makeText(getApplicationContext(),"당신의 나이는 "+result1+"세 입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String old = e2.getText().toString();
                int result2 = (2017 - Integer.parseInt(old) + 1);

                Toast.makeText(getApplicationContext(),"당신이 태어난 해는 "+result2+"년 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

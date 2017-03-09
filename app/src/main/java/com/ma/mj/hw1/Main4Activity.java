package com.ma.mj.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String ctemp = e1.getText().toString();
                double result1 = Float.parseFloat(ctemp) * 1.8 +32;

                Toast.makeText(getApplicationContext(),"화씨온도는 "+result1+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ftemp = e2.getText().toString();
                double result2 = (Float.parseFloat(ftemp) - 32) / 1.8;

                Toast.makeText(getApplicationContext(),"섭씨온도는 "+result2+"도 입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

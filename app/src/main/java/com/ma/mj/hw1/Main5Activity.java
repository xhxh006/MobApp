package com.ma.mj.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    CheckBox c1;
    Button b1;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText5);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.editText7);
        c1 = (CheckBox)findViewById(R.id.checkBox);
        b1 = (Button)findViewById(R.id.button5);
        t1 = (TextView)findViewById(R.id.textView12);
        t2 = (TextView)findViewById(R.id.textView13);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String pizza = e1.getText().toString();
                String pasta = e2.getText().toString();
                String salad = e3.getText().toString();

                if (c1.isChecked()){
                    double membership = 0.9;
                }
                else{
                    double membership = 1;
                }
            }
        });
    }
}

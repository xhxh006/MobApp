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
        t1 = (TextView)findViewById(R.id.textView10);
        t2 = (TextView)findViewById(R.id.textView12);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                String pizza = e1.getText().toString();
                pizza = pizza.trim();
                String pasta = e2.getText().toString();
                pasta = pasta.trim();
                String salad = e3.getText().toString();
                salad = salad.trim();

                if (pizza.getBytes().length == 0){
                    e1.setText("0");
                    pizza = e1.getText().toString();
                }
                if (pasta.getBytes().length == 0){
                    e2.setText("0");
                    pasta = e2.getText().toString();
                }
                if (salad.getBytes().length == 0){
                    e3.setText("0");
                    salad = e3.getText().toString();
                }

                int count = Integer.parseInt(pizza) + Integer.parseInt(pasta) + Integer.parseInt(salad);
                if (c1.isChecked()){
                    int coast = (int)((Integer.parseInt(pizza)*15000 + Integer.parseInt(pasta)*13000 + Integer.parseInt(salad)*9000) * 0.9);
                    t1.setText(Integer.toString(count));
                    t2.setText(Integer.toString(coast));
                }
                else{
                    int coast = Integer.parseInt(pizza)*15000 + Integer.parseInt(pasta)*13000 + Integer.parseInt(salad)*9000;
                    t1.setText(Integer.toString(count));
                    t2.setText(Integer.toString(coast));
                }
            }
        });
    }
}

package com.example.simplestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondot,button0,buttonclear,buttonequals,buttonadd,buttonsub,buttonmul,buttondivide;
    EditText simplestedittext;
    float mvalue1,mvalue2;
    boolean simpleastadition,simpleastsubtraction,simpleastmultiplication,simpleastdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttondot=(Button)findViewById(R.id.buttondot);
        buttonadd=(Button)findViewById(R.id.buttonadd);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttonmul=(Button)findViewById(R.id.buttonmul);
        buttondivide=(Button)findViewById(R.id.buttondivide);
        buttonclear=(Button)findViewById(R.id.buttonclear);
        buttonequals=(Button)findViewById(R.id.buttonequals);
        simplestedittext=(EditText)findViewById(R.id.simplestedittext);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+"0");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (simplestedittext == null){
                   simplestedittext.setText("");
               }else {
                   mvalue1=Float.parseFloat(simplestedittext.getText()+"");
                   simpleastadition=true;
                   simplestedittext.setText(null);
               }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalue1=Float.parseFloat(simplestedittext.getText()+"");
                simpleastsubtraction=true;
                simplestedittext.setText(null);
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mvalue1=Float.parseFloat(simplestedittext.getText()+"");
                simpleastmultiplication=true;
                simplestedittext.setText(null);
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalue1=Float.parseFloat(simplestedittext.getText()+"");
                simpleastdivision=true;
                simplestedittext.setText(null);
            }
        });
        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvalue2=Float.parseFloat(simplestedittext.getText()+"");
                if (simpleastadition == true){
                    simplestedittext.setText(mvalue1+mvalue2+"");
                    simpleastadition = false;
                }
                if (simpleastsubtraction == true){
                    simplestedittext.setText(mvalue1-mvalue2+"");
                    simpleastsubtraction = false;
                }
                if (simpleastmultiplication == true){
                    simplestedittext.setText(mvalue1*mvalue2+"");
                    simpleastmultiplication = false;
                }
                if (simpleastdivision == true){
                    simplestedittext.setText(mvalue1/mvalue2+"");
                    simpleastdivision = false;
                }
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText(simplestedittext.getText()+".");
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simplestedittext.setText("");
            }
        });
    }
}
package com.example.user.calculadora;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    public Button sumar, dividir, restar, multip, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, igual, borrar;
    public TextView txt, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumar=(Button)findViewById(R.id.button16);
        dividir=(Button)findViewById(R.id.button4);
        restar=(Button)findViewById(R.id.button12);
        multip=(Button)findViewById(R.id.button8);
        uno=(Button)findViewById(R.id.button);
        dos=(Button)findViewById(R.id.button2);
        tres=(Button)findViewById(R.id.button3);
        cuatro=(Button)findViewById(R.id.button5);
        cinco=(Button)findViewById(R.id.button6);
        seis=(Button)findViewById(R.id.button7);
        siete=(Button)findViewById(R.id.button9);
        ocho=(Button)findViewById(R.id.button10);
        nueve=(Button)findViewById(R.id.button11);
        cero=(Button)findViewById(R.id.button14);
        borrar=(Button)findViewById(R.id.button18);
        punto=(Button)findViewById(R.id.button13);
        igual=(Button)findViewById(R.id.button15);
        txt = (TextView)findViewById(R.id.textView);
        txt2 = (TextView)findViewById(R.id.textView2);
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+".");
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                txt2.setText("");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+1);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+2);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+3);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+4);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+5);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+6);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+7);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+8);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+9);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+""+0);
            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"+");
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"-");
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"/");
            }
        });
        multip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"*");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().toString().contains("+")) {
                    sumar();
                }
                if (txt.getText().toString().contains("-")) {
                    restar();
                }
                if (txt.getText().toString().contains("*")) {
                    multip();
                }
                if (txt.getText().toString().contains("/")) {
                    dividir();
                }
            }
        });
        }

    public void sumar(){
        StringTokenizer tokens = new StringTokenizer(txt.getText().toString(), "+");
        String first = tokens.nextToken();
        String second = tokens.nextToken();
        Float value1 = Float.parseFloat(first);
        Float value2 = Float.parseFloat(second);
        Float total = value1 + value2;
        txt2.setText("" + total);
    }
    public void restar(){
        StringTokenizer tokens = new StringTokenizer(txt.getText().toString(), "-");
        String first = tokens.nextToken();
        String second = tokens.nextToken();
        Float value1 = Float.parseFloat(first);
        Float value2 = Float.parseFloat(second);
        Float total = value1 - value2;
        txt2.setText("" + total);
    }
    public void dividir(){
        StringTokenizer tokens = new StringTokenizer(txt.getText().toString(), "/");
        String first = tokens.nextToken();
        String second = tokens.nextToken();
        Float value1 = Float.parseFloat(first);
        Float value2 = Float.parseFloat(second);
        Float total = value1 / value2;
        txt2.setText("" + total);
    }
    public void multip(){
        StringTokenizer tokens = new StringTokenizer(txt.getText().toString(), "*");
        String first = tokens.nextToken();
        String second = tokens.nextToken();
        Float value1 = Float.parseFloat(first);
        Float value2 = Float.parseFloat(second);
        Float total = value1 * value2;
        txt2.setText("" + total);
    }
}

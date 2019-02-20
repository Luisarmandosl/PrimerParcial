package com.example.primerparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txttitulo1 ,txtdescripcion1, txttitulo2, txtdescripcion2, txttitulo3, txtdescripcion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txttitulo1 = (TextView) findViewById(R. id. textView);
        txtdescripcion1 = (TextView) findViewById(R. id. textView2);
        txttitulo2 = (TextView) findViewById(R. id. textView3);
        txtdescripcion2 = (TextView) findViewById(R. id. textView4);
        txttitulo3 = (TextView) findViewById(R. id. textView5);
        txtdescripcion3 = (TextView) findViewById(R. id. textView6);

        txttitulo1.setText("Alita Battle Angel");
        txttitulo2.setText("Como entrenar a tu dragon 3");
        txttitulo3.setText("Huellitas a casa");
        txtdescripcion1.setText("Un robot ojon que pelea");
        txtdescripcion2.setText("otro mata dragones");
        txtdescripcion3.setText("una perrita volviendo a casa");

    }
}

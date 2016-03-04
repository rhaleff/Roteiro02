package com.example.rhaleff.roteiro02;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TraduzirInglesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_ingles);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cor = bundle.getString("cor");
        TextView trad = (TextView) findViewById(R.id.traduzirIngles);

        if(cor.equalsIgnoreCase("amarelo")){
            trad.setText("YELLOW");
            trad.setTextColor(Color.YELLOW);
            
        }

        else if (cor.equalsIgnoreCase("vermelho")){
            trad.setText("RED");
            trad.setTextColor(Color.RED);

        }else{
            trad.setText("BLUE");
            trad.setTextColor(Color.BLUE);
        }
    }
}
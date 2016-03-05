package com.example.rhaleff.roteiro02;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TraduzirInglesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_ingles);
//adicionando botão voltarInicio
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setTitle("Tradução em Inglês");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
//fim-adicionar botão voltar

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cor = bundle.getString("cor");
        TextView trad = (TextView) findViewById(R.id.traduzIngles);

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
//açao do botão
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        return super.onContextItemSelected(item);
    }


}
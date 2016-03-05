package com.example.rhaleff.roteiro02;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class TraduzirFrancesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_frances);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.setTitle("Tradução em Francês");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cor = bundle.getString("cor");
        TextView trad = (TextView) findViewById(R.id.traduzFrances);

        if(cor.equalsIgnoreCase("amarelo")){
            trad.setText("JAUNE");
            trad.setTextColor(Color.YELLOW);

        }

        else if (cor.equalsIgnoreCase("vermelho")){
            trad.setText("ROUGE");
            trad.setTextColor(Color.RED);


        }else{
            trad.setText("BLEU");
            trad.setTextColor(Color.BLUE);

        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        return super.onContextItemSelected(item);
    }
}
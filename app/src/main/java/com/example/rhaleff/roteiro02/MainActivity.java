package com.example.rhaleff.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mCor;
    private Button mTraduzir;
    private Button mTraduzirIngles;
    private Button mTraduzirFrances;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCor = (EditText) findViewById(R.id.cor);
        mTraduzir = (Button) findViewById(R.id.traduzir);
        mTraduzirIngles = (Button) findViewById(R.id.traduzirIngles);
        mTraduzirFrances = (Button) findViewById(R.id.traduzirFrances);

        mTraduzir.setOnClickListener(new Traduzir("TRADUZIR",null));
        mTraduzirIngles.setOnClickListener(new Traduzir("TRADUZIR", "INGLES"));
        mTraduzirFrances.setOnClickListener(new Traduzir("TRADUZIR", "FRANCES"));
    }

    public class Traduzir implements View.OnClickListener {
        private String action;
        private String category;

        public Traduzir(String action, String category) {
            this.action = action;
            this.category = category;
        }

        @Override
        public void onClick(View v) {
            String cor = mCor.getText().toString();
            if (cor.equalsIgnoreCase("azul")|| cor.equalsIgnoreCase("vermelho")||cor.equalsIgnoreCase("amarelo")){
                Intent intent = new Intent(this.action);
                if(this.category!=null){
                    intent.addCategory(this.category);
                }
                Bundle b = new Bundle();
                b.putString("cor",cor);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }

            else{
                View focus = null;

                if(TextUtils.isEmpty(cor)){ //quando o campo estiver vazio
                    mCor.setError("Campo Vazio");
                    focus = mCor;
                    focus.requestFocus();
                }

                if (!(cor.equalsIgnoreCase("amarelo"))|| !(cor.equalsIgnoreCase("vermelho"))||!(cor.equalsIgnoreCase("azul"))){
                    mCor.setError("Cor Inválida! Tente novamente!");
                    focus = mCor;
                    focus.requestFocus();
                }
            }
        }
    }
}
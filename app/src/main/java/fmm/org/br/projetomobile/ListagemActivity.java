package fmm.org.br.projetomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListagemActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        TextView tvNome = (TextView)findViewById(R.id.tvNome);
        TextView tvEnd = (TextView)findViewById(R.id.tvEnd);
        TextView tvTel = (TextView)findViewById(R.id.tvTel);
        TextView tvCep = (TextView)findViewById(R.id.tvCep);

        Intent i = getIntent();
        Bundle parametros = i.getExtras();

        if(parametros != null){
            tvNome.setText("Nome: "+parametros.getString("nome"));
            tvEnd.setText("Endereço: "+parametros.getString("end"));
            tvTel.setText("Telefone: "+parametros.getString("tel"));
            tvCep.setText("CEP:"+parametros.getString("cep"));
        }
    }

    public void voltarHome(View view){
        Intent i = new Intent(ListagemActivity.this,HomeActivity.class);
        startActivity(i);
        finish();
    }
}

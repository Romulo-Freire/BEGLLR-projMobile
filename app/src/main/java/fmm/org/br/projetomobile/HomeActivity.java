package fmm.org.br.projetomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private String nome="";
    private String end="";
    private String tel="";
    private String cep="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i = getIntent();
        Bundle parametros = i.getExtras();

        if(parametros != null){
            nome = parametros.getString("nome");
            end = parametros.getString("end");
            tel = parametros.getString("tel");
            cep = parametros.getString("cep");
        }
    }

    public void cadastrar(View view){
        Intent i = new Intent(HomeActivity.this,CadastroActivity.class);
        startActivity(i);
        finish();
    }
    public void listar(View view){
        Intent i = new Intent(HomeActivity.this,ListagemActivity.class);
        Bundle p = new Bundle();

        p.putString("nome",nome);
        p.putString("end",end);
        p.putString("tel",tel);
        p.putString("cep",cep);

        i.putExtras(p);
        startActivity(i);

    }
}

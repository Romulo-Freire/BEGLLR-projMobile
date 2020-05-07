package fmm.org.br.projetomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etEnd;
    private EditText etTel;
    private EditText etCEP;

    private String nome;
    private String endereco;
    private String telefone;
    private String cep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void cadastrarDados(View view){

        etNome = (EditText) findViewById(R.id.etNome);
        etEnd = (EditText) findViewById(R.id.etEndereco);
        etTel = (EditText) findViewById(R.id.etTelefone);
        etCEP = (EditText) findViewById(R.id.etCEP);

        nome = etNome.getText().toString();
        endereco = etEnd.getText().toString();
        telefone = etTel.getText().toString();
        cep = etCEP.getText().toString();

        Intent i = new Intent(CadastroActivity.this,HomeActivity.class);
        Bundle parametros = new Bundle();

        parametros.putString("nome",nome);
        parametros.putString("end",endereco);
        parametros.putString("tel",telefone);
        parametros.putString("cep",cep);

        i.putExtras(parametros);
        startActivity(i);

    }
}

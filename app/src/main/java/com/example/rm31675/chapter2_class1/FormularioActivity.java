package com.example.rm31675.chapter2_class1;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rm31675.chapter2_class1.model.Participante;
import com.example.rm31675.chapter2_class1.utils.Constantes;

public class FormularioActivity extends AppCompatActivity {

    private TextView tvUsuarioLogado;
    private TextInputLayout tilNome;
    private TextInputLayout tilEmail;
    private TextInputLayout tilTelefone;
    private TextInputLayout tilSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        tvUsuarioLogado = (TextView) findViewById(R.id.tvUsuarioLogado);

        tilNome = (TextInputLayout) findViewById(R.id.tilNome);
        tilEmail = (TextInputLayout) findViewById(R.id.tilEmail);
        tilTelefone = (TextInputLayout) findViewById(R.id.tilTelefone);
        tilSite = (TextInputLayout) findViewById(R.id.tilSite);

        if(getIntent() != null){
            tvUsuarioLogado.setText(getIntent().getStringExtra(Constantes.KEY_USUARIOS));
        }
    }

    public void inscrever(View v){
        Participante p = new Participante();
        p.setEmail(tilEmail.getEditText().getText().toString());
        p.setNome(tilNome.getEditText().getText().toString());
        p.setSite(tilSite.getEditText().getText().toString());
        p.setTelefone(tilTelefone.getEditText().getText().toString());

        Intent i = new Intent(this, ConfirmacaoActivity.class);
        i.putExtra(Constantes.KEY_PARTICIPANTE,p);
        startActivity(i);
    }
}

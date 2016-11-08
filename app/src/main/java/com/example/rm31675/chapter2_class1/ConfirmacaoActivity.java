package com.example.rm31675.chapter2_class1;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rm31675.chapter2_class1.model.Participante;
import com.example.rm31675.chapter2_class1.utils.Constantes;

import org.w3c.dom.Text;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView tvEmail, tvSite, tvTelefone;
    private Participante p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvSite = (TextView) findViewById(R.id.tvSite);
        tvTelefone = (TextView) findViewById(R.id.tvTelefone);

        if(getIntent() != null){
            Participante p = getIntent().getParcelableExtra(Constantes.KEY_PARTICIPANTE);
            tvEmail.setText(p.getEmail());
            tvSite.setText(p.getSite());
            tvTelefone.setText(p.getTelefone());
        }
    }
}

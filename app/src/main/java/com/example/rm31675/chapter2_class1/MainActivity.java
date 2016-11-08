package com.example.rm31675.chapter2_class1;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rm31675.chapter2_class1.utils.Constantes;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilUsuario;
    private TextInputLayout tilSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilUsuario = (TextInputLayout) findViewById(R.id.tilUsuario);
        tilSenha = (TextInputLayout) findViewById(R.id.tilSenha);
    }

    public void fazerLogin(View v){
        String usuario = tilUsuario.getEditText().getText().toString();
        String senha = tilSenha.getEditText().getText().toString();

        if(usuario.equals("admin") && senha.equals("123")){
            Intent iFormulario = new Intent(this, FormularioActivity.class);
            iFormulario.putExtra(Constantes.KEY_USUARIOS, tilUsuario.getEditText().getText().toString());
            startActivity(iFormulario);
        }else{

        }
    }
}

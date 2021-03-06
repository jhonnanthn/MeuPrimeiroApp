 package br.usjt.deswebmob.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
    Jhonnanthn William Carlos Balsas,
    R.A.: 816119078
 */
 public class MainActivity extends Activity {
     public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroapp.mensagem";

    /*
       Inicialização da classe.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Aparecer na view o texto fornecido pelo usuário.
     */
    public void sendMessage(View view){
        EditText editText = findViewById(R.id.edit_text);
        String mensagem = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MENSAGEM, mensagem);
        startActivity(intent);
    }
}

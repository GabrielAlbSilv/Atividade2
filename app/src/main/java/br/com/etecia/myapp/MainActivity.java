package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variaveis globais que representam os objetos no xml
    EditText edtUsuario, edtSenha;
    Button btnLogin;
    Button btnCads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //abrindo a minha activity
        setContentView(R.layout.activity_main);

        //declarei as variáveis do java para apresentar para as variáveis xml
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnCads = findViewById(R.id.btnCads);

        btnLogin.setOnClickListener(new View.OnClickListener() { //ação do botão Sig in ir para tela login
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, logintela.class);
                startActivity(intent);
            }
        });

        btnCads.setOnClickListener(new View.OnClickListener() { //ação do botão Sing Up ir para tela cadastro
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cadastro.class);
                startActivity(intent);
            }
        });

        }
    }

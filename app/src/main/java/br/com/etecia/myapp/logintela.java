package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class logintela extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnLogar, btnCadar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_logintela);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogar = findViewById(R.id.btnLogar);
        btnCadar = findViewById(R.id.btnCadar);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario,senha; //declarando strings para receber valores
                //usuario = edtUsuario.getText().toString(); //recebendo e convertendo Edit para View
                //senha = edtSenha.getText().toString();

                if (edtUsuario.getText().equals("etecia") && edtSenha.getText().equals("etecia")){
                    Toast.makeText(getApplicationContext(),"Logando",Toast.LENGTH_SHORT).show();
                    btnLogar.setOnClickListener(new View.OnClickListener() { //ação do botão Sing Up ir para tela cadastro
                        public void onClick(View v) {
                            Intent intent = new Intent(logintela.this, logado.class);
                            startActivity(intent);
                        }
                    });
                }else{
                    Toast.makeText(getApplicationContext(),"Usuário ou senha errado",Toast.LENGTH_SHORT).show();
                    edtUsuario.setText(" ");
                    edtSenha.setText(" ");
                    edtUsuario.requestFocus(); //volta para a janela de Insira o usuário
                }
                btnCadar.setOnClickListener(new View.OnClickListener() { //ação do botão Sing Up ir para tela cadastro
                    public void onClick(View v) {
                        Intent intent = new Intent(logintela.this, cadastro.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
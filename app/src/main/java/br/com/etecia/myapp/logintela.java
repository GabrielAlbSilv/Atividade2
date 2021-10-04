package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class logintela extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_logintela);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario,senha; //declarando strings para receber valores
                //usuario = edtUsuario.getText().toString(); //recebendo e convertendo Edit para View
                //senha = edtSenha.getText().toString();

                if (edtUsuario.getText().equals("etecia") && edtSenha.getText().equals("etecia")){

                }else{
                    Toast.makeText(getApplicationContext(),"Usuário ou senha errado",Toast.LENGTH_SHORT).show();
                    edtUsuario.setText(" ");
                    edtSenha.setText(" ");
                    edtUsuario.requestFocus(); //volta para a janela de Insira o usuário
                }

            }
        });
    }
}
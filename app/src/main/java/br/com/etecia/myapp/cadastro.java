package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity {
    Button btnCadar, btnLogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cadastro);

        btnCadar = findViewById(R.id.btnCadar);
        btnLogar = findViewById(R.id.btnLogar);

        btnCadar.setOnClickListener(new View.OnClickListener() { //ação do botão Sig in ir para tela login
            public void onClick(View v) {
                Intent intent = new Intent(cadastro.this, cadastrado.class);
                startActivity(intent);
            }
        });

        btnLogar.setOnClickListener(new View.OnClickListener() { //ação do botão Sig in ir para tela login
            public void onClick(View v) {
                Intent intent = new Intent(cadastro.this, logintela.class);
                startActivity(intent);
            }
        });
    }
}
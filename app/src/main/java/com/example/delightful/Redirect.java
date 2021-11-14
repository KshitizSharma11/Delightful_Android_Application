package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Redirect extends AppCompatActivity {
    Button btyes;
    Button btno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect);
        btno=findViewById(R.id.button2);
        btyes=findViewById(R.id.button3);
        btyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennew();
            }

        });
        btno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaybill();
            }
        });
    }

    private void displaybill() {
        Intent J=new Intent(this,Amount_Calculatorbeta.class);
        startActivity(J);
    }

    private void opennew() {
        Intent I=new Intent(this, Main_menu.class);
        startActivity(I);
    }
}
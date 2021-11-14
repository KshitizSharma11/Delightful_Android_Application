package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main_menu extends AppCompatActivity {
    RadioGroup categor;
    Button btreset, btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        categor = findViewById(R.id.categories);
        btreset = findViewById(R.id.Reset);
        btsubmit = findViewById(R.id.Submit);
        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedId = categor.getCheckedRadioButtonId();
                if (checkedId ==-1)
                {
                    meesage.meesage(getApplicationContext(),"Please Select An Item");
                }
                else
                {
                    findRadioButton(checkedId);
                }
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                categor.clearCheck();
            }
        });
    }

    private void findRadioButton(int checkedId) {
        switch (checkedId)
        {
            case R.id.radioButton:
                meesage.meesage(getApplicationContext(),"Tea/Coffee");

                break;
            case R.id.radioButton2:
                meesage.meesage(getApplicationContext(),"Shakes/Smoothies");

                break;
            case R.id.radioButton3:
                meesage.meesage(getApplicationContext(),"Pizzas");
                Intent pi= new Intent(this,Pizza.class);
                startActivity(pi);
                break;
            case R.id.radioButton4:
                meesage.meesage(getApplicationContext(),"Pasta/Lasagna");
                Intent pas=new Intent(this,Pasta.class);
                startActivity(pas);
                break;
            case R.id.radioButton5:
                meesage.meesage(getApplicationContext(),"Sandviches/Burgers");
                Intent is=new Intent(this,Sandviches.class);
                        startActivity(is);
                break;
            case R.id.radioButton6:
                meesage.meesage(getApplicationContext(),"Chinese");
                Intent in=new Intent(this,Chinese.class);
                startActivity(in);
                break;


        }
    }
}
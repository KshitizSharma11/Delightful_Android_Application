package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Pasta extends AppCompatActivity {
    int amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);

        RadioGroup pasta;
        Button btreset, btsubmit;
        pasta = findViewById(R.id.pasta);
        btreset = findViewById(R.id.resetchin);
        btsubmit = findViewById(R.id.submitchin);
        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkid = pasta.getCheckedRadioButtonId();
                if (checkid == -1) {
                    meesage.meesage(getApplicationContext(), "Please pick an option");
                } else {
                    findRadioButton1(checkid);
                }
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasta.clearCheck();
            }
        });
    }

    private void findRadioButton1(int checkid) {
        Amount_Calculatorbeta ob = new Amount_Calculatorbeta();
        switch (checkid) {
            case R.id.radioButton7:

                amt = 150;

                Intent in = new Intent(this, Redirect.class);
                startActivity(in);
                ob.calc(getApplicationContext(), 120, 1, "White Sauce Pasta");

                break;
            case R.id.radioButton8:
                meesage.meesage(getApplicationContext(), "Mixed Sauce Pasta");
                amt = 120;
                Intent i1 = new Intent(this, Redirect.class);
                startActivity(i1);

                ob.calc(getApplicationContext(), 120, 1, "Mixed Sauce Pasta");

                break;
            case R.id.radioButton9:
                meesage.meesage(getApplicationContext(), "Penne Pink Sauce Pasta");


                amt = 120;

                Intent i2 = new Intent(this, Redirect.class);
                startActivity(i2);
                ob.calc(getApplicationContext(), 140, 1, "Penne Pink Sauce Pasta");
                break;
            case R.id.radioButton10:
                meesage.meesage(getApplicationContext(), "Mushroom Alferedo");
                amt = 140;

                Intent i3 = new Intent(this, Redirect.class);
                startActivity(i3);
                ob.calc(getApplicationContext(), 140, 1, "Noodles");
                break;
            case R.id.radioButton11:
                meesage.meesage(getApplicationContext(), "Spaghetti Strand Pasta");
                amt = 100;

                Intent i4 = new Intent(this, Redirect.class);
                startActivity(i4);
                ob.calc(getApplicationContext(), 120, 1, "Spaghetti Strand Pasta");
                break;
            case R.id.radioButton12:
                meesage.meesage(getApplicationContext(), "White Cheese Lasagna");
                amt = 80;

                Intent i5 = new Intent(this, Redirect.class);
                startActivity(i5);
                ob.calc(getApplicationContext(), 140, 1, "White Cheese Lasagna");
                break;
            case R.id.radioButton13:
                meesage.meesage(getApplicationContext(), "Veg Lasagna");
                amt = 100;
                Intent i6 = new Intent(this, Redirect.class);
                startActivity(i6);
                ob.calc(getApplicationContext(), 120, 1, "Veg Lasagna");
                break;
            case R.id.radioButton14:
                meesage.meesage(getApplicationContext(), "Lasagna Rolls");
                amt = 100;
                Intent i7 = new Intent(this, Redirect.class);
                startActivity(i7);
                ob.calc(getApplicationContext(), 140, 1, "Lasagna Rolls");
        }
    }
}
package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Chinese extends AppCompatActivity {

    int amt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
        RadioGroup chin;
        Button btreset,btsubmit;
        chin =findViewById(R.id.chin);
        btreset=findViewById(R.id.resetchin);
        btsubmit=findViewById(R.id.submitchin);
        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkid=chin.getCheckedRadioButtonId();
                if(checkid==-1)
                {
                    meesage.meesage(getApplicationContext(),"Please pick an option");
                }
                else
                {
                    findRadioButton(checkid);
                }
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chin.clearCheck();
            }
        });
}

    private void findRadioButton(int checkid) {
        Amount_Calculatorbeta o=new Amount_Calculatorbeta();
        switch (checkid)
        {
            case R.id.radioButton7:

                amt=150;

                Intent in=new Intent(this,Redirect.class);
                startActivity(in);
                o.calc(getApplicationContext(),150,1,"Spring Rolls");

                break;
            case R.id.radioButton8:
                meesage.meesage(getApplicationContext(),"Honey Chilli Potatoe");
                amt=120;
                Intent i1=new Intent(this,Redirect.class);
                startActivity(i1);

                o.calc(getApplicationContext(),120,1,"Honey Chilli Potatoe");

                break;
            case R.id.radioButton9:
                meesage.meesage(getApplicationContext(),"Veg Manchurian");


                amt=120;

                Intent i2=new Intent(this,Redirect.class);
                startActivity(i2);
                o.calc(getApplicationContext(),120,1,"Veg Manchurian");
                break;
            case R.id.radioButton10:
                meesage.meesage(getApplicationContext(),"Noodles");
                amt=80;

                Intent i3=new Intent(this,Redirect.class);
                startActivity(i3);
                o.calc(getApplicationContext(),80,1,"Noodles");
                break;
            case R.id.radioButton11:
                meesage.meesage(getApplicationContext(),"Chilli Garlic Noodles");
                amt=100;

                Intent i4=new Intent(this,Redirect.class);
                startActivity(i4);
                o.calc(getApplicationContext(),100,1,"Chilli Garlic Noodles");
                break;
            case R.id.radioButton12:
                meesage.meesage(getApplicationContext(),"Momo Steam");
                amt=80;

                Intent i5=new Intent(this,Redirect.class);
                startActivity(i5);
                o.calc(getApplicationContext(),80,1,"Momo Steam");
                break;
            case R.id.radioButton13:
                meesage.meesage(getApplicationContext(),"Momo Fried");
                amt=100;

                Intent i6=new Intent(this,Redirect.class);
                startActivity(i6);
                o.calc(getApplicationContext(),100,1,"Momo Fried");

                break;
            case R.id.radioButton14:
                meesage.meesage(getApplicationContext(),"Momo Chilli");
                amt=150;

                Intent i7=new Intent(this,Redirect.class);
                startActivity(i7);
                o.calc(getApplicationContext(),150,1,"Momo Chilli");

                break;
            case R.id.radioButton15:
                meesage.meesage(getApplicationContext(),"Chilli Cheese");
                amt=150;

                Intent i8=new Intent(this,Redirect.class);
                startActivity(i8);
                o.calc(getApplicationContext(),150,1,"Chilli Cheese");

                break;
            case R.id.radioButton16:
                meesage.meesage(getApplicationContext(),"Schezwan Fried Rice");
                amt=120;

                Intent i9=new Intent(this,Redirect.class);
                startActivity(i9);
                o.calc(getApplicationContext(),120,1,"Schezwan Fried Rice");
                break;
        }
    }
    }
package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Sandviches extends AppCompatActivity {
    int amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandviches);


            RadioGroup sand;
            Button btreset, btsubmit;
            sand = findViewById(R.id.sand);
            btreset = findViewById(R.id.resetchin);
            btsubmit = findViewById(R.id.submitchin);
            btsubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int checkid = sand.getCheckedRadioButtonId();
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
                    sand.clearCheck();
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
                    ob.calc(getApplicationContext(), 140, 1, "Grilled Cheese Sandvich ");

                    break;
                case R.id.radioButton8:
                    meesage.meesage(getApplicationContext(), "Veggie Sandvich ");
                    amt = 120;
                    Intent i1 = new Intent(this, Redirect.class);
                    startActivity(i1);

                    ob.calc(getApplicationContext(), 120, 1, "Veggie Sandvich");

                    break;
                case R.id.radioButton9:
                    meesage.meesage(getApplicationContext(), "Veggie Makhani Sandvich");


                    amt = 120;

                    Intent i2 = new Intent(this, Redirect.class);
                    startActivity(i2);
                    ob.calc(getApplicationContext(), 140, 1, "Veggie Makhani Sandvich");
                    break;
                case R.id.radioButton10:
                    meesage.meesage(getApplicationContext(), "Veg Special Burger");
                    amt = 140;

                    Intent i3 = new Intent(this, Redirect.class);
                    startActivity(i3);
                    ob.calc(getApplicationContext(), 100, 1, "Veg Special Burger");
                    break;
                case R.id.radioButton11:
                    meesage.meesage(getApplicationContext(), "Chesse Burger");
                    amt = 100;

                    Intent i4 = new Intent(this, Redirect.class);
                    startActivity(i4);
                    ob.calc(getApplicationContext(), 80, 1, "Chesse Burger");
                    break;
                case R.id.radioButton12:
                    meesage.meesage(getApplicationContext(), "Makhani Veggetable Burger");
                    amt = 80;

                    Intent i5 = new Intent(this, Redirect.class);
                    startActivity(i5);
                    ob.calc(getApplicationContext(), 90, 1, "Makhani Veggetable Burger");
                    break;
                case R.id.radioButton13:
                    meesage.meesage(getApplicationContext(), "Double Decker Burger");
                    amt = 100;
                    Intent i6 = new Intent(this, Redirect.class);
                    startActivity(i6);
                    ob.calc(getApplicationContext(), 140, 1, "Double Decker Burger");
                    break;

            }
        }
    }
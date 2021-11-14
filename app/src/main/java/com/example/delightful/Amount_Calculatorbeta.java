package com.example.delightful;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;

public class Amount_Calculatorbeta extends AppCompatActivity {
    static int famt = 0;


    static ArrayList<String> a = new ArrayList<String>();

    public void calc(Context context, int amt, int i, String name) {
        a.add(name);

        famt += (amt * i);

    }

    Button invoice, pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount__calculatorbeta);


        TextView tv = (TextView) findViewById(R.id.textView5);
        tv.setText("Your bill is " + famt + " rupees including GST \n ");

        invoice = (Button) findViewById(R.id.button4);
        pay = (Button) findViewById(R.id.button5);

        invoice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                openActivitynext();

            }
        });


        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://razorpay.com/payment-link/plink_HEGgslNAfYLlKj/test";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }

    private void openActivitynext() {


            Intent intent = new Intent(this, Invoice.class);
            startActivity(intent);
        }
    }




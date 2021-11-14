package com.example.delightful;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.*;

public class Invoice extends AppCompatActivity {
   Amount_Calculatorbeta obj=new Amount_Calculatorbeta();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, obj.a);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
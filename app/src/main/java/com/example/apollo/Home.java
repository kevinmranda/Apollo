package com.example.apollo;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements View.OnClickListener {

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> OurList = new ArrayList<>();
        OurList.add("Java");
        OurList.add("Go");
        OurList.add("C++");
        OurList.add("Gaga");

        ArrayAdapter<String> OurAdapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.list_title, OurList);

        listView.setAdapter(OurAdapter);

    }

    @Override
    public void onClick(View v) {

    }
}
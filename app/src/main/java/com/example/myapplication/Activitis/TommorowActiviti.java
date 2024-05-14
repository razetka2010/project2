package com.example.myapplication.Activitis;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapters.TommorowAdapter;
import com.example.myapplication.Domains.TommorowDomains;
import com.example.myapplication.R;

import java.util.ArrayList;

public class TommorowActiviti extends AppCompatActivity {


    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_tommorow);

        initRecylerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(TommorowActiviti.this, MainActivity.class)));
    }

    private void initRecylerView() {
        ArrayList<TommorowDomains> items = new ArrayList<>();

        items.add(new TommorowDomains("Sat", "storm", "storm", 25, 10));
        items.add(new TommorowDomains("Sun", "cloudy", "Rainy_sunny", 24, 16));
        items.add(new TommorowDomains("Mun", "cloudy_3", "Cloudy", 25, 15));
        items.add(new TommorowDomains("Tue", "cloudy_sunny", "Cloudy", 29, 13));
        items.add(new TommorowDomains("Wen", "sun", "Sunny", 28, 11));
        items.add(new TommorowDomains("Thu", "rainy", "Rainy", 25, 10));


        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTommorow = new TommorowAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }
}

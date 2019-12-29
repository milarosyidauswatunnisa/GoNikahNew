package com.informatika.gonikah.gedung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.informatika.gonikah.R;

public class GedungActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GedungAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gedung);
        findViewById(R.id.rv_gedung);
        adapter = new GedungAdapter();
        //adapter.setList();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

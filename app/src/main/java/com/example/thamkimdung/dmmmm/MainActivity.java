package com.example.thamkimdung.dmmmm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private ArrayList<Person> personArrayList;
    private DataAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        personArrayList = new ArrayList<>();
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        personArrayList.add(new Person("dung",22));
        dataAdapter = new DataAdapter(personArrayList,getApplicationContext());
        recyclerView.setAdapter(dataAdapter);


    }
}

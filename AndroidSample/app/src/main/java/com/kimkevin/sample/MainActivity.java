package com.kimkevin.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kimkevin.sample.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /**
     * find resource of RecyclerView and initialize it.
     */
    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    List<RecyclerViewAdapter.Type> dataSet = new ArrayList<>();
    dataSet.add(RecyclerViewAdapter.Type.Americano);
    dataSet.add(RecyclerViewAdapter.Type.Cafelatte);
    dataSet.add(RecyclerViewAdapter.Type.CafeMocha);
    dataSet.add(RecyclerViewAdapter.Type.Cappuccino);

    /**
     * set RecyclerViewAdapter to RecyclerView with Data.
     */
    recyclerView.setAdapter(new RecyclerViewAdapter(this, dataSet));
  }
}

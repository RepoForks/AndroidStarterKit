package com.androidstarterkit.module.sample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidstarterkit.module.R;
import com.androidstarterkit.module.ui.view.RecyclerViewFragment;

public class RecyclerViewActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_sample_main);

    if (savedInstanceState == null) {
      getSupportFragmentManager()
          .beginTransaction()
          .add(R.id.container, new RecyclerViewFragment())
          .commit();
    }
  }
}


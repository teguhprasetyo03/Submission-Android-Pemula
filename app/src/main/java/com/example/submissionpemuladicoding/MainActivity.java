package com.example.submissionpemuladicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.submissionpemuladicoding.Activity.AboutActivity;
import com.example.submissionpemuladicoding.Adapter.ListProgrammingAdapter;
import com.example.submissionpemuladicoding.Model.Programming;
import com.example.submissionpemuladicoding.Model.ProgrammingData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProgramming;
    private ArrayList<Programming> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProgramming = findViewById(R.id.recycle_programmming);
        rvProgramming.setHasFixedSize(true);

        list.addAll(ProgrammingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvProgramming.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        ListProgrammingAdapter listProgrammingAdapter = new ListProgrammingAdapter(list);
        rvProgramming.setAdapter(listProgrammingAdapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent about = new Intent(MainActivity.this ,AboutActivity.class);
                startActivity(about);
        }
    }
}

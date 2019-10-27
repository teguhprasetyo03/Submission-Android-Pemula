package com.example.submissionpemuladicoding.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submissionpemuladicoding.Model.Programming;
import com.example.submissionpemuladicoding.R;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_PROGRAMMING = "programming";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Programming programmingreceived = getIntent().getParcelableExtra("key");

        ImageView photo = findViewById(R.id.img_programming_detail);
        TextView name = findViewById(R.id.name_programming_detail);
        TextView desc = findViewById(R.id.description_detail_programming);

        Glide.with(this).load(programmingreceived.getPhoto()).apply(new RequestOptions().override(100 , 100)).into(photo);
        name.setText(programmingreceived.getName());
        desc.setText(programmingreceived.getDetail());
    }
}

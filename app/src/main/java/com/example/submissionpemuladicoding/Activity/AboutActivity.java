package com.example.submissionpemuladicoding.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.submissionpemuladicoding.R;

public class AboutActivity extends AppCompatActivity {
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        imgPhoto = findViewById(R.id.img_item_photo);

        Glide.with(this)
                .load("https://www.dicoding.com/images/small/avatar/2019102015371334db413bcbdda9a3d4370e2a3a44f90d.jpg")
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(imgPhoto);

    }
}

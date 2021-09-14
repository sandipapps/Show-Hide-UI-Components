package com.sandipbhattacharya.showhideuicomponents;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView ivCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCat = findViewById(R.id.imageView);
    }

    public void show(View view) {
        ivCat.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        ivCat.setVisibility(View.GONE);
    }
}

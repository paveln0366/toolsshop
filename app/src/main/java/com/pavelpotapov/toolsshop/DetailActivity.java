package com.pavelpotapov.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageViewItem;
    private TextView textViewTitle;
    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        imageViewItem = findViewById(R.id.imageViewItem);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewInfo = findViewById(R.id.textViewInfo);
        Intent intent = getIntent();
        if (intent.hasExtra("resId") && intent.hasExtra("title") && intent.hasExtra("info")) {
            int resId = intent.getIntExtra("resId",-1);
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            imageViewItem.setImageResource(resId);
            textViewTitle.setText(title);
            textViewInfo.setText(info);
        } else {
            Intent backToListOfItems = new Intent(getApplicationContext(), ListOfItemsActivity.class);
            startActivity(backToListOfItems);
        }
    }
}
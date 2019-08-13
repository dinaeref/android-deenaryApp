package com.drf.myapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class DetailItem extends AppCompatActivity {

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_PRICE = "extra_price";
    public static String EXTRA_DESC = "extra_desc";
    public static String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);

        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvNameItem = findViewById(R.id.detail_name);
        TextView tvPrice = findViewById(R.id.detail_price);
        TextView tvDesc = findViewById(R.id.detail_desc);
        ImageView imageItem = findViewById(R.id.detail_image);

        String nameItem = getIntent().getStringExtra(EXTRA_NAME);
        String price = getIntent().getStringExtra(EXTRA_PRICE);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String image = getIntent().getStringExtra(EXTRA_IMAGE);

        tvNameItem.setText(nameItem);
        tvPrice.setText(price);
        tvDesc.setText(desc);

        Glide.with(this)
                .load(image)
                .apply(RequestOptions.circleCropTransform().transform(new RoundedCorners(20)))
                .into(imageItem);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

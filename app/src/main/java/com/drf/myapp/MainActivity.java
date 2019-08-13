package com.drf.myapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItem;
    private ArrayList<Item> list = new ArrayList<>();

    private void showSelectedItem(Item item) {
        Intent moveIntent = new Intent(MainActivity.this, DetailItem.class);
        moveIntent.putExtra(DetailItem.EXTRA_NAME, item.getNameItem());
        moveIntent.putExtra(DetailItem.EXTRA_PRICE, item.getPrice());
        moveIntent.putExtra(DetailItem.EXTRA_DESC, item.getDesc());
        moveIntent.putExtra(DetailItem.EXTRA_IMAGE, item.getPhoto());
        startActivity(moveIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       rvItem = findViewById(R.id.rv_barang);
       rvItem.setHasFixedSize(true);

       list.addAll(ItemData.getListData());
       showRecylerList();
    }

    private void showRecylerList() {
        rvItem.setLayoutManager(new LinearLayoutManager(this));
        ListItemAdapter adapter = new ListItemAdapter(list);
        rvItem.setAdapter(adapter);


        adapter.setOnItemClickCallback(new ListItemAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Item data) {
                showSelectedItem(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_profile:
                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntent);
                break;
        }
    }
}

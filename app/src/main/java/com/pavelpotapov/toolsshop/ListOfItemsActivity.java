package com.pavelpotapov.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfItemsActivity extends AppCompatActivity {

    private ListView listViewItems;
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_items);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        items = new ArrayList<>();
        items.add(new Item(getString(R.string.drill_title_bosch_gsb_13_re), getString(R.string.drill_info_bosch_gsb_13_re), R.drawable.drill_bosch_gsb_13_re));
        items.add(new Item(getString(R.string.drill_title_makita_hp1631), getString(R.string.drill_info_makita_hp1631), R.drawable.drill_makita_hp1631));
        items.add(new Item(getString(R.string.drill_title_patriot_fd_750h), getString(R.string.drill_info_patriot_fd_750h), R.drawable.drill_patriot_fd_750h));
        listViewItems = findViewById(R.id.listViewItems);
        ArrayAdapter<Item> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listViewItems.setAdapter(adapter);
        listViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
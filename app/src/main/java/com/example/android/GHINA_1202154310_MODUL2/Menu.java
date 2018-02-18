package com.example.android.GHINA_1202154310_MODUL2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> menus = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, menus, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            menus.add("Choco Glaze Donut");
            menus.add("Caramel Ring Donut");
            menus.add("Chocolate Bar");
            menus.add("Icing Cookies");
            menus.add("Cold Smoothies");

            priceses.add(85000);
            priceses.add(80000);
            priceses.add(75000);
            priceses.add(85000);
            priceses.add(90000);

            photos.add(R.drawable.chocoglazedonut);
            photos.add(R.drawable.caramelringdonut);
            photos.add(R.drawable.chocolatebar);
            photos.add(R.drawable.icingcookies);
            photos.add(R.drawable.smoothies);
        }
    }
}

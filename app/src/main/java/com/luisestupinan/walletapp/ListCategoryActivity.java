package com.luisestupinan.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

public class ListCategoryActivity extends AppCompatActivity {

    private ArrayList<Category> listCategorytRV = new ArrayList<>();
    private RecyclerView myRecycleCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        loadFakeData2();

        myRecycleCategory = findViewById(R.id.rv_list_category);
        CategoryAdapter myAdapter = new CategoryAdapter(listCategorytRV);
        myRecycleCategory.setAdapter(myAdapter);
        myRecycleCategory.setLayoutManager(new LinearLayoutManager(ListCategoryActivity.this));
    }

    private void loadFakeData2() {
        Category myCategory1 = new Category("Restaurante", "descripción", "#33FF3C","https://cdn-icons-png.flaticon.com/512/3310/3310748.png");
        Category myCategory2 = new Category("Gasolineria","descripción","#33FF3C","https://cdn-icons-png.flaticon.com/512/3485/3485537.png");
        Category myCategory3 = new Category("Arriendo","descripción","#33FF3C","https://w7.pngwing.com/pngs/501/7/png-transparent-lease-computer-icons-renting-house-apartment-house-angle-text-apartment.png");
        listCategorytRV.add(myCategory1);
        listCategorytRV.add(myCategory2);
        listCategorytRV.add(myCategory3);
    }
}
package com.luisestupinan.walletapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NewCategoryActivity extends AppCompatActivity {


    private ImageView iv2back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_rb);

        iv2back = findViewById(R.id.iv2_back);


        iv2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(NewCategoryActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });


    }

}


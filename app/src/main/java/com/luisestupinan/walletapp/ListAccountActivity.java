package com.luisestupinan.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account>listAccountRV=new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_account);
        AccountAdapter myAdaptador = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia","cuenta de ahorros",1000302.0, "https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Davivienda","cuenta debito",1003402.0, "https://play-lh.googleusercontent.com/Q9L3SKs70QGK2O7eicNehbneYeXWk2VEFxLOVQPPei4hyRe3RZDwBZeXr7DYKZuagDOL");
        Account myAccount3 = new Account("Efecto","Efectivo",1058402.0, "https://static.vecteezy.com/system/resources/previews/009/303/600/non_2x/pack-of-dollars-money-clipart-design-illustration-free-png.png");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}



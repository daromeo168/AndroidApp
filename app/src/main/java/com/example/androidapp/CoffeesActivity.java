package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.Arrays;

public class CoffeesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffees);

        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        loadBuyers();

    }


    private void loadBuyers() {
        String url = "http://10.0.2.2/android/FinalData.json";

        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Email[] emails = gson.fromJson(response,Email[].class);
                EmailsAdapter email = new EmailsAdapter(emails);
                recyclerView.setAdapter(email);
                Log.d("ProductsError","success"+ Arrays.toString(emails));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(CoffeesActivity.this,"Error",Toast.LENGTH_LONG);
                Log.d("ProductsError","Load error"+error.getMessage());

            }
        });

        Volley.newRequestQueue(this).add(request);
    }


}



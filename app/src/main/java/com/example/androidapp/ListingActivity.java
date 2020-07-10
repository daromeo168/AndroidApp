package com.example.androidapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);
        //Make
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Email[] emails = loadEmails();
        EmailsAdapter adapter = new EmailsAdapter(emails);
        recyclerView.setAdapter(adapter);
    }
    private Email[] loadEmails(){
        Email email1 = new Email();
        email1.setSender("Zeldris");
        email1.setSubject("Organizing Events");
        email1.setBody("I would like to cooperate an event which providing promotion for the customer in a period of time");

        Email email2 = new Email();
        email2.setSender("Gloxinia");
        email2.setSubject("Appreciation");
        email2.setBody("Congratulation on your grand opening.");

        Email email3 = new Email();
        email3.setSender("Drole");
        email3.setSubject("Request");
        email3.setBody("We would like to requested for an outdoor design for a better atmosphere experience");

        return new Email[]{email1, email2};

    }
}

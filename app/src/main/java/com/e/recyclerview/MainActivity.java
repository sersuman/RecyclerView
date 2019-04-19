package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contact;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //create a list of contacts
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Saugat Malla","980123344",R.drawable.saugat));
        contactList.add(new Contact("Rajesh Hmala","980123344",R.drawable.rajesh));
        contactList.add(new Contact("Dahayang Rai","980123344",R.drawable.dahayang));
        contactList.add(new Contact("Bhuwan KC","980123344",R.drawable.bhuwan));

///       Pass List to adapter class
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

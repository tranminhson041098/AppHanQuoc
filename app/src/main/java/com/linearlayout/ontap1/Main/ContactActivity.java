package com.linearlayout.ontap1.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import com.linearlayout.ontap1.Main.Adapter.ContactAdapter;
import com.linearlayout.ontap1.Model.Contact;
import com.linearlayout.ontap1.R;
import com.linearlayout.ontap1.Utils.Utils;

public class ContactActivity extends AppCompatActivity {

    Contact contactData;
    RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        init();
        docjson();
        configRvContact();

    }

    void init() {
        rvContact = findViewById(R.id.rv_contact);
    }

    private void docjson() {

        String strcontactData = Utils.loadJSONFromAsset(this);
        Gson gson = new Gson();
        contactData = gson.fromJson(strcontactData, Contact.class);

    }

    void configRvContact() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvContact.setLayoutManager(linearLayoutManager);
        ContactAdapter adapter = new ContactAdapter();
        adapter.setContext(this);
        adapter.setData(contactData.getResult());
        rvContact.setAdapter(adapter);
    }

}

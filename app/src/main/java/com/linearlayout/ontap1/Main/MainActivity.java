package com.linearlayout.ontap1.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

import com.linearlayout.ontap1.Main.Adapter.ContactAdapter;
import com.linearlayout.ontap1.R;

public class MainActivity extends AppCompatActivity {

    Button btnPlace,btnContact,btnPromotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Xuly();

    }

    void Xuly()
    {
        btnPromotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PromotionActivity.class);
                startActivity(intent);

            }
        });

        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlaceActivity.class);
                startActivity(intent);

            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(intent);


            }
        });


    }
    void init()
    {
        btnContact=(Button) findViewById(R.id.btn_contact);
        btnPlace=(Button) findViewById(R.id.btn_place);
        btnPromotion =(Button) findViewById(R.id.btn_promotion);

    }
}

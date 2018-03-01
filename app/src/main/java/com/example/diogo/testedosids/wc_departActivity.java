package com.example.diogo.testedosids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wc_departActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc_depart);

        final Button wcFundo_3 = findViewById(R.id.wc0);
        wcFundo_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo -3",getApplicationContext());
            }
        });
        final Button wc_3 = findViewById(R.id.wc1);
        wc_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC -3",getApplicationContext());
            }
        });
        final Button wcFundo_2 = findViewById(R.id.wc3);
        wcFundo_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo -2",getApplicationContext());
            }
        });
        final Button wc_2 = findViewById(R.id.wc4);
        wc_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC -2",getApplicationContext());
            }
        });
        final Button wcFundo_1 = findViewById(R.id.wc5);
        wcFundo_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo -1",getApplicationContext());
            }
        });
        final Button wc_1 = findViewById(R.id.wc6);
        wc_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC -1",getApplicationContext());
            }
        });
        final Button wcFundo0 = findViewById(R.id.wc7);
        wcFundo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo 0",getApplicationContext());
            }
        });
        final Button wc0 = findViewById(R.id.wc8);
        wc0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC 0",getApplicationContext());
            }
        });
        final Button wcFundo1 = findViewById(R.id.wc9);
        wcFundo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo 1",getApplicationContext());
            }
        });
        final Button wc1 = findViewById(R.id.wc10);
        wc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC 1",getApplicationContext());
            }
        });
        final Button wcFundo2 = findViewById(R.id.wc11);
        wcFundo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo 2",getApplicationContext());
            }
        });
        final Button wc2 = findViewById(R.id.wc12);
        wc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC 2",getApplicationContext());
            }
        });
        final Button wcFundo3 = findViewById(R.id.wc13);
        wcFundo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC fundo 3",getApplicationContext());
            }
        });
        final Button wc3 = findViewById(R.id.wc14);
        wc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "WC 3",getApplicationContext());
            }
        });


    }
}

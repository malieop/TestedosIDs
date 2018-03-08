package com.example.diogo.testedosids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AndaresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andares);

        final Button andar_3 = findViewById(R.id.a0);
        andar_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar -3",getApplicationContext());
            }
        });
        final Button andar_2 = findViewById(R.id.a1);
        andar_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar -2",getApplicationContext());
            }
        });
        final Button andar_1 = findViewById(R.id.a2);
        andar_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar -1",getApplicationContext());
            }
        });
        final Button andar0 = findViewById(R.id.a3);
        andar0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar 0",getApplicationContext());
            }
        });
        final Button andar1 = findViewById(R.id.a4);
        andar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar 1",getApplicationContext());
            }
        });
        final Button andar2 = findViewById(R.id.a5);
        andar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar 2",getApplicationContext());
            }
        });
        final Button andar3 = findViewById(R.id.a6);
        andar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Andar 3",getApplicationContext());
            }
        });
        final Button salaestudo0 = findViewById(R.id.se0);
        salaestudo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Sala Estudo 0",getApplicationContext());
            }
        });
        final Button salaestudo1 = findViewById(R.id.se1);
        salaestudo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Sala Estudo 1",getApplicationContext());
            }
        });
        final Button salaestudo2 = findViewById(R.id.se2);
        salaestudo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Sala Estudo 2",getApplicationContext());
            }
        });
        final Button salaestudo3 = findViewById(R.id.se3);
        salaestudo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManage wifi = new WifiManage();
                DBManager.getDBManager().insertDatabase( wifi, "Sala Estudo 3",getApplicationContext());
            }
        });


    }


}

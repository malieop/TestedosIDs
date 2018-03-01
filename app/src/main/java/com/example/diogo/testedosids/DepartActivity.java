package com.example.diogo.testedosids;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DepartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depart);

        final Button departamento0 = findViewById(R.id.d0);
        departamento0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String id;
                id = WifiManage.getId(getApplicationContext());
                Toast.makeText(DepartActivity.this, id, Toast.LENGTH_SHORT).show();
               WifiManage wifi = new WifiManage();
               DBManager.insereDatabase( wifi, "Departamento0",getApplicationContext());

            }
        });
        final Button departamento1 = findViewById(R.id.d1);
        departamento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id;
                id = WifiManage.getId(getApplicationContext());
                Toast.makeText(DepartActivity.this, id, Toast.LENGTH_SHORT).show();
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "Departamento1",getApplicationContext());

            }
        });
        final Button departamento2 = findViewById(R.id.d2);
        departamento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id;
                id = WifiManage.getId(getApplicationContext());
                Toast.makeText(DepartActivity.this, id, Toast.LENGTH_SHORT).show();
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "Departamento2",getApplicationContext());

            }
        });
        final Button departamento3 = findViewById(R.id.d3);
        departamento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id;
                id = WifiManage.getId(getApplicationContext());
                Toast.makeText(DepartActivity.this, id, Toast.LENGTH_SHORT).show();
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "Departamento Academico",getApplicationContext());

            }
        });
    }
}

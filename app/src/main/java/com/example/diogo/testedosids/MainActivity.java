package com.example.diogo.testedosids;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBManager db = new DBManager();
        db.initDatabase();

        final Button andarButton = findViewById(R.id.Andar);
        andarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent;
                intent = new Intent(getApplicationContext(),AndaresActivity.class);
                startActivity(intent);
            }
        });
        final Button salaestudoButton = findViewById(R.id.SalaEstudo);
        salaestudoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent;
                intent = new Intent(getApplicationContext(),AndaresActivity.class);
                startActivity(intent);

            }
        });
        final Button wcButton = findViewById(R.id.WC);
        wcButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent;
                intent = new Intent(getApplicationContext(),wc_departActivity.class);
                startActivity(intent);

            }
        });
        final Button biblioButton = findViewById(R.id.Biblio);
        biblioButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "Biblioteca",getApplicationContext());
            }
        });
        final Button departButton = findViewById(R.id.Depart);
        departButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent;
                intent = new Intent(getApplicationContext(),DepartActivity.class);
                startActivity(intent);

            }
        });
        final Button barButton = findViewById(R.id.Bar);
        barButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                return wifiInfo.getBSSID();*/
                WifiManage wifi = new WifiManage();
                DBManager.insereDatabase( wifi, "Bar",getApplicationContext());

            }
        });


    }
    /*public void clickAndar(View view){
        Intent intent = new Intent(this, AndaresActivity.class);
        startActivity(intent);

    }*/
}

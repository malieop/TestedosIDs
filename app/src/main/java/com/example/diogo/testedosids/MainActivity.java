package com.example.diogo.testedosids;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
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
       // REQUEST PERMISSIONS
        final int Request_Write_External_Storage = 1 ;
        final int Request_Read_External_Storage = 2 ;
        /*if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED) {



                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_CONTACTS},
                        MY_PERMISSIONS_REQUEST_READ_CONTACTS);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.

        }*/
        if (!DBManager.databaseExists()) {
            DBManager.initDatabase();
        }

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
                DBManager.getDBManager().insertDatabase( wifi, "Biblioteca",getApplicationContext());
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
                DBManager.getDBManager().insertDatabase( wifi, "Bar",getApplicationContext());

            }
        });


    }
    /*public void clickAndar(View view){
        Intent intent = new Intent(this, AndaresActivity.class);
        startActivity(intent);

    }*/
}

package com.example.juan.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataBaseManager adbManager = new DataBaseManager(this, "EXAMEN_DATA_BASE");
        //UsersDataBaseManager udbManager = new UsersDataBaseManager(this,"users");

    }
}

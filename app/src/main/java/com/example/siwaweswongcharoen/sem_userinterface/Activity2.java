package com.example.siwaweswongcharoen.sem_userinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }

    public void goActivity3(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}

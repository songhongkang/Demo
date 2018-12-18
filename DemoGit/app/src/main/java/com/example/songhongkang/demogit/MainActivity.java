package com.example.songhongkang.demogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("小王开发", "onCreate: ");

        Log.d("小宋加入开发", "onCreate: ");

        Log.d("小宋加入开发，并做了一个牛逼功能", "onCreate: ");

        Log.d("小宋加入开发，并做了一个牛逼功能", "onCreate: ");

    }
}

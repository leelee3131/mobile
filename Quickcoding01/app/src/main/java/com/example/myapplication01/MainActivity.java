package com.example.myapplication01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int arr[]=new int[10];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Onclick_avg(View view) {
        avg m = new avg();

        Toast.makeText(getApplicationContext(), String.valueOf(m.result(arr)), Toast.LENGTH_SHORT).show();


    }

    public void Onclick_min(View view) {
        min m = new min();
        Toast.makeText(getApplicationContext(), String.valueOf(m.result(arr)), Toast.LENGTH_SHORT).show();

    }

    public void Onclick_number(View view) {
        Random random = new Random();
        String str="";
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(30);
            str=str+String.valueOf(arr[i])+" ";
        }
        TextView textView= (TextView) findViewById(R.id.arr);
        textView.setText(str);
    }
}


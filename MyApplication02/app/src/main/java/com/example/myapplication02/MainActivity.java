package com.example.myapplication02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count=0,min=0,max=501;
    int v=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void btn1(View view) {
        Random random=new Random();
        v=random.nextInt(500);
        String str=String.valueOf(v);
        Toast.makeText(getApplicationContext(),str+" is right?",Toast.LENGTH_SHORT).show();
    }

    public void btn2(View view) {

        max=v;
        v=(min+max)/2;
        count++;

        Toast.makeText(getApplicationContext(),String.valueOf(v)+" is right?",Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view) {

        min=v;
        v=(min+max)/2;
        count++;
        Toast.makeText(getApplicationContext(),String.valueOf(v)+" is right?",Toast.LENGTH_SHORT).show();
    }

    public void btn4(View view) {
        Toast.makeText(getApplicationContext(),"congratulation you find "+String.valueOf(count)+" times!",Toast.LENGTH_LONG).show();
        count=0;min=0;max=501;
    }
}

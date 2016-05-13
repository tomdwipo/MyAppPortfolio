package com.tommyputranto.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void popularMovie(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my popular movies App", Toast.LENGTH_SHORT).show();
    }

    public void stockHawk(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my stock hawk App", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my build it bigger App", Toast.LENGTH_SHORT).show();
    }

    public void makeYourAppMaterial(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my make your app material App", Toast.LENGTH_SHORT).show();
    }

    public void goUbiquitous(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my go ubiquitous App", Toast.LENGTH_SHORT).show();
    }

    public void capstone(View view) {
        Toast.makeText(MainActivity.this, "This Button will launch my capstone App", Toast.LENGTH_SHORT).show();
    }

}

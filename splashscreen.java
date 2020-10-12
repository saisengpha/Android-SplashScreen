package com.activity.splashsc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // remove title
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(3 * 1000);

                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);

                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();
    }
}

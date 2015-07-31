package com.example.ellis_wu.customdialogdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button btn_open;
    private Button btn_delay_open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test git commit
        btn_open = (Button)findViewById(R.id.btn_open);
        btn_delay_open = (Button)findViewById(R.id.btn_delay_open);

        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CustomDialogActivity.class);
                startActivity(intent);
            }
        });

        btn_delay_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CustomDialogActivity.class);
                try {
                    Thread.sleep(5000);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

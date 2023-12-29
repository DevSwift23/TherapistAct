package com.geronimo.markjoseph.therapistactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public Button buttonchat;

    public Button buttonlocation;

    public Button buttonai;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivity();
    }

    public void openActivity() {
        setContentView(R.layout.activity_main);

        buttonchat = findViewById(R.id.chatnow_btn);
        buttonchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TheraphyActivity.class);
                startActivity(intent);
            }
        });

        buttonai = findViewById(R.id.aichat_btn);
        buttonai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatAi.class);
                startActivity(intent);
            }
        });
        buttonlocation = findViewById(R.id.viewlocation_btn);
        buttonlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewLocation.class);
                startActivity(intent);
            }
        });
    }


}
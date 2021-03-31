package com.example.first_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button video_streaming_btn;
    Button img_10_btn;
    Button img_50_btn;
    Button img_100_btn;
    Button photo_upload_btn;
    Button sns_login_btn;
    Button payment_btn;
    Button email_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video_streaming_btn = findViewById(R.id.main_video_streaming_btn);
        video_streaming_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoStreamingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        img_10_btn = findViewById(R.id.main_img_10_btn);
        img_10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Image10Activity.class);
                startActivity(intent);
                finish();
            }
        });

        img_50_btn = findViewById(R.id.main_img_50_btn);
        img_50_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Image50Activity.class);
                startActivity(intent);
                finish();
            }
        });

        img_100_btn = findViewById(R.id.main_img_100_btn);
        img_100_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Image100Activity.class);
                startActivity(intent);
                finish();
            }
        });

        photo_upload_btn = findViewById(R.id.main_img_upload_btn);
        photo_upload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhotoUploadActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sns_login_btn = findViewById(R.id.main_sns_login_btn);
        sns_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SnsLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        payment_btn = findViewById(R.id.main_payment_btn);
        payment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });

        email_btn = findViewById(R.id.main_email_confirm_btn);
        email_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EmailActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
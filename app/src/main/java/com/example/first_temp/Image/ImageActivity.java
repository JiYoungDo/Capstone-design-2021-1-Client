package com.example.first_temp.Image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.example.first_temp.R;

public class ImageActivity extends AppCompatActivity {

    Button img_http_1_1, img_http_2_0;
    WebView img_web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        img_web_view = findViewById(R.id.img_webview);


        // http1.1 통신
        img_http_1_1 = findViewById(R.id.img_http_1_1);
        img_http_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_web_view.setVisibility(View.GONE);
                // 통신 진행
                img_web_view.loadUrl("");
            }
        });

        // http2.0 통신
        img_http_2_0 = findViewById(R.id.img_http_2_0);
        img_http_2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_web_view.setVisibility(View.GONE);
                // 통신 진행
                img_web_view.loadUrl("https://dojii.shop");
            }
        });


    }
}
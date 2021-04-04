package com.example.first_temp.Image;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
                img_web_view.setVisibility(View.VISIBLE);
                img_http_1_1.setVisibility(View.GONE);
                img_http_2_0.setVisibility(View.GONE);

                // 통신 진행
                WebSettings settings = img_web_view.getSettings();
                settings.setJavaScriptEnabled(true);
                img_web_view.loadUrl("172.30.1.28:9000");

            }
        });


        // http2.0 통신
        img_http_2_0 = findViewById(R.id.img_http_2_0);
        img_http_2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_web_view.setVisibility(View.VISIBLE);
                img_http_1_1.setVisibility(View.GONE);
                img_http_2_0.setVisibility(View.GONE);

                // 통신 진행
                WebSettings settings = img_web_view.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setBuiltInZoomControls(true);
                img_web_view.setWebViewClient(new SslWebViewConnect());
                img_web_view.setWebChromeClient(new WebChromeClient(){
                    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onPermissionRequest(final PermissionRequest request) {
                        request.grant(request.getResources());
                    }
                });

                img_web_view.loadUrl("https://dojii.shop");
            }
        });


    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("check URL", url);
            view.loadUrl(url);
            return true;
        }
    }

    //웹뷰 로드시 SSL 인증서 에러 방지
    public class SslWebViewConnect extends WebViewClient {

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed(); // SSL 에러가 발생해도 계속 진행!
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;//응용프로그램이 직접 url를 처리함
        }

    }
}
package com.lx.android_commerce.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.DarkConstant;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.act_detail_webView)
    WebView actDetailWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        String detailUrl = getIntent().getStringExtra(DarkConstant.HOME_MORE_LIST_DETAIL_URL);

        WebSettings settings = actDetailWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true); //将图片调整到适合webview的大小
        settings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小

        actDetailWebView.setWebViewClient(new WebViewClient());

        actDetailWebView.loadUrl(detailUrl);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //清除网页访问留下的缓存
        actDetailWebView.clearCache(true);
        actDetailWebView.clearHistory();
//这个api仅仅清除自动完成填充的表单数据，并不会清除WebView存储到本地的数据
        actDetailWebView.clearFormData();
    }
}
package com.lx.android_commerce.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.app.PayTask;
import com.lx.android_commerce.R;
import com.lx.android_commerce.weight.zfb.AuthResult;
import com.lx.android_commerce.weight.zfb.PayResult;
import com.lx.android_commerce.weight.zfb.util.OrderInfoUtil2_0;
import com.lx.lib_core.weight.utils.LogUtil;

import org.greenrobot.eventbus.EventBus;

import java.util.Map;

public class DarkPayActivity extends AppCompatActivity {

    /**
     * 用于支付宝支付业务的入参 app_id。
     */
    public static final String APPID = "2021000116686191";

    /**
     *  pkcs8 格式的商户私钥。
     *
     * 	如下私钥，RSA2_PRIVATE 或者 RSA_PRIVATE 只需要填入一个，如果两个都设置了，本 Demo 将优先
     * 	使用 RSA2_PRIVATE。RSA2_PRIVATE 可以保证商户交易在更加安全的环境下进行，建议商户使用
     * 	RSA2_PRIVATE。
     *
     * 	建议使用支付宝提供的公私钥生成工具生成和获取 RSA2_PRIVATE。
     * 	工具地址：https://doc.open.alipay.com/docs/doc.htm?treeId=291&articleId=106097&docType=1
     */
    public static final String RSA2_PRIVATE = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCtqnD0GikoAzgCXCD3pJZ7n5eQv/aim5iLCTbxf7ElLaPmxaIGryuiPOJ6rZbx8GXZKFMet4bv3rinoMzFPlM+0jneArkbYRo8eQHj3wSJilhpYT+btXmkp5OYSeDVTDnugfIO9B7QIYlolzh2XBMJeCNTM7kaf6oF1D7WhKa76MonX1OOMHhdeQoV1c3SEZkO+R9vfNYNa8WdoNnhob2QaWq5KACLANT1oD8njzBlHmVQsq+YLiGtX8zbwpii+POqeePlv+cLuWEA3Y+YFAdBCV7ubbzfdHI+/mY4jL1qUfz95onJ+6+dWRuDXbJGL2nYciHabGX+4Q3raRjmMHv9AgMBAAECggEBAINXfVfQFUJStOBsBu7kBn92oq1x0TkHzmWQ0YHx3erNSsE0xSajArAPtgWsFZXjB1QmQD7h9GajnioA3f1q9pBzdBppGtAPL0V/CyPovki7XcRNLUs5A8e4iVLKxQTsQoAUvRn8HPWx93cnrycs2aT2vFinrJ3S4abI78FTz7oaxAMpqhgVAjfrgng0IodBeweNGMxL2xZQrbT0iYTvHMEVQUwkCfJI7zuPY3Qc3AUMHHojxW41XJo4g/9r/jadj4/brPe+YImmnIXEkp9kn8juoNyEEl1CCwKhMcTjs3fmfSejp5jrzy5cab69cEnDy+3txbjplBUkz/3lhqBf6C0CgYEA5UQOrWtHCMfYRuoAfc3L+goLxrtPcGEZ2eq9zrU2omwRWHU6v+v8sNVoqK/d+ud8SFomdsIFpPJfBst9D2fKGaugX62W+PrBUCP4Z5zjWEYNS6xz6e+yYqZkA9xnGzZS+YobBk5VsZD33mE360khw06urxTcFuIoBMSd5LUJ2FsCgYEAweqiqrQXrQ2Amn5hm+x4zeAYZ549DNM1QAIF07hnz/nE+NdrijBWX+Gv7kDcEnJ4nYb/1g1XZWm3d3Vv79hP1Cgu9KsNVQ4Qx3jsEz6CN1zg8za2JK4mpDgDNv/4nTs43EfiOPx1tHJ4143HWL3tUyWCKlR51M2E4Skz/2l7bIcCgYEAgewOcUIw8A3oR0+GVcSRCjI1ODqfquyr7K01QPW6b1LUhY9xap9+BGv7slRvdCdIa+wCjhwnfLEJHt2kEl3bzq5O5MmHm7LmZ9bqhzUGNNkF4dNpoLGAIp1uYi29lFM1tEoKRImR0F15yeDIAqLf6kElhvxIOQOScBlH7PqXCK8CgYBNJaTrltRog5urWyZIGy8AcOwkpR6SsKBZw7Q/w/iBFFRZz5I4GvzyDl6oweML78Cuoxu7M/mWHhXgj7cly4AO3qG3symNshfY0/HPwimaDvhrqlOSijpTUPlucy2cmAgKEwscMsw9KuGKmBw74Ou/DYgYgR0rHUyFK5hFP9jblwKBgGVCP1x6RAWjkwwTNixE/djNdnbbFOl5ARLrGFe434SnMqU4iS2uHtKln6ppcbwh02IDXIOvm39GOAZwYYndteRfaRDhLcZnQYwGB8vP+uGv+HXbcHtQrSPt2YBAsk/hxU0oQDLpGNtZlD/HN+CpAJqLSyatmkpIW6lm3olnztTm";
    public static final String RSA_PRIVATE = "";

    private static final int SDK_PAY_FLAG = 1;
    private static final int SDK_AUTH_FLAG = 2;

    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @SuppressWarnings("unused")
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SDK_PAY_FLAG: {
                    @SuppressWarnings("unchecked")
                    PayResult payResult = new PayResult((Map<String, String>) msg.obj);
                    /**
                     * 对于支付结果，请商户依赖服务端的异步通知结果。同步通知结果，仅作为支付结束的通知。
                     */
                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息
                    String resultStatus = payResult.getResultStatus();
                    // 判断resultStatus 为9000则代表支付成功
                    if (TextUtils.equals(resultStatus, "9000")) {
                        // 该笔订单是否真实支付成功，需要依赖服务端的异步通知。

                        //通知购物车删除对应商品,
                        EventBus.getDefault().post("pay result is success");
                        finish();
                    } else {
                        // 该笔订单真实的支付结果，需要依赖服务端的异步通知。
                        LogUtil.getInstance().logI("支付失败"+payResult.getResult());
                    }
                    break;
                }
                case SDK_AUTH_FLAG: {
                    @SuppressWarnings("unchecked")
                    AuthResult authResult = new AuthResult((Map<String, String>) msg.obj, true);
                    String resultStatus = authResult.getResultStatus();

                    // 判断resultStatus 为“9000”且result_code
                    // 为“200”则代表授权成功，具体状态码代表含义可参考授权接口文档
                    if (TextUtils.equals(resultStatus, "9000") && TextUtils.equals(authResult.getResultCode(), "200")) {
                        // 获取alipay_open_id，调支付时作为参数extern_token 的value
                        // 传入，则支付账户为该授权账户
                        LogUtil.getInstance().logI("授权成功"+authResult);
                    } else {
                        // 其他状态值则为授权失败
                        LogUtil.getInstance().logI("授权失败"+authResult);
                    }
                    break;
                }
                default:
                    break;
            }
        };
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark_pay);
        //打开沙箱环境
        EnvUtils.setEnv(EnvUtils.EnvEnum.SANDBOX);
        Intent intent = getIntent();
        if(intent != null) {
            double allMoney = intent.getDoubleExtra("allMoney",0.0);
            payV2(allMoney);
            LogUtil.getInstance().logI(allMoney);
        }
    }

    /**
     * 支付宝支付业务示例
     */
    public void payV2(double price) {
        if (TextUtils.isEmpty(APPID) || (TextUtils.isEmpty(RSA2_PRIVATE) && TextUtils.isEmpty(RSA_PRIVATE))) {
            LogUtil.getInstance().logE("支付宝错误payV2",101);
            return;
        }

        /*
         * 这里只是为了方便直接向商户展示支付宝的整个支付流程；所以Demo中加签过程直接放在客户端完成；
         * 真实App里，privateKey等数据严禁放在客户端，加签过程务必要放在服务端完成；
         * 防止商户私密数据泄露，造成不必要的资金损失，及面临各种安全风险；
         *
         * orderInfo 的获取必须来自服务端；
         */
        boolean rsa2 = (RSA2_PRIVATE.length() > 0);
        Map<String, String> params = OrderInfoUtil2_0.buildOrderParamMap(APPID, rsa2,price);
        String orderParam = OrderInfoUtil2_0.buildOrderParam(params);

        String privateKey = rsa2 ? RSA2_PRIVATE : RSA_PRIVATE;
        String sign = OrderInfoUtil2_0.getSign(params, privateKey, rsa2);
        final String orderInfo = orderParam + "&" + sign;

        final Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                PayTask alipay = new PayTask(DarkPayActivity.this);
                Map<String, String> result = alipay.payV2(orderInfo, true);
                Log.i("msp", result.toString());

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

}
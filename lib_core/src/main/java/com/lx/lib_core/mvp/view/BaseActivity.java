package com.lx.lib_core.mvp.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lx.lib_core.mvp.presenter.IPresenter;

import javax.inject.Inject;

/**
 * @author : 阿森
 * @date : 2020-10-16 10:16
 * @params :
 * @description:
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView {

    @Inject
    protected P mPresenter;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        initView();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading(String msg) {
        if(progressDialog == null) {
            progressDialog  = new ProgressDialog(this);
        }
        progressDialog.setMessage(msg);
        progressDialog.show();
    }

    @Override
    public void hideLoading() {
        progressDialog.dismiss();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null) {
            mPresenter.onDestroy();
        }
    }
}

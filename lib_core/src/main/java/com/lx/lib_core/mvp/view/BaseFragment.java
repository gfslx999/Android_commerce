package com.lx.lib_core.mvp.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lx.lib_core.mvp.presenter.IPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author : 阿森
 * @date : 2020-10-16 10:21
 * @params :
 * @description:
 */
public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IView {

    private ProgressDialog progressDialog;
    private Unbinder bind;

    @Inject
    protected P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(bindLayout(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = ButterKnife.bind(this, view);
        initView();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading(String msg) {
        if(progressDialog == null) {
            progressDialog  = new ProgressDialog(getActivity());
        }
        progressDialog.setMessage(msg);
        progressDialog.show();
    }

    @Override
    public void hideLoading() {
        progressDialog.dismiss();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter != null) mPresenter.onDestroy();
        bind.unbind();
    }
}

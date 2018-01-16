package com.example.jyn.google_login_test;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by JYN on 2018-01-16.
 */

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    @VisibleForTesting
    public ProgressDialog progressDialog;

    public void showProgressDialog() {
        if(progressDialog == null) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setMessage(getString(R.string.loading));
            progressDialog.setIndeterminate(true);
        }
        progressDialog.show();
    }
    public void hideProgressDialog() {
        if(progressDialog !=null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        hideProgressDialog();
    }
}

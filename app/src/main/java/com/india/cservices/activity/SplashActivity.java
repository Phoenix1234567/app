package com.india.cservices.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.india.cservices.R;

/**
 * Created by shalini on 6/3/2017.
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splas_activity);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                 //   fetchUserDefaultsDetail();
                                    loginFailed();
                                }
                            }

                , 1000);
    }

    void success(){
      //  Intent loginIntent = new Intent(SplashActivity.this, MIDirectLoginActivity.class);
      //  startActivity(loginIntent);
      //  finish();
    }

    void loginFailed(){
        Intent loginIntent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(loginIntent);
        finish();
    }

}
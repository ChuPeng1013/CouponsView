package com.example.administrator.couponsview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by ChuPeng on 2016/8/10.
 */
public class DeatilActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detail);
    }
}

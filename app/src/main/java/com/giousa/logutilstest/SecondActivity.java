package com.giousa.logutilstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.giousa.logutilstest.utils.LogUtils;

/**
 * Description:
 * Author:Giousa
 * Date:2017/1/20
 * Email:65489469@qq.com
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LogUtils.d("第二个界面");
        Button start2 = (Button) findViewById(R.id.btn_start_second);
        start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogUtils.d("第二个界面 我被点击了");
            }
        });
    }
}
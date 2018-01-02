package com.test.widgetdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.et);
                Data.addLst(et.getText().toString()); //数据添加
                //添加待办事项 - Intent
                Intent intent = new Intent("add.com");
                sendBroadcast(intent); //发送 add.com 的广播
                finish();
            }
        });
    }
}

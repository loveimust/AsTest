package com.example.lenovo.astest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mName;
    private Button mBtn;
    private EditText mEnty;
    private Button mClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        initView();
        initData();
        setListener();
    }

    private void initData() {

    }


    private void initView() {
        mName =(TextView) findViewById(R.id.tv_name);
        mBtn = (Button) findViewById(R.id.btn_click);
        mEnty = (EditText) findViewById(R.id.et_enter);
        mClear = (Button) findViewById(R.id.btn_clear);



    }
    private void setListener() {
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mName.setText(mEnty.getText());
            }
        });
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEnty.setText("");
            }
        });

    }
}

package com.example.androidlibrarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.demolibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    TextView helloTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloTv = (TextView) findViewById(R.id.hello_tv);

        helloTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toaster.showToast(MainActivity.this,helloTv.getText().toString());
            }
        });


    }
}

package com.parkho.tasksample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class A3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);

        OnClickListener clickListener = new OnClickListener() {
            @Override
            public void onClick(View a_view) {
                Intent intent = new Intent(getApplication(), A4.class);
                startActivity(intent);
            }
        };
        findViewById(R.id.btn_start).setOnClickListener(clickListener);

        Log.e("parkho", "A3 onCreate");
    }
}

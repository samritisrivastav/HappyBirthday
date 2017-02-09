package com.example.toshiba.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_id);


        View.OnClickListener onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
            }
        };

        btn.setOnClickListener(onclick);
    }
}
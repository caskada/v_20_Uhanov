package com.example.uhanov_v_20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.editTxt);
        Button button = (Button) findViewById(R.id.buttongal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i;
              i = new Intent(MainActivity.this, MainActivity2.class);
              startActivity(i);
            }
        });


    }
}
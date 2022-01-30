package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tvDisplay);
        b1 = (Button) findViewById(R.id.btOne);
        b2 = (Button) findViewById(R.id.btTwo);
        b3 = (Button) findViewById(R.id.btThree);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(26);
                showMe(b1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextColor(Color.RED);
                showMe(b2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize((float) 14.5);
                tv.setTextColor(Color.GRAY);
                showMe(b3);
            }
        });
    }
    public void showMe(View view) {
        tv.setText("Hey this is my 1st MADL Exercise.");
        if(view == b1) {
            Toast t = Toast.makeText(this, "Size : 32", Toast.LENGTH_SHORT);
            t.show();
        } else if(view == b2) {
            Toast t = Toast.makeText(this, "Color : Red", Toast.LENGTH_SHORT);
            t.show();
        } else if(view == b3) {
            Toast t = Toast.makeText(this, "Changes Resetted", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
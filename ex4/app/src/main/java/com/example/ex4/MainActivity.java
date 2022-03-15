package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.badd);
        Button btn2 = findViewById(R.id.bsub);
        Button btn3 = findViewById(R.id.bmul);
        Button btn4 = findViewById(R.id.bdivide);

        EditText tview1 = (EditText) findViewById(R.id.numbox1);
        EditText tview2 = (EditText)findViewById(R.id.numbox2);
        TextView tview3 = (TextView) findViewById(R.id.resultbox);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(tview1.getText().toString());
                int num2 = Integer.valueOf(tview2.getText().toString());
                int num3 = num1+num2;
                tview3.setText(""+num3);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(tview1.getText().toString());
                int num2 = Integer.valueOf(tview2.getText().toString());
                int num3 = num1-num2;
                tview3.setText(""+num3);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(tview1.getText().toString());
                int num2 = Integer.valueOf(tview2.getText().toString());
                int num3 = num1*num2;
                tview3.setText(""+num3);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.valueOf(tview1.getText().toString());
                float num2 = Float.valueOf(tview2.getText().toString());
                float num4 = num1/num2;
                tview3.setText(""+num4);

            }
        });
    }
}
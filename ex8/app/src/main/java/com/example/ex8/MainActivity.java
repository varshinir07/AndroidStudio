package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ex8.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editTextTextPersonName);
        e2= (EditText) findViewById(R.id.editTextTextPersonName2);
        b= (Button) findViewById(R.id.button);
        b.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        if(view==b) {
            if(!s1.matches("[a-zA-Z]+") && s1.length()>0) {
                Toast t = Toast.makeText(getApplicationContext(), "Username should only consist of alphabets", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(!s2.matches("[0-9]+") && s2.length()>0){
                Toast t = Toast.makeText(getApplicationContext(), "Password should only consist of numbers", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(s1.length()==0 || s2.length()==0){
                Toast t = Toast.makeText(getApplicationContext(), "Both fields are mandatory", Toast.LENGTH_SHORT);
                t.show();
            }
            else if(!(s2.length()==4)){
                Toast t = Toast.makeText(getApplicationContext(), "Password length should be four", Toast.LENGTH_SHORT);
                t.show();
            }
            else{
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        }
    }
}
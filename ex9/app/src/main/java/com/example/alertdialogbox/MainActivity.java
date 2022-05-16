package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUname, etPwd;
    Button btnValidate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUname = (EditText) findViewById(R.id.etUname);
        etPwd = (EditText) findViewById(R.id.etPwd);
        btnValidate = (Button) findViewById(R.id.btnValidate);
        btnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(etUname.getText().toString().matches("[a-zA-Z]+") && etPwd.getText().toString().matches("[0-9]+") && etPwd.getText().toString().length() == 4) {
//                    Toast t = Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT);
//                    t.show();
//                } else {
//                    Toast t = Toast.makeText(getApplicationContext(), "Please re-check your username or password.", Toast.LENGTH_SHORT);
//                    t.show();
//                }
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("Are you sure,You wanted to open another activity");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(MainActivity.this,"You clicked YES button",Toast.LENGTH_LONG).show();
                        if(etUname.getText().toString().matches("[a-zA-Z]+") && etPwd.getText().toString().matches("[0-9]+") && etPwd.getText().toString().length() == 4) {
                            Intent intent = new Intent(getApplicationContext(), First.class);
                            startActivity(intent);
                        } else {
                            Toast t = Toast.makeText(getApplicationContext(), "Please re-check your username or password.", Toast.LENGTH_SHORT);
                            t.show();
                        }
                } });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast t = Toast.makeText(getApplicationContext(), "Clicked No.", Toast.LENGTH_SHORT);
                        t.show();
                    } });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });
    }
}
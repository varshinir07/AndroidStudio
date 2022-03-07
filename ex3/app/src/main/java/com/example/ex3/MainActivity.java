package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        final float[] fsize = {0};

        TextView tview1 = (TextView)findViewById(R.id.textView1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {


                fsize[0] = (fsize[0] + 5) % 50;
                tview1.setTextSize(fsize[0]);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int color1 = tview1.getCurrentTextColor();
                int newColor = 0;
                switch (color1) {
                    case Color.BLACK: //Initial Color
                        newColor = Color.RED;
                        break;
                    case Color.RED: //Red
                        newColor = Color.BLUE;
                        break;
                    case Color.BLUE: //Blue
                        newColor = Color.GREEN;
                        break;
                    case Color.GREEN: //Green
                        newColor = Color.RED;
                        break;
                }
                tview1.setTextColor(newColor);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout lay = (LinearLayout) findViewById(R.id.contain);
//                lay.setBackgroundColor(Color.WHITE);

//                LinearLayout lay = (LinearLayout) findViewById(R.id.contain);
                ColorDrawable viewColor = (ColorDrawable) lay.getBackground();
                int colorId = viewColor.getColor();
                int newcol = 0;

                switch(colorId){

                    case Color.WHITE:
                        newcol = Color.RED;
                        break;
                    case Color.RED:
                        newcol = Color.GREEN;
                        break;
                    case Color.GREEN:
                        newcol = Color.CYAN;
                        break;
                    case Color.CYAN:
                        newcol = Color.WHITE;
                        break;
                }
//                if(colorId == Color.WHITE){
//                    newcol = Color.RED;
//                }
//                else if(colorId == Color.RED){
//                    newcol = Color.GREEN;
//                }
//                else{
//                    newcol = Color.BLUE;
//                }
                lay.setBackgroundColor(newcol);
            }

        });
    }
}
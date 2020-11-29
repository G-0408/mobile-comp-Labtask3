package com.example.bgcolorchanger;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText editText1;
     EditText editText2;
     EditText editText3;
    RelativeLayout REL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);
        editText3 = (EditText) findViewById(R.id.edit3);
        REL = findViewById(R.id.rel_Layout);
    }

        public void Ch_color(View view){
            if (editText1 != null && editText2 != null && editText3 != null) {
                int rgb6 = Integer.parseInt(editText1.getText().toString());
                int rgb7 = Integer.parseInt(editText2.getText().toString());
                int rgb8 = Integer.parseInt(editText3.getText().toString());
                rgb6 = Math.max(rgb6, 0);
                rgb7 = Math.max(rgb7, 0);
                rgb8 = Math.max(rgb8, 0);

                rgb6 = Math.min(rgb6, 255);
                rgb7 = Math.min(rgb7, 255);
                rgb8 = Math.min(rgb8, 255);

                REL.setBackgroundColor(Color.rgb(rgb6, rgb7, rgb8));
            }
        }
    }
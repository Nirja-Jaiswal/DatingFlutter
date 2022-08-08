package com.example.datingflutter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView findmatcges;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        findmatcges = (TextView) findViewById(R.id.findmatcges);
        findmatcges.setText("Find Your best Match".toUpperCase());

        TextPaint paint = findmatcges.getPaint();
        float width = paint.measureText("Tianjin, China");

        Shader textShader = new LinearGradient(0, 0, width, findmatcges.getTextSize(),
                new int[]{
                        Color.parseColor("#dd2f62"),
                        Color.parseColor("#646FFB"),

                }, null, Shader.TileMode.CLAMP);
        findmatcges.getPaint().setShader(textShader);

     text=findViewById(R.id.text);
     text.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent= new Intent(MainActivity3.this,Login.class);
             startActivity(intent);
         }
     });
    }




}
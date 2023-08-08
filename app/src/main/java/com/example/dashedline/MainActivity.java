package com.example.dashedline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our view.
        relativeLayout = findViewById(R.id.RLView);

        // its view to our relative layout.
        PaintView paintView = new PaintView(this);
        relativeLayout.addView(paintView);

    }
    }

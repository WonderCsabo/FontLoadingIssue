package com.example.fontloading;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface regular = TypeFaceUtil.getRegular(this);

        TextView text = findViewById(R.id.text);

        text.setTypeface(regular);
    }
}

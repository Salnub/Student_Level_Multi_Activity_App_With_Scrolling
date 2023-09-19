package com.salatech.scrolling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img1 = findViewById(R.id.img_1);
        ImageView img2 = findViewById(R.id.img_2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(),DescriptionActivity.class);
                ca.putExtra("HtmlPage","file:///android_asset/windows.html");
                startActivity(ca);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(),DescriptionActivity.class);
                ca.putExtra("HtmlPage","file:///android_asset/github.html");
                startActivity(ca);
            }
        });
    }
}
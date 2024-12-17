package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashActivity extends AppCompatActivity {

    Button btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dash);
        btn2=(Button) findViewById(R.id.meb1);
        btn3=(Button) findViewById(R.id.meb2);
        btn4=(Button) findViewById(R.id.meb3);
        btn5=(Button) findViewById(R.id.meb4);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj1=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(obj1);
            }
        });
    }
}
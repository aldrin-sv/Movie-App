package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovieActivity extends AppCompatActivity {

    EditText et3,et4,et5,et6,et7,et8;
    Button btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);

        et3=(EditText) findViewById(R.id.an1);
        et4=(EditText) findViewById(R.id.an2);
        et5=(EditText) findViewById(R.id.an3);
        et6=(EditText) findViewById(R.id.an4);
        et7=(EditText) findViewById(R.id.an5);
        et8=(EditText) findViewById(R.id.an6);

        btn6=(Button) findViewById(R.id.ab1);
        btn7=(Button) findViewById(R.id.ab2);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o1=new Intent(getApplicationContext(), DashActivity.class);
                startActivity(o1);
            }
        });



    }
}
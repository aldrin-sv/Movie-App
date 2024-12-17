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

public class ViewMovieActivity extends AppCompatActivity {

    Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_movie);
       btn6=(Button) findViewById(R.id.insta1);

       btn6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent obje1=new Intent(getApplicationContext(), DashActivity.class);
               startActivity(obje1);
           }
       });
    }
}
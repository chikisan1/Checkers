package com.example.chikaomaeda.checkers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startbutton);
        startButton.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent game = new Intent(MainActivity.this, GameActivity.class);
                startActivity(game);
            }
        });
    }
}

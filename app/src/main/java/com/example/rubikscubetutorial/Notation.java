package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notation);
        Button back = findViewById(R.id.noteback);
        Button next = findViewById(R.id.notestart);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }
    private void openStage() {
        Intent intent = new Intent(this, Stage.class);
        startActivity(intent);
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.noteback:
                openMainActivity();
                break;
            case R.id.notestart:
                openStage();
                break;
        }
    }
}




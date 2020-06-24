package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.start);
        Button notation = findViewById(R.id.notation);

        start.setOnClickListener(this);
        notation.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                openBackground();
                break;
            case R.id.notation:
                openNotation();
                break;
        }
    }

    private void openBackground() {
        Intent intent = new Intent(this, Background.class);
        startActivity(intent);
    }

    private void openNotation() {
        Intent intent = new Intent(this, Notation.class);
        startActivity(intent);
    }
}
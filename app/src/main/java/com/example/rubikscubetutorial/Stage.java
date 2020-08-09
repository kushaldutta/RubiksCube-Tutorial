package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
        Button back = findViewById(R.id.stageback);
        Button next = findViewById(R.id.stagenext);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openBackground() {
        Intent intent = new Intent(this, Background.class);
        startActivity(intent);
    }

    private void openStage2() {
        Intent intent = new Intent(this, stage2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stageback:
                openBackground();
                break;
            case R.id.stagenext:
                openStage2();
                break;
        }
    }
}

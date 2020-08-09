package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class stage2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2);
        Button back = findViewById(R.id.stage2_back);
        Button next = findViewById(R.id.stage2_next);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openStage() {
        Intent intent = new Intent(this, Stage.class);
        startActivity(intent);
    }

    private void openStage3() {
        Intent intent = new Intent(this, stage3.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stage2_back:
                openStage();
                break;
            case R.id.stage2_next:
                openStage3();
                break;
        }
    }

}
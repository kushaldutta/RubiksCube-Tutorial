package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stage3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3);
        Button back = findViewById(R.id.stage3_back);
        Button next = findViewById(R.id.stage3_next);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openStage2() {
        Intent intent = new Intent(this, stage2.class);
        startActivity(intent);
    }

    private void openStage4() {
        Intent intent = new Intent(this, stage4.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.stage3_back):
                openStage2();
                break;
            case (R.id.stage3_next):
                openStage4();
        }
    }
}

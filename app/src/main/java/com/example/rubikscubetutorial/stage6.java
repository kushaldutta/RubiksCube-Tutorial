package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class stage6 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage6);
        Button back = findViewById(R.id.stage6_back);
        Button next = findViewById(R.id.stage6_next);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openStage5() {
        Intent intent = new Intent(this, stage5.class);
        startActivity(intent);
    }

    private void openStage7() {
        Intent intent = new Intent(this, stage7.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stage6_back:
                openStage5();
                break;
            case R.id.stage6_next:
                openStage7();
        }
    }
}

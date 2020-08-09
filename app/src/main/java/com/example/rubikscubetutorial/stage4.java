package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stage4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage4);
        Button back = findViewById(R.id.stage4_back);
        Button next = findViewById(R.id.stage4_next);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openStage3() {
        Intent intent = new Intent(this, stage3.class);
        startActivity(intent);
    }

    private void openStage5() {
        Intent intent = new Intent(this, stage5.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stage4_back:
                openStage3();
                break;
            case R.id.stage4_next:
                openStage5();
        }
    }

}
package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class stage7 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage7);
        Button back = findViewById(R.id.stage7_back);

        back.setOnClickListener(this);
    }

    private void openStage6() {
        Intent intent = new Intent(this, stage6.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stage7_back:
                openStage6();
        }
    }
}

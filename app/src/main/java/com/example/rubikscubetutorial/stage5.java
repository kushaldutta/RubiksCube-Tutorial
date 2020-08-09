package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class stage5 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage5);
        Button back = findViewById(R.id.stage5_back);
        Button next = findViewById(R.id.stage5_next);

        back.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    private void openStage4() {
        Intent intent = new Intent(this, stage4.class);
        startActivity(intent);
    }

    private void openStage6() {
        Intent intent = new Intent(this, stage4.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stage5_back:
                openStage4();
                break;
            case R.id.stage5_next:
                openStage6();
        }
    }
}

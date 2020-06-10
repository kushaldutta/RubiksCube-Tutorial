package com.example.rubikscubetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Background extends AppCompatActivity implements View.OnClickListener {

    private Button next1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);

        back1 = (Button) (findViewById(R.id.back1));
        next1 = (Button) (findViewById(R.id.next1));
        back1.setOnClickListener(this);
        next1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back1:
                openMainActivity();
                break;
            case R.id.next1:
                openMainActivity();
                break;
        }
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


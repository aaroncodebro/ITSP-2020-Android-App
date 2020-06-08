package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button solveButton;
    private EditText lowerLimit,upperLimit;
    private ImageView camera;
    private TextView lowerLimitWarn,upperLimitWarn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solveButton = findViewById(R.id.solveButton);
        lowerLimit = findViewById(R.id.lowerLimit);
        upperLimit = findViewById(R.id.upperLimit);
        camera = findViewById(R.id.camera);
        lowerLimitWarn = findViewById(R.id.lowerLimitWarn);
        upperLimitWarn = findViewById(R.id.upperLimitWarn);
        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lowerLimit.getText().toString().equals(""))
                {
                    lowerLimitWarn.setText("Enter lower Limit");
                }
                else
                {
                    lowerLimitWarn.setText("");
                }
                if(upperLimit.getText().toString().equals(""))
                {
                    upperLimitWarn.setText("Enter upper Limit");
                }
                else
                {
                    upperLimitWarn.setText("");
                }
                if(lowerLimit.getText().toString().equals("")||upperLimit.getText().toString().equals("")) return;
                Intent intent = new Intent(MainActivity.this, Activitymain3Activity.class);
                startActivity(intent);
            }
        });

    }
}
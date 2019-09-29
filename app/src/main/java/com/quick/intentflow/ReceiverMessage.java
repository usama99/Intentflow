package com.quick.intentflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverMessage extends AppCompatActivity {
    TextView received;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_message);
        received = findViewById(R.id.received);
        Intent getValue = getIntent();
        String get = getValue.getStringExtra("message");
        received.setText(get);
    }
}

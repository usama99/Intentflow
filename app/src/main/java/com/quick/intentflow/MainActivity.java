package com.quick.intentflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText enterMessage;
    Button sendMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMessage = findViewById(R.id.msg);
        sendMessage = findViewById(R.id.sendmessage);
        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* if you want to use implicit intent for other activities like gmail, message, social accounts etc then use
                bellow commented code. don't use second activity then*/
//                Intent sendIntent = new Intent(Intent.ACTION_SEND);
//                sendIntent.setType("text/plain");
//                sendIntent.putExtra(Intent.EXTRA_TEXT, gotMessage);
//                startActivity(sendIntent);
                Intent sendIntent = new Intent(MainActivity.this, ReceiverMessage.class);
                String gotMessage = enterMessage.getText().toString().trim();
                sendIntent.putExtra("message", gotMessage);
                startActivity(sendIntent);
            }
        });
    }
}

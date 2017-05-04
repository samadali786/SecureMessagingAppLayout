package com.example.samad.securemessagingapplayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MessageScreen extends AppCompatActivity {
    Button btnNewMessage;
    Button btnDeleteMessage;
    Button btnUnlockMessage1;
    Button btnUnlockMessage2;
    Button btnUnlockMessage3;
    Button btnUnlockMessage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);

        btnNewMessage = (Button)findViewById(R.id.btnNewMessage);
        btnNewMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MessageScreen.this,NewMessageScreen.class);
                startActivity(i);
            }
        });

        btnDeleteMessage = (Button)findViewById(R.id.btnDeleteMessage);
        btnDeleteMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MessageScreen.this, "message delete Sucessefully", Toast.LENGTH_SHORT).show();
                Intent i  = new Intent(MessageScreen.this,MessageScreen.class);
                startActivity(i);
            }
        });

        btnUnlockMessage1 = (Button)findViewById(R.id.btnUnlockMessage1);
        btnUnlockMessage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(MessageScreen.this,PasscodeScreen.class);
                startActivity(i);
            }
        });

        btnUnlockMessage2 = (Button)findViewById(R.id.btnUnlockMessage2);
        btnUnlockMessage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(MessageScreen.this,PasscodeScreen.class );
                startActivity(i);
            }
        });

        btnUnlockMessage3 = (Button)findViewById(R.id.btnUnlockMessage3);
        btnUnlockMessage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(MessageScreen.this,PasscodeScreen.class);
                startActivity(i);
            }
        });

        btnUnlockMessage4 = (Button)findViewById(R.id.btnUnlockMessage4);
        btnUnlockMessage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i  = new Intent(MessageScreen.this,PasscodeScreen.class);
                startActivity(i);
            }
        });



    }
}

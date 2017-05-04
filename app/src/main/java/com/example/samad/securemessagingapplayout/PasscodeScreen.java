package com.example.samad.securemessagingapplayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PasscodeScreen extends AppCompatActivity {

    Button btnpsend;
    Button btnunlock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode_screen);

        btnpsend = (Button) findViewById(R.id.btnpsend);
        btnpsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PasscodeScreen.this, "Message sent with passcode", Toast.LENGTH_SHORT).show();
                Intent k  = new Intent(PasscodeScreen.this,NewMessageScreen.class);
                startActivity(k);
            }
        });

        btnunlock = (Button) findViewById(R.id.btnunlock);
        btnunlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PasscodeScreen.this, "Message unlock sucessfully", Toast.LENGTH_SHORT).show();
                Intent k  = new Intent(PasscodeScreen.this,MessageFromContacts.class);
                startActivity(k);
            }
        });
    }
}

package com.example.samad.securemessagingapplayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewMessageScreen extends AppCompatActivity {
    Button btnSendTo;
    Button btnCancel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_message_screen);
        btnSendTo = (Button) findViewById(R.id.btnSendTo);
        btnSendTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k  = new Intent(NewMessageScreen.this,SendToContacts.class);
                startActivity(k);
            }
        });
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p  = new Intent(NewMessageScreen.this,MessageScreen.class);
                startActivity(p);
            }
        });

    }
}

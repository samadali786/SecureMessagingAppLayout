package com.example.samad.securemessagingapplayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SendToContacts extends AppCompatActivity {
    Button btnCancel;
    Button btnSend;
    Button btnwithpasscode;
    Button btnunsecured;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_to_contacts);

        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c  = new Intent(SendToContacts.this,NewMessageScreen.class);
                startActivity(c);
            }
        });




        btnwithpasscode = (Button) findViewById(R.id.btnwithpasscode);
        btnwithpasscode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c  = new Intent(SendToContacts.this,PasscodeScreen.class);
                startActivity(c);
            }
        });



        btnunsecured = (Button) findViewById(R.id.btnunsecured);
        btnunsecured.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SendToContacts.this, "Message send unsecured", Toast.LENGTH_SHORT).show();
                Intent c  = new Intent(SendToContacts.this,SendToContacts.class);
                startActivity(c);
            }
        });

    }
    }


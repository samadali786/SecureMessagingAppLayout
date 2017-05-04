package com.example.samad.securemessagingapplayout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecureMessagingApp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secure_messaging_app_);



        Button mShowDailog = (Button) findViewById(R.id.btnSecureMessagingApp);

        mShowDailog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SecureMessagingApp.this);
                View mView = getLayoutInflater().inflate(R.layout.dailog_login, null);

                final EditText mUserName = (EditText) mView.findViewById(R.id.etUserName);
                final EditText mPassword = (EditText) mView.findViewById(R.id.etPassword);
                final Button mLogin = (Button) mView.findViewById(R.id.btnlogin);


                Button btnNewUser = (Button) mView.findViewById(R.id.btnNewUser);
                btnNewUser.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i  = new Intent(SecureMessagingApp.this,NewUserScreen.class);
                        startActivity(i);
                    }
                });


                Button btnFPassword = (Button) mView.findViewById(R.id.btnFpassword);
                btnFPassword.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent m  = new Intent(SecureMessagingApp.this,ForgetPassword.class);
                        startActivity(m);
                    }
                });

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {



                        if (!mUserName.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty())
                        {
                            Toast.makeText(SecureMessagingApp.this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(SecureMessagingApp.this,MessageScreen.class);
                            startActivity(i);

                        }

                        else
                            {
                            Toast.makeText(SecureMessagingApp.this, "please fill any empty field", Toast.LENGTH_SHORT).show();
                            }

                    }



                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();


            }
        });
    }


}












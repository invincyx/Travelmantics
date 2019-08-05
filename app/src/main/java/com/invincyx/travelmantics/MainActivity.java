package com.invincyx.travelmantics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private SignInButton mGoogleBtn;
    Button mEmailSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        mGoogleBtn  =  (SignInButton) findViewById(R.id.google_loginbtn);
        mEmailSignIn = (Button) findViewById(R.id.email_signin);


//        Email Sign In
        mEmailSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailSign = new Intent(MainActivity.this,SignUp.class);
                startActivity(emailSign);
            }
        });

    }
}

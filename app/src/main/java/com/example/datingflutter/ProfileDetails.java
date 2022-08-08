package com.example.datingflutter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileDetails extends AppCompatActivity {

    TextView txt_resend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        txt_resend=findViewById(R.id.txt_resend);
        txt_resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileDetails.this,LocationActivity.class);
                startActivity(intent);
            }
        });
    }
}
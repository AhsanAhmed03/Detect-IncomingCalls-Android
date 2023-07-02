package com.example.detectincomingcall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String phoneNum;
    TextView phonenumber_View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNum = getIntent().getStringExtra("number");

        phonenumber_View = findViewById(R.id.phone_numberView);
    }

    public void showPhoneNumber(View view) {

        if (phoneNum != null){
            phonenumber_View.setText(phoneNum);
        }else {
            Toast.makeText(this, "Phone Number not Recived",
                    Toast.LENGTH_LONG).show();
        }

    }
}
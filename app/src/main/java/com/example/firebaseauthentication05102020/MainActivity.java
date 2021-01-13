package com.example.firebaseauthentication05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdtTk,mEdtMk,mEdtPhone;
    Button mBtnDangky,mBtnDangnhap,mBtnXacThuc,mBtnCapnhat,mBtnDangkyPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtMk = findViewById(R.id.edittextPassword);
        mEdtTk = findViewById(R.id.edittextEmail);
        mEdtPhone = findViewById(R.id.edittextPhone);
        mBtnDangky = findViewById(R.id.buttonDangky);
        mBtnDangnhap = findViewById(R.id.buttonDangnhap);
        mBtnXacThuc = findViewById(R.id.buttonVerification);
        mBtnCapnhat = findViewById(R.id.button_updatepassword);
        mBtnDangkyPhone = findViewById(R.id.buttonRegisterPhone);

    }
}
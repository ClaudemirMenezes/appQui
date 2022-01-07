package com.devmobile.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;

public class PainelActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    int timerValue= 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel);
    }
}
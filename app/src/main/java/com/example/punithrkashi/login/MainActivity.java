package com.example.punithrkashi.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.punithrkashi.login.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, loginscreen.class);
        startActivity(intent);
    }

    public void signup(View view) {
            Intent signupintent1 = new Intent(this, signupscreen.class);
            startActivity(signupintent1);
    }


}

package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private CheckBox remember;
    private Button login;
    private Button forget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Subject Grade Check");
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        remember = (CheckBox)findViewById(R.id.remember);
        login = (Button)findViewById(R.id.lgoin);
        forget = (Button)findViewById(R.id.forgetPassword);

        SharedPreferences preferences = getSharedPreferences("Information", Context.MODE_PRIVATE);
        if (preferences.contains("username") && preferences.contains("password"))
        {
            username.setText(preferences.getString("username","NULL"));
            password.setText(preferences.getString("password","NULL"));
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().compareTo("user")==0 && password.getText().toString().compareTo("123456")==0)
                {
                    if(remember.isChecked())
                    {
                        SharedPreferences preferences = getSharedPreferences("Information", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putString("username", "user");
                        editor.putString("password","123456");
                        editor.commit();
                    }
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, ChooseSemester.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"password is error",Toast.LENGTH_LONG).show();
                }
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ForgetPassword.class);
                startActivity(intent);
            }
        });
    }
}

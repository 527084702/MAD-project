package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ChooseSubject extends AppCompatActivity {
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private RadioButton r4;
    private Button confirm;
    private Button back;
    private String sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_subject);
        setTitle("Choose your subject");
        r1 = (RadioButton)findViewById(R.id.Subject1);
        r2 = (RadioButton)findViewById(R.id.Subject2);
        r3 = (RadioButton)findViewById(R.id.Subject3);
        r4 = (RadioButton)findViewById(R.id.Subject4);
        confirm = (Button)findViewById(R.id.ConfirmSubject);
        back = (Button)findViewById(R.id.ReturnSubject);
        r1.setChecked(true);
        Intent intent = getIntent();
        sem = "1";
        sem = intent.getStringExtra("semester");
        if(sem.compareTo("1") == 0)
        {
            r1.setText("CSE2MAD - MOBILE APPLICATION DEVELOPMENT");
            r2.setText("CSE2ICE - INTERNET CLIENT ENGINEERING");
            r3.setText("CSE2ISD - INFO SYSTEMS DEVELOPMENT");
            r4.setText("CSE2DBF - DATABASE FUNDAMENTALS");
        }
        else if(sem.compareTo("2") == 0)
        {
            r1.setText("MAT1DM - Discrete Mathematics");
            r2.setText("CSE1OOF - Object Oriented Programming Fundamentals");
            r3.setText("CSE1IS - Information Systems");
            r4.setText("CSE1IIT - Inside Information Technology");
        }
        else if(sem.compareTo("3") == 0)
        {
            r1.setText("CSE3PRA - Industry Project 3A");
            r2.setText("CSE3PRB - Industry Project 3B");
            r3.setText("CSE3PE - Professional Environment");
            r4.setText("STA1DCT - Data-based Critical Thinking");
        }

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "1";
                if(r1.isChecked())
                {
                    if(sem.compareTo("1") == 0)
                        s = "11";
                    else if(sem.compareTo("2") == 0)
                        s = "21";
                    else if(sem.compareTo("3") == 0)
                        s = "31";
                }
                else if(r2.isChecked())
                {
                    if(sem.compareTo("1") == 0)
                        s = "12";
                    else if(sem.compareTo("2") == 0)
                        s = "22";
                    else if(sem.compareTo("3") == 0)
                        s = "32";
                }
                else if(r3.isChecked())
                {
                    if(sem.compareTo("1") == 0)
                        s = "13";
                    else if(sem.compareTo("2") == 0)
                        s = "23";
                    else if(sem.compareTo("3") == 0)
                        s = "33";
                }
                else if(r4.isChecked())
                {
                    if(sem.compareTo("1") == 0)
                        s = "14";
                    else if(sem.compareTo("2") == 0)
                        s = "24";
                    else if(sem.compareTo("3") == 0)
                        s = "34";
                }
                Intent intent = new Intent();
                intent.putExtra("semester",sem);
                intent.putExtra("subject",s);
                intent.setClass(ChooseSubject.this,GradeDetail.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ChooseSubject.this,ChooseSemester.class);
                startActivity(intent);
            }
        });
    }
}

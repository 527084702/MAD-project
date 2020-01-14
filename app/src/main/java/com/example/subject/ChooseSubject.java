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
        sem = intent.getStringExtra("semester");

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(r1.isChecked())
                    s = "1";
                else if(r2.isChecked())
                    s = "2";
                else if(r3.isChecked())
                    s = "3";
                else if(r4.isChecked())
                    s = "4";
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

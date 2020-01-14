package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GradeDetail extends AppCompatActivity {
    private TextView assign;
    private TextView labexam;
    private TextView finalexam;
    private TextView total;
    private Button detail;
    private Button back;
    private String sem;
    private String sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_detail);
        setTitle("Grade Details");
        assign = (TextView)findViewById(R.id.assignment);
        labexam = (TextView)findViewById(R.id.labexam);
        finalexam = (TextView)findViewById(R.id.finalexam);
        total = (TextView)findViewById(R.id.total);
        detail = (Button)findViewById(R.id.DetialGrade);
        back = (Button)findViewById(R.id.ReturnGrade);
        Intent intent = getIntent();
        sem = intent.getStringExtra("semester");
        sub = intent.getStringExtra("subject");
        if(sem.compareTo("1") == 0)
        {
            if(sub.compareTo("1") == 0)
            {
                assign.setText("Assignment         23/30");
                labexam.setText("Lab Exam             13/20");
                finalexam.setText("Final Exam           30/50");
                total.setText("Total                     66/100  C");
            }
            else if(sub.compareTo("2") == 0)
            {
                assign.setText("Assignment         25/30");
                labexam.setText("Lab Exam             17/20");
                finalexam.setText("Final Exam           40/50");
                total.setText("Total                     82/100  A");
            }
            else if(sub.compareTo("3") == 0)
            {
                assign.setText("Assignment         23/30");
                labexam.setText("Lab Exam             13/20");
                finalexam.setText("Final Exam           34/50");
                total.setText("Total                     70/100  B");
            }
            else if(sub.compareTo("4") == 0)
            {
                assign.setText("Assignment         29/30");
                labexam.setText("Lab Exam             19/20");
                finalexam.setText("Final Exam           49/50");
                total.setText("Total                     100/100  A");
            }
        }
        else if(sem.compareTo("2") == 0)
        {
            if(sub.compareTo("1") == 0)
            {
                assign.setText("Assignment         20/30");
                labexam.setText("Lab Exam             13/20");
                finalexam.setText("Final Exam           30/50");
                total.setText("Total                     63/100  C");
            }
            else if(sub.compareTo("2") == 0)
            {
                assign.setText("Assignment         30/30");
                labexam.setText("Lab Exam             17/20");
                finalexam.setText("Final Exam           40/50");
                total.setText("Total                     87/100  A");
            }
            else if(sub.compareTo("3") == 0)
            {
                assign.setText("Assignment         23/30");
                labexam.setText("Lab Exam             13/20");
                finalexam.setText("Final Exam           40/50");
                total.setText("Total                     76/100  B");
            }
            else if(sub.compareTo("4") == 0)
            {
                assign.setText("Assignment         29/30");
                labexam.setText("Lab Exam             19/20");
                finalexam.setText("Final Exam           49/50");
                total.setText("Total                     100/100  A");
            }
        }
        else if(sem.compareTo("3") == 0)
        {
            if(sub.compareTo("1") == 0)
            {
                assign.setText("Assignment         23/30");
                labexam.setText("Lab Exam             20/20");
                finalexam.setText("Final Exam           30/50");
                total.setText("Total                     73/100  B");
            }
            else if(sub.compareTo("2") == 0)
            {
                assign.setText("Assignment         25/30");
                labexam.setText("Lab Exam             20/20");
                finalexam.setText("Final Exam           40/50");
                total.setText("Total                     85/100  A");
            }
            else if(sub.compareTo("3") == 0)
            {
                assign.setText("Assignment         30/30");
                labexam.setText("Lab Exam             20/20");
                finalexam.setText("Final Exam           50/50");
                total.setText("Total                     100/100  A");
            }
            else if(sub.compareTo("4") == 0)
            {
                assign.setText("Assignment         29/30");
                labexam.setText("Lab Exam             19/20");
                finalexam.setText("Final Exam           49/50");
                total.setText("Total                     100/100  A");
            }
        }
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(GradeDetail.this,LetterMean.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(GradeDetail.this,ChooseSubject.class);
                startActivity(intent);
            }
        });
    }
}

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
        sem = "1";
        sub = "11";
        sem = intent.getStringExtra("semester");
        sub = intent.getStringExtra("subject");
        if(sub.compareTo("11") == 0)
        {
            assign.setText("Assignment         23/30");
            labexam.setText("Lab Exam             13/20");
            finalexam.setText("Final Exam           30/50");
            total.setText("Total                     66/100  C");
        }
        else if(sub.compareTo("12") == 0)
        {
            assign.setText("Assignment         25/30");
            labexam.setText("Lab Exam             17/20");
            finalexam.setText("Final Exam           40/50");
            total.setText("Total                     82/100  A");
        }
        else if(sub.compareTo("13") == 0)
        {
            assign.setText("Assignment         23/30");
            labexam.setText("Lab Exam             13/20");
            finalexam.setText("Final Exam           34/50");
            total.setText("Total                     70/100  B");
        }
        else if(sub.compareTo("14") == 0)
        {
            assign.setText("Assignment         29/30");
            labexam.setText("Lab Exam             19/20");
            finalexam.setText("Final Exam           49/50");
            total.setText("Total                     97/100  A");
        }
        else if(sub.compareTo("21") == 0)
        {
            assign.setText("Assignment         26/30");
            labexam.setText("Lab Exam             17/20");
            finalexam.setText("Final Exam           40/50");
            total.setText("Total                     83/100  A");
        }
        else if(sub.compareTo("22") == 0)
        {
            assign.setText("Assignment         21/30");
            labexam.setText("Lab Exam             13/20");
            finalexam.setText("Final Exam           30/50");
            total.setText("Total                     64/100  C");
        }
        else if(sub.compareTo("23") == 0)
        {
            assign.setText("Assignment         23/30");
            labexam.setText("Lab Exam             10/20");
            finalexam.setText("Final Exam           30/50");
            total.setText("Total                     63/100  C");
        }
        else if(sub.compareTo("24") == 0)
        {
            assign.setText("Assignment         23/30");
            labexam.setText("Lab Exam             13/20");
            finalexam.setText("Final Exam           28/50");
            total.setText("Total                     64/100  C");
        }
        else if(sub.compareTo("31") == 0)
        {
            assign.setText("Assignment         28/30");
            labexam.setText("Lab Exam             20/20");
            finalexam.setText("Final Exam           50/50");
            total.setText("Total                     98/100  A");
        }
        else if(sub.compareTo("32") == 0)
        {
            assign.setText("Assignment         29/30");
            labexam.setText("Lab Exam             20/20");
            finalexam.setText("Final Exam           50/50");
            total.setText("Total                     99/100  A");
        }
        else if(sub.compareTo("33") == 0)
        {
            assign.setText("Assignment         25/30");
            labexam.setText("Lab Exam             20/20");
            finalexam.setText("Final Exam           49/50");
            total.setText("Total                     94/100  A");
        }
        else if(sub.compareTo("34") == 0)
        {
            assign.setText("Assignment         29/30");
            labexam.setText("Lab Exam             16/20");
            finalexam.setText("Final Exam           35/50");
            total.setText("Total                     90/100  A");
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

package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ChooseSemester extends AppCompatActivity {
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private Button confirm;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_semester);
        setTitle("Choose your semester");
        r1 = (RadioButton)findViewById(R.id.Semester1);
        r2 = (RadioButton)findViewById(R.id.Semester2);
        r3 = (RadioButton)findViewById(R.id.Semester3);
        confirm = (Button)findViewById(R.id.ConfirmSemester);
        back = (Button)findViewById(R.id.ReturnSemester);
        r1.setChecked(true);

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
                Intent intent = new Intent();
                intent.putExtra("semester",s);
                intent.setClass(ChooseSemester.this,ChooseSubject.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ChooseSemester.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

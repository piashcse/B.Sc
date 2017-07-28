package com.example.mehedihassanpiash.diuresult2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Show extends AppCompatActivity {

    TextView textViewName;
    TextView textViewRoll;
    TextView textViewSemseter;
    TextView textViewShift;
    TextView textViewBatch;
    TextView textViewGpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        textViewName = (TextView)findViewById(R.id.textViewName);
        textViewRoll =(TextView)findViewById(R.id.textViewRoll);
        textViewSemseter = (TextView)findViewById(R.id.textViewSemseter);
        textViewShift = (TextView)findViewById(R.id.textViewShift);
        textViewBatch = (TextView)findViewById(R.id.textViewBatch);
        textViewGpa = (TextView)findViewById(R.id.textViewGpa);


        Intent i = getIntent();

        String name = i.getStringExtra("name");
        textViewName.setText("Name : "+name);
       String roll = i.getStringExtra("roll");
        textViewRoll.setText("Roll : "+roll);
       String semester = i.getStringExtra("semester");
        textViewSemseter.setText("Semester : " +semester);

       String shift = i.getStringExtra("shift");
       textViewShift.setText("Shift :"+shift);

       String batch = i.getStringExtra("batch");
        textViewBatch.setText("Batch : "+batch);

        String  gpa = i.getStringExtra("gpa");
        textViewGpa.setText("GPA : "+gpa);


    }
}

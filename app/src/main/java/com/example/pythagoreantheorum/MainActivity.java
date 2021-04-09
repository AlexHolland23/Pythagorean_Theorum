package com.example.pythagoreantheorum;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText aValue;
    private EditText bValue;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.aValue = this.findViewById(R.id.anum);
        this.bValue = this.findViewById(R.id.bnum);
        this.answer = this.findViewById(R.id.answer);



    }
    public void onCalcButtonClicked(View v)
    {
        this.answer.setText("");
        Integer b = Integer.valueOf(aValue.getText().toString());
        Integer a = Integer.valueOf(bValue.getText().toString());




        int cValue = (a * a) + (b * b);
        double answer = Math.sqrt(cValue);
    }
}
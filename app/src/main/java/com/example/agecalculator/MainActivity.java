package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    Button btn;
    EditText et,et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.etYear);
        tv = findViewById(R.id.tvDisplay);
        btn = findViewById(R.id.btnCalculate);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Integer Birthyear =Integer.parseInt(et.getText().toString());//editable
                 Integer CurrentYear = Calendar.getInstance().get(Calendar.YEAR);


                 int age = CurrentYear - Birthyear;

                 tv.setText("Your age is : " +age+ " years old");
            }
        });
    }






}

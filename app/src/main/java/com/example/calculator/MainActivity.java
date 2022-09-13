package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1 ,editText2,editText3;
    TextView textView ,textViewBMI;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 =findViewById(R.id.Et1);
        editText2= findViewById(R.id.Et2);
        editText3 =findViewById(R.id.Et3);
        textView =findViewById(R.id.tv1);
        textViewBMI =findViewById(R.id.tvBMI);
        btn =findViewById(R.id.btnBMI);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int wt =Integer.parseInt( editText1.getText().toString());
                int HeightInfeet =Integer.parseInt( editText2.getText().toString());
                int HeightInInches =Integer.parseInt( editText3.getText().toString());
                int totalInches= HeightInfeet*12+ HeightInInches;
                double totalCms=totalInches*2.54;
                double TotalMass =totalCms/100;
                double TotalBMI= wt/(TotalMass*TotalMass);
                if(TotalBMI>25){
                    textView.setText("You are Over weight");
                }else if(TotalBMI<18){
                    textView.setText("You are Underweight");
                }else{
                    textView.setText("You are Healthy");
                }



            }
        });

    }
}
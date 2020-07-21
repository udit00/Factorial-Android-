package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {
    Editable getInput;
    TextView resultPalindrome;
    EditText checkPalindrome;
    Button submitButton;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
        checkPalindrome=findViewById(R.id.editTextPalindrome);
        resultPalindrome=findViewById(R.id.resultViewPalindrome);
        submitButton=findViewById(R.id.buttonPalindrome);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput= "" + checkPalindrome.getText();
                Editable reversed;
                for(int i=getInput.length()-1; i>=0; i--) reversed += getInput.charAt(i);
                if(getInput==reversed){
                    resultPalindrome.setText(new StringBuilder().append("YES").append(reversed).toString());
                }
                else{
                    resultPalindrome.setText("NO");
                }
            }
        });
    }
}
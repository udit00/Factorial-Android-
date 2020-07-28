package com.example.factorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String getValue;
    long value;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.resultViewFactorial);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.addmenu,menu);
        return true;
    }

    public void startFactorial(View view){
        getValue=editText.getText().toString();
        value = Integer.parseInt(getValue);
        if(value<0){
            textView.setText("Negative Input");
        }
        else if(value>2) {
            value = getFactorial(value);
            textView.setText(String.valueOf(value));
        }
        else{
            textView.setText("Please enter >2");
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.item1:
                intent=new Intent(this , MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(this , Palindrome.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(this, PrimeNumber.class);
                startActivity(intent);
                return true;
            default:
                textView.setText("WHyyyyYYYY");
        }
        return super.onOptionsItemSelected(item);
    }

    public long getFactorial(long findN){
        if(findN<2) return findN;
        else return (findN*getFactorial(findN-1));
    }
}
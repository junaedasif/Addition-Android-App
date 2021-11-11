package com.junaedasif.demon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.textView2);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        edtNum1 = findViewById(R.id.num1);
        edtNum2 = findViewById(R.id.num2);
        txtResult = findViewById(R.id.result);
    }
    public void showToastMessage(View view){
        String firstNumber = edtNum1.getText().toString();
        String secondNumber = edtNum2.getText().toString();
        if(firstNumber.isEmpty() || secondNumber.isEmpty()){
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
            return;
        }
        int resultNumber = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        txtResult.setText("Answer is " + String.valueOf(resultNumber));
        //Toast.makeText(MainActivity.this, "Button Clicked!",Toast.LENGTH_SHORT).show();
    }
}
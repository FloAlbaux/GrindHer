package com.example.grindher;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void btnRegisterClick (View view) {
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextTextEmail = findViewById(R.id.editTextTextEmail);

        TextView textView = findViewById(R.id.textView);

        textView.setText("First name : " + editTextFirstName.getText().toString() + "\n " +
                "Last name : " + editTextLastName.getText().toString() + "\n " +
                "email : " + editTextTextEmail.getText().toString() + "\n ");
    }
}
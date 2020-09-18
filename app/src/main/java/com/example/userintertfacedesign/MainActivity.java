package com.example.userintertfacedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    TextView textView, textView2,textView3;
    EditText editTextTextPersonName, editTextTextEmailAddress;
    RadioButton radioButton, radioButton1;
    Button button, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView= findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher_background);

        textView = findViewById(R.id.textView);

        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        textView2 = findViewById(R.id.textView2);

        textView3 = findViewById(R.id.textView3);

        radioButton = findViewById(R.id.radioButton);

        radioButton1 = findViewById(R.id.radioButton1);

        button = findViewById(R.id.button);

        button2 = findViewById(R.id.button2);
    }
}
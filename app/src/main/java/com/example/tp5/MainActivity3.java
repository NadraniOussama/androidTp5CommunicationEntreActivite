package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private Button buttonMajuscule,buttonInverser;
    private EditText editButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editButton = (EditText)findViewById(R.id.editText2);
        String text = (String) getIntent().getStringExtra("output");
        editButton.setText(text);
        buttonInverser =(Button)findViewById(R.id.button4);
        buttonMajuscule = (Button)findViewById(R.id.button3);

        buttonMajuscule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this, MainActivity.class);
                String changedText = editButton.getText().toString().toUpperCase();
                i.putExtra("received", changedText);
                startActivity(i);
            }
        });
        buttonInverser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this, MainActivity.class);
                String changedText = editButton.getText().toString();
                StringBuilder chengedText2 = new StringBuilder(changedText);
                i.putExtra("received", chengedText2.reverse().toString());
                startActivity(i);
            }
        });

    }
}

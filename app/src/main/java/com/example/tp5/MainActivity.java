package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button buttonValidation,buttonModifier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView3);
        editText = (EditText)findViewById(R.id.editText);
        buttonValidation = (Button) findViewById(R.id.button2);
        buttonModifier = (Button)findViewById(R.id.button);
        String received = " ";
        received = (String) getIntent().getStringExtra("received");
//        if (!received.isEmpty())
//            System.out.println("hfjsdflsdf");
        textView.setText(received);
        buttonModifier.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity3.class);
                String content = editText.getText().toString();
                i.putExtra("output",content);
                startActivity(i);
            }
        });
        buttonValidation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                editText.setText(textView.getText().toString());
            }
        });


    }
}

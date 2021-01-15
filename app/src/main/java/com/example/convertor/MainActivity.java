package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView,textView2,textView4,valueinpounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueinpounds=findViewById(R.id.pounds);

        editText = findViewById(R.id.editText);

        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();

            }

        });
    }

    private void ConvertFromKiloToPound() {

        //this method convert the kilo to pound
        String valueEnter = editText.getText().toString();

        double killo = Double.parseDouble(valueEnter);

        double pound = killo * 2.205;

        textView4.setText(""+pound);
    }
}
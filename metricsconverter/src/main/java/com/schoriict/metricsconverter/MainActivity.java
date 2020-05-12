package com.schoriict.metricsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Spinner spinner1, spinner2;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.value);
        spinner1 = findViewById(R.id.unit01);
        spinner2 = findViewById(R.id.unit02);
        button = findViewById(R.id.convert);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                Integer result = Integer.parseInt(value) / 100;
                textView.setText(result.toString());
            }
        });

    }
}

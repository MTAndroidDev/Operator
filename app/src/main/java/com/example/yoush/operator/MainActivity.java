package com.example.yoush.operator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private TextView mResultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.id_operator);
        mResultTV = findViewById(R.id.id_result);
    }

    public void operator(View view) {
        Counter counter = CounterFactory.createCounter(SplitOperatorAndNum.result(mEditText.getText().toString()));
        mResultTV.setText(String.valueOf(counter.counterResult()));
    }
}

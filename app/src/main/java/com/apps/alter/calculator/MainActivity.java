package com.apps.alter.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvhasil;
    Button btnhasil;
    EditText edangka1,edangka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvhasil = (TextView) findViewById(R.id.textView);
        btnhasil = (Button) findViewById(R.id.button);

        edangka1 = (EditText) findViewById(R.id.editText);
        edangka2 = (EditText) findViewById(R.id.editText2);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  final int a=  Integer.parseInt(edangka1.getText().toString());
                  final int b=  Integer.parseInt(edangka2.getText().toString());

                  final int c = a+b;

                tvhasil.setText(Integer.toString(c));
            }
        });

    }
}

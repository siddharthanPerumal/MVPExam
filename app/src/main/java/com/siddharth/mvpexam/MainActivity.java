package com.siddharth.mvpexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener,IncrementBaseinterface.View {
    TextView output;
    Button btnIncrement;
    MainActivityPresenter mainActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.tvOutput);
        output.setText("0");
        btnIncrement = findViewById(R.id.btnIncrement);
        btnIncrement.setOnClickListener(this);
        mainActivityPresenter = new MainActivityPresenter(this,new DataHolder());
    }

    @Override
    public void onClick(android.view.View v) {
        switch (v.getId()) {
            case R.id.btnIncrement:
                mainActivityPresenter.add(Integer.valueOf(output.getText().toString()));
                break;
        }
    }

    @Override
    public void updateView(int value) {
        output.setText(String.valueOf(value));
    }

}

package com.example.ramjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        long start = System.nanoTime();

        Button btn = findViewById(R.id.startBtn);
        btn.setVisibility(v.INVISIBLE);

        int size = 10000;
        Integer[] array;

        for(int i = 1   ; i <= 20; i++) {
            array = new Integer[size];
            for(int j = 0; j < size; j++) {
                array[j] = 1;
            }
            array = null;
        }

        long difference = (System.nanoTime() - start)/1000000;
        TextView statusTxt = findViewById(R.id.statusTxt);
        statusTxt.setText("Finished in " + difference + "ms");
    }
}

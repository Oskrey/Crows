package com.example.crows;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox red = findViewById(R.id.checkBoxRed);
        red.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView tw = findViewById(R.id.textView);

                if(isChecked)
                {
                    tw.setTextColor(Color.RED);
                }
                tw.setTextColor(Color.BLACK);
            }
        });
    }

    public void countCrows(View view)
    {
        TextView tw = findViewById(R.id.textView);

        Random rand = new Random();
        CheckBox bold = findViewById(R.id.checkBoxBold);
        CheckBox italic = findViewById(R.id.checkBoxItalic);



        tw.setText(getString(R.string.message)+ rand.nextInt(30000));

    }
    public void cbRed(View view)
    {
    }
}
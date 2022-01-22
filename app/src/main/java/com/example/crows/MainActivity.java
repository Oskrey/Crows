package com.example.crows;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
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
        CheckBox bold = findViewById(R.id.checkBoxBold);
        CheckBox red = findViewById(R.id.checkBoxRed);
        CheckBox italic = findViewById(R.id.checkBoxItalic);
        italic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView tw = findViewById(R.id.textView);

                if (italic.isChecked())
                    tw.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
                else
                    if(bold.isChecked()) {
                        tw.setTypeface(Typeface.DEFAULT);
                    }
            }
        });
        red.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView tw = findViewById(R.id.textView);

                if (red.isChecked())
                    tw.setTextColor(Color.RED);
                else
                    tw.setTextColor(Color.BLACK);
            }
        });
        bold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView tw = findViewById(R.id.textView);


                if (bold.isChecked())
                    tw.setTypeface(Typeface.DEFAULT_BOLD);
                else
                    tw.setTypeface(Typeface.DEFAULT);
               }
        });
    }

    public void countCrows(View view)
    {
        TextView tw = findViewById(R.id.textView);

        Random rand = new Random();




        tw.setText(getString(R.string.message)+ rand.nextInt(30000));

    }

}
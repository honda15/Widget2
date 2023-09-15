package com.example.widget2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton1,imageButton2,imageButton3;
    private TextView txtView1,txtView2,txtView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton1 = findViewById(R.id.image1);
        imageButton2 = findViewById(R.id.image2);
        imageButton3 = findViewById(R.id.image3);

        txtView1 = findViewById(R.id.txt1);
        txtView2 = findViewById(R.id.txt2);
        txtView3 = findViewById(R.id.txt3);

        txtView1.setText("");
        txtView2.setText("");
        txtView3.setText("");

        imageButton1.setOnClickListener(new MyButton());
        imageButton2.setOnClickListener(new MyButton());
        imageButton3.setOnClickListener(new MyButton());
    }

    private class MyButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.image1:
                    txtView1.setText("The is dog1");
                    txtView1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.dog_1,0);
                    txtView2.setText("");
                    txtView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    txtView3.setText("");
                    txtView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    break;

                case R.id.image2:
                    txtView2.setText("The is dog2");
                    txtView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.dog_2,0);
                    txtView1.setText("");
                    txtView1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    txtView3.setText("");
                    txtView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    break;

                case R.id.image3:
                    txtView3.setText("The is dog3");
                    txtView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.dog_3,0);
                    txtView2.setText("");
                    txtView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    txtView1.setText("");
                    txtView1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                    break;
            }

        }
    }
}
package com.steamsystems.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    String b1;
    String b2;
    String b3;
    String b4;
    String b5;
    String b6;
    String b7;
    String b8;
    String b9;

    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void check(View v) {
        Button btnCurrent = (Button) v;
        count++;

        if(flag == 0){
            btnCurrent.setText("X");
            flag = 1;
        } else{
            btnCurrent.setText("O");
            flag = 0;
        }

        if(count > 4){
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

            // conditions horizontal
            if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                //1
            } else if(b4.equals(b5) && b5.equals(b6) && !b2.equals("")){
                //2
            } else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                //3
            }
            // vertical
            else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                //4
            } else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                //5
            } else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                //6
            }
            // cross condition
            else if(b1.equals(b5) && b5.equals(b9) && !b5.equals("")){
                //7
            } else if(b3.equals(b5) && b5.equals(b7) && !b5.equals("")){
                //8
            }
        }
    }

}
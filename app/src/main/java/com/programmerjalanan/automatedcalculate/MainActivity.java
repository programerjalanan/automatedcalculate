package com.programmerjalanan.automatedcalculate;

/**
 * Created by Programmer Jalanan on 2010/05/05
 */

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editText1;
    EditText editText2;
    TextView textViewResult;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textViewResult = (TextView) findViewById(R.id.textView_result);

        editText1.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                textViewResult.setText(addNumbers());
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                textViewResult.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }

    private String addNumbers() {
        int number1;
        int number2;
        if(editText1.getText().toString() != "" && editText1.getText().length() > 0) {
            number1 = Integer.parseInt(editText1.getText().toString());
        } else {
            number1 = 0;
        }
        if(editText2.getText().toString() != "" && editText2.getText().length() > 0) {
            number2 = Integer.parseInt(editText2.getText().toString());
        } else {
            number2 = 0;
        }
        return Integer.toString(number1 + number2);
    }
}
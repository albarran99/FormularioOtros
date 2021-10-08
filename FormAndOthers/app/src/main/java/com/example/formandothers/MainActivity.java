package com.example.formandothers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_Load;

    private CheckBox cb_Tv, cb_Radio,
            cb_Periodico, cb_Amigo, cb_otro;

    private TextView tv_Result, tvAnotherElse;

    private EditText et_Others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_Tv = (CheckBox) findViewById(R.id.cb_Tv);
        cb_Radio = (CheckBox) findViewById(R.id.cb_Radio);
        cb_Periodico = (CheckBox) findViewById(R.id.cb_Periodico);
        cb_Amigo = (CheckBox) findViewById(R.id.cb_Amigo);
        cb_otro = (CheckBox) findViewById(R.id.cb_Otro);
        tv_Result = (TextView) findViewById(R.id.tvResult);

        et_Others = (EditText) findViewById(R.id.et_Others);

        tvAnotherElse = (TextView) findViewById(R.id.tvAnoderElse);

        
    }

    public void showEditText(View v) {

    }

    public void showInfo(View v) {
        List<String> opcions = new ArrayList<>();

        if (cb_Tv.isChecked()) {
            opcions.add(cb_Tv.getText().toString());
        } if (cb_Radio.isChecked()) {
            opcions.add(cb_Radio.getText().toString());
        } if (cb_Periodico.isChecked()) {
            opcions.add(cb_Periodico.getText().toString());
        } if (cb_Amigo.isChecked()) {
            opcions.add(cb_Amigo.getText().toString());
        } if (cb_otro.isChecked()) {
            opcions.add(cb_otro.getText().toString());
        }
        tv_Result.setText(opcions.toString());
    }
}
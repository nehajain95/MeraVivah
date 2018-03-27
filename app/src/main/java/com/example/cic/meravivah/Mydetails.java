package com.example.cic.meravivah;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class Mydetails extends AppCompatActivity implements View.OnClickListener {


    Button Next;
    Intent i = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydetails);
        Next = (Button) findViewById(R.id.button3);

        Next.setOnClickListener(this);}

        //Button Ne = (Button) findViewById(R.id.button3);

        //start_button.setOnClickListener(this);

/*
    public void onClick(View view) {

        Intent j = new Intent(this, Mylocation.class);

        startActivity(j);

    }*/

    public void onClick (View v){

        Intent j = null;
        switch (v.getId()) {
            case R.id.button3:
                j= new Intent(this, Mylocation.class);

                break;
        }
        startActivity(j);
    }


    public void showDatePicker(View v) {
        DialogFragment newFragment = new Mydate();
        newFragment.show(getSupportFragmentManager(), "date picker");
       // Bundle bundle = new Bundle();
        //bundle.putExtra("EditText", v);
        //newFragment.setArguments(bundle); // setArguments is a method that already exists in fragments.
        //newFragment.show(getSupportFragmentManager(), "DatePicker");


    }
   // String dateString = sdf.format(date);
    //tvDisplayDate.setText(dateString);

}









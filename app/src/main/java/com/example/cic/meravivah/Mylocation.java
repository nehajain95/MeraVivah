package com.example.cic.meravivah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Spinner;

public class Mylocation extends AppCompatActivity implements View.OnClickListener{

    private Spinner spinner1;
    Button Next1;
    CheckedTextView ctv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylocation);

        Intent j = getIntent();

        final CheckedTextView ctv = (CheckedTextView) findViewById(R.id.checkedTextView);
        ctv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctv.isChecked())
                    ctv.setChecked(false);
                else
                    ctv.setChecked(true);

            }
        });


        Next1 = (Button) findViewById(R.id.button4);

        Next1.setOnClickListener(this);

        addListenerOnSpinnerItemSelection();}

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }


    public void onClick (View v){

        Intent j = null;
        switch (v.getId()) {
            case R.id.button4:
                j= new Intent(this, Mycareer.class);

                break;
        }
        startActivity(j);
    }


}



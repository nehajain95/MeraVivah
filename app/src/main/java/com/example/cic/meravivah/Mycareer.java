package com.example.cic.meravivah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Mycareer extends AppCompatActivity {

    Button Next;
    Intent j = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycareer);
        Next = (Button) findViewById(R.id.button5);

        // Next.setOnClickListener(this);}

    }
}





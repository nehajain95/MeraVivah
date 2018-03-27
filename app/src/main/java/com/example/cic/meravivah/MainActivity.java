package com.example.cic.meravivah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSignIn;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button) findViewById(R.id.button2);
        btnSignUp = (Button) findViewById(R.id.button);

        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);

    }
       // @Override
        public void onClick (View v){

            Intent i = null;
            switch (v.getId()) {
                case R.id.button:
                    i = new Intent(this, Mydetails.class);

                    break;
            }
            startActivity(i);
        }

}

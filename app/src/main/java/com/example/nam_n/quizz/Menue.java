package com.example.nam_n.quizz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Menue extends Activity implements View.OnClickListener {

    Button btnSpielen;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);

        btnSpielen = (Button) findViewById(R.id.btnSpielen);
        btnSpielen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent zumQuizz = new Intent(this, Quizz.class);
        startActivity(zumQuizz);
        this.finish();

    }
}

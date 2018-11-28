package com.example.nam_n.quizz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Endscreen extends Activity implements View.OnClickListener {

    Button btnStartseite;
    TextView tvPunkteAnzeige;

    SharedPreferences preferences;
    SharedPreferences.Editor preferencesEditor;

    int totalPoints;

    final String KEY = "speicherPreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endscreen);

        btnStartseite = (Button) findViewById(R.id.btnStartseite);
        btnStartseite.setOnClickListener(this);


        tvPunkteAnzeige = (TextView) findViewById(R.id.tvPunkteAnzeige);

        this.preferences = this.getSharedPreferences("highscore", MODE_PRIVATE);
        preferencesEditor = preferences.edit();

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            totalPoints = 0;
        } else {
            totalPoints = extras.getInt("Punkte");
        }

        punkteAnzeigen();
    }

    private void punkteAnzeigen() {
        if (preferences.getInt(KEY, 0) < totalPoints) {
            tvPunkteAnzeige.setText("Neuer HIGHSCORE! Erreichte Punktzahl: " + totalPoints);

            preferencesEditor.putInt(KEY, totalPoints);
        } else {
            tvPunkteAnzeige.setText("Erreichte Punktzahl: " + totalPoints);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Menue.class);
        startActivity(intent);
        this.finish();
    }
}

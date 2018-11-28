package com.example.nam_n.quizz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Quizz extends Activity implements View.OnClickListener {

    Button btnAntwort1, btnAntwort2, btnAntwort3, btnAntwort4;
    TextView tvFrage, tvPunkte;
    int aktuelleFrage = 0;
    int punkte = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        btnAntwort1 = (Button) findViewById(R.id.btnAntwort1);
        btnAntwort2 = (Button) findViewById(R.id.btnAntwort2);
        btnAntwort3 = (Button) findViewById(R.id.btnAntwort3);
        btnAntwort4 = (Button) findViewById(R.id.btnAntwort4);

        tvFrage = (TextView) findViewById(R.id.tvFrage);
        tvPunkte = (TextView) findViewById(R.id.tvPunkte);

        frageLaden();



        btnAntwort1.setOnClickListener(this);
        btnAntwort2.setOnClickListener(this);
        btnAntwort3.setOnClickListener(this);
        btnAntwort4.setOnClickListener(this);
    }

    private void frageLaden() {
        Fragen fragenC = new Fragen();
        ArrayList fragen = fragenC.getFragen();
        String[] frage = (String[]) fragen.get(aktuelleFrage);

        tvFrage.setText(frage[0]);

        int zufallszahl = (int) (Math.random() * (4-1) + 1);

        switch (zufallszahl) {
            case 1:
                btnAntwort1.setText(frage[1]);
                btnAntwort2.setText(frage[2]);
                btnAntwort3.setText(frage[3]);
                btnAntwort4.setText(frage[4]);
                break;
            case 2:
                btnAntwort1.setText(frage[4]);
                btnAntwort2.setText(frage[3]);
                btnAntwort3.setText(frage[1]);
                btnAntwort4.setText(frage[2]);
                break;
            case 3:
                btnAntwort1.setText(frage[2]);
                btnAntwort2.setText(frage[3]);
                btnAntwort3.setText(frage[4]);
                btnAntwort4.setText(frage[1]);
                break;
            case 4:
                btnAntwort1.setText(frage[3]);
                btnAntwort2.setText(frage[1]);
                btnAntwort3.setText(frage[4]);
                btnAntwort4.setText(frage[2]);
                break;
            case 5:
                btnAntwort1.setText(frage[1]);
                btnAntwort2.setText(frage[3]);
                btnAntwort3.setText(frage[4]);
                btnAntwort4.setText(frage[2]);
                break;
            case 6:
                btnAntwort1.setText(frage[1]);
                btnAntwort2.setText(frage[2]);
                btnAntwort3.setText(frage[4]);
                btnAntwort4.setText(frage[3]);
                break;
            case 7:
                btnAntwort1.setText(frage[3]);
                btnAntwort2.setText(frage[1]);
                btnAntwort3.setText(frage[4]);
                btnAntwort4.setText(frage[2]);
                break;
        }

        tvPunkte.setText("Punkte: " + punkte);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAntwort1:
                if (frageAuswertung((String) btnAntwort1.getText())) {
                    punkte++;
                }
                if (aktuelleFrage > 5) {
                    Intent intent = new Intent(this, Endscreen.class);
                    intent.putExtra("Punkte", punkte);
                    startActivity(intent);
                    this.finish();
                } else {
                    aktuelleFrage++;
                    if (aktuelleFrage <= 6) {
                        frageLaden();
                    }
                }
                break;
            case R.id.btnAntwort2:
                if (frageAuswertung((String) btnAntwort2.getText())) {
                    punkte++;
                }
                if (aktuelleFrage > 5) {
                    Intent intent = new Intent(this, Endscreen.class);
                    intent.putExtra("Punkte", punkte);
                    startActivity(intent);
                    this.finish();
                } else {
                    aktuelleFrage++;
                    if (aktuelleFrage <= 6) {
                        frageLaden();
                    }
                }
                break;
            case R.id.btnAntwort3:
                if (frageAuswertung((String) btnAntwort3.getText())) {
                    punkte++;
                }
                if (aktuelleFrage > 5) {
                    Intent intent = new Intent(this, Endscreen.class);
                    intent.putExtra("Punkte", punkte);
                    startActivity(intent);
                    this.finish();
                } else {
                    aktuelleFrage++;
                    if (aktuelleFrage <= 6) {
                        frageLaden();
                    }
                }
                break;
            case R.id.btnAntwort4:
                if (frageAuswertung((String) btnAntwort4.getText())) {
                    punkte++;
                }
                if (aktuelleFrage > 5) {
                    Intent intent = new Intent(this, Endscreen.class);
                    intent.putExtra("Punkte", punkte);
                    startActivity(intent);
                    this.finish();
                } else {
                    aktuelleFrage++;
                    if (aktuelleFrage <= 6) {
                        frageLaden();
                    }
                }
                break;
        }
    }

    private boolean frageAuswertung(String btnText) {
        boolean frage = false;
        Fragen fragenC = new Fragen();
        ArrayList fragen = fragenC.getFragen();
        String[] speicher = (String[]) fragen.get(aktuelleFrage);
        if (speicher[1].equals(btnText)) {
            frage = true;
        }
        return frage;
    }
}

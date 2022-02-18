package com.example.seriedeanimaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1=(TextView) findViewById(R.id.texto1);
        tv1.setText("Serie de Animaciones");
        TextView tv=(TextView) findViewById(R.id.texto);
        tv.setText("ANIMANDOME");
        Animation td =
                AnimationUtils.loadAnimation(this, R.anim.serie);
        td.setFillAfter(true);
        tv.startAnimation(td);
    }
}
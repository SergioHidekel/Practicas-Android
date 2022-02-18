package com.example.aparicion;

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
        TextView tv1= (TextView) findViewById(R.id.texto1);
        tv1.setText("Animaciones: aparicion y desaparicion");

        TextView tv= (TextView) findViewById(R.id.texto);
        tv.setText("APARECIENDO");

        Animation td=
                AnimationUtils.loadAnimation(this, R.anim.aparicion);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        tv.startAnimation(td);
    }
}
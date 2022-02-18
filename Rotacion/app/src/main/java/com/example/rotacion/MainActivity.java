package com.example.rotacion;

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
        TextView tv = (TextView) findViewById(R.id.texto);
        Animation td = AnimationUtils.loadAnimation(this,
                R.anim.rotacion);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        td.setFillAfter(true);
        tv.startAnimation(td);
        tv.append("\nRepeatMode:"+td.getRepeatMode());
        tv.append("\nRepeatCount"+td.getRepeatCount());
    }
}
package com.example.animacionjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.texto1);
        tv1.setText("Una serie de animaciones en  JAVA");

        TextView tv = (TextView) findViewById(R.id.texto);
        tv.setText("Me anima JAVA");

        AnimationSet animacion = new AnimationSet(true);

        //animacion aparicion
        AlphaAnimation aparicion = new AlphaAnimation(0,1);
        aparicion.setDuration(3000);

        //animacion escalado
        //rs indica que las coordenadas son relativas
        int rs= ScaleAnimation.RELATIVE_TO_SELF;
        ScaleAnimation escala=
                new ScaleAnimation(1,2,1,5,rs,0.5f,rs,0.5f);
        escala.setDuration(3000);
        escala.setStartOffset(3000);

        //animacion rotacion
        //rs indica que las coordenadas son relativas
        rs= RotateAnimation.RELATIVE_TO_SELF;
        RotateAnimation rotacion
                = new RotateAnimation(0,45,rs,0.5f,rs,0.5f);
        rotacion.setDuration(3000);
        rotacion.setStartOffset(6000);

        //animacion traslacion
        //rp indica que las coordenadas son relativas
        int rp= TranslateAnimation.RELATIVE_TO_PARENT;
        TranslateAnimation traslacion
                =new TranslateAnimation(rp,0f,rp,0f,rp,0f,rp,0.25f);
        traslacion.setDuration(3000);
        traslacion.setStartOffset(9000);

        //enlaza animaciones
        animacion.addAnimation(aparicion);
        animacion.addAnimation(escala);
        animacion.addAnimation(rotacion);
        animacion.addAnimation(traslacion);

        animacion.setFillAfter(true);
        animacion.setRepeatMode(Animation.RESTART);
        animacion.setRepeatCount(20);
        tv.startAnimation(animacion);
    }
}
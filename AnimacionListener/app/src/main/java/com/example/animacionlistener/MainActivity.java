package com.example.animacionlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

public class MainActivity extends Activity
        implements Animation.AnimationListener {
    int i=1;
    TextView tv;
    Animation escala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView) findViewById(R.id.texto1);
        tv1.setText("Usando la Interfaz AnimationListener");
        tv = (TextView) findViewById(R.id.texto);
        tv.setText("CONTADOR =" + i);
        //animacion aparaicion
        Animation aparicion = new AlphaAnimation(0, 1);
        aparicion.setDuration(1000);
        aparicion.setFillAfter(true);
        aparicion.setRepeatMode(Animation.RESTART);
        aparicion.setRepeatCount(10);
        aparicion.setAnimationListener(this);
        //animacion escalada
        //rs indica que las coordenadas son relativas
        int rs = ScaleAnimation.RELATIVE_TO_SELF;
        escala = new ScaleAnimation(1, 2, 1, 5, rs, 0.5f, rs, 0.5f);
        escala.setDuration(3000);
        escala.setFillAfter(true);
        tv.startAnimation(aparicion);
    }
    @Override
    public void  onAnimationEnd(Animation animation){
        tv.setText("THE END");
        tv.startAnimation(escala);
    }
    @Override
    public void onAnimationRepeat(Animation animation){
        i++;
        tv.setText("CONTADOR ="+i);
    }
    @Override
    public void onAnimationStart(Animation animation){

    }
}
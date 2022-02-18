package com.example.layanimlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //animacion traslacion
        //rp indica que las coordenadas son relativas
        int rp= TranslateAnimation.RELATIVE_TO_PARENT;
        TranslateAnimation traslacion
                =new TranslateAnimation(rp,1f,rp,0f,rp,0f,rp,0f);
        traslacion.setDuration(3000);

        LayoutAnimationController la
                =new LayoutAnimationController(traslacion);
        la.setDelay(1);
        la.setOrder(LayoutAnimationController.ORDER_NORMAL);

        LinearLayout ll
                =(LinearLayout) findViewById(R.id.layout);
        ll.setLayoutAnimation(la);
        ll.setLayoutAnimationListener(this);
    }
    @Override
    public void onAnimationEnd(Animation animation){
        int rs= RotateAnimation.RELATIVE_TO_SELF;
        RotateAnimation rotacion
                =new RotateAnimation(0,360,rs,0.5f,rs,0.5f);
        rotacion.setDuration(3000);
        TextView tv=(TextView) findViewById(R.id.texto);
        tv.setText("ESO NO ES TODO");
        tv.startAnimation(rotacion);
    }
    @Override
    public  void  onAnimationRepeat(Animation animation){

    }
    @Override
    public  void onAnimationStart(Animation animation){

    }
}
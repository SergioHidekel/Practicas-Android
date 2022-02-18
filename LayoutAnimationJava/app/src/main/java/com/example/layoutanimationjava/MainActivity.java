package com.example.layoutanimationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

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
    }
}
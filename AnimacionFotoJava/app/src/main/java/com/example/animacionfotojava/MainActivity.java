package com.example.animacionfotojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnimationDrawable animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animation= new AnimationDrawable();
        Resources resources=getResources();
        Drawable imagen1
                =resources.getDrawable(R.drawable.upiita01);
        Drawable imagen2
                =resources.getDrawable(R.drawable.upiita02);
        Drawable imagen3
                =resources.getDrawable(R.drawable.upiita03);
        Drawable imagen4
                =resources.getDrawable(R.drawable.upiita04);
        Drawable imagen5
                =resources.getDrawable(R.drawable.upiita05);
        Drawable imagen6
                =resources.getDrawable(R.drawable.upiita06);

        animation.addFrame(imagen1,3000);
        animation.addFrame(imagen2,3000);
        animation.addFrame(imagen3,3000);
        animation.addFrame(imagen4,3000);
        animation.addFrame(imagen5,3000);
        animation.addFrame(imagen6,3000);
        animation.setOneShot(false);

        ImageView image
                =(ImageView) findViewById(R.id.imagen);
        image.setVisibility(ImageView.VISIBLE);
        image.setBackgroundDrawable(animation);

        Button boton=(Button) findViewById(R.id.button1);
        boton.setOnClickListener(this);
        Button boton2=(Button) findViewById(R.id.button2);
        boton2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button1)animation.start();
        else animation.stop();
    }
}
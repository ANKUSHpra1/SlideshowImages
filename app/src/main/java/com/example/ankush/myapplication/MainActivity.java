package com.example.ankush.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Animation Fade_in, Fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper=(ViewFlipper)this.findViewById(R.id.bckgrndViewFlipper1);

        Fade_in= AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        Fade_out=AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setAnimation(Fade_in);
        viewFlipper.setOutAnimation(Fade_out);
        //set auto flipping

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }
}

package com.example.buttonanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RippleBackground rippleBackground =(RippleBackground)findViewById(R.id.content);
        final ImageView imageView=(ImageView)findViewById(R.id.image_animation);
        final Button button =(Button) findViewById(R.id.btn_red);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!rippleBackground.isRippleAnimationRunning()){
                    imageView.setColorFilter(Color.rgb(255,0,0)); //ganti warna saat animasi dijalankan
                    rippleBackground.startRippleAnimation(); //animasi dimulai
                }else {
                    imageView.setColorFilter(null); //kembali ke normal saat animasi berhenti
                    rippleBackground.stopRippleAnimation(); //animasi berhenti
                }
            }
        });

    }
}
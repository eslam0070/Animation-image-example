package com.eso.animation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView,imageView2;
    // boolean bartIsShowing = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
        //imageView.animate().rotation(1000).alpha(0).setDuration(1000);
        //imageView.animate().translationXBy(100).setDuration(1000);

        /*if (bartIsShowing){
            bartIsShowing = false;
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);

        }else {
            bartIsShowing = true;
            imageView.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);

        }*/
    }


}

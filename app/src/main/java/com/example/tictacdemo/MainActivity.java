package com.example.tictacdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

 private int player = 0;

 private int[] gamesState = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
 private int[][] Array = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void dropImage(View v){
        ImageView imageView = (ImageView) v;
        int state = Integer.valueOf(imageView.getTag().toString());
        imageView.setTranslationY(-1500);
        if (player == 0)
        {
            imageView.setImageResource(R.drawable.yellow);
            player = 1;
        }
        else
        {
            imageView.setImageResource(R.drawable.red);
            player = 0;
        }

        imageView.animate().translationYBy(1500).setDuration(300);

    }

                          @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

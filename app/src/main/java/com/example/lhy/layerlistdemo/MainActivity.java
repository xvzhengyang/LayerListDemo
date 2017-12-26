package com.example.lhy.layerlistdemo;

import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tvHelloWorld).setActivated(true);
        //获得我们合成的图片
        LayerDrawable layerDrawable = (LayerDrawable) getResources().getDrawable(R.drawable.duidietupian);
        //替换合成图片中内容
        layerDrawable.setDrawableByLayerId(R.drawable.food_booking_reservation, getResources().getDrawable(getDrawableId(1)));
        //显示更改后的效果
        ImageView imageView = findViewById(R.id.ivPic);
        imageView.setImageDrawable(layerDrawable);
    }
    public int getDrawableId(int num){
        switch (num) {
            case 0:
                return R.drawable.food_booking_reservation;
            case 1:
                return R.drawable.food_brand;
            default:
                break;
        }

        return R.drawable.food_booking_reservation;
    }
}

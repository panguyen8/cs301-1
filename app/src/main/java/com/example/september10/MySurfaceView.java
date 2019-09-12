package com.example.september10;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.SurfaceView;
import android.util.AttributeSet;

public class MySurfaceView extends SurfaceView {

    private int size;


    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {

        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        //paint.setStyle(Paint.Style.Stroke);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(100, 200, 200, 400, paint);


        Bitmap myImageBMP = BitmapFactory.decodeResource(getResources(), R.drawable.pigeon);
        canvas.drawColor(Color.WHITE);

        Bitmap newImage = Bitmap.createScaledBitmap(myImageBMP, size, size, false);

        canvas.drawBitmap(newImage, 100, 10, null);
        Log.i("MySurfaceView.onDraw", "I just drew the image!");
    }

    public void setBitmapSize(int progress) {
        size = progress;
        invalidate();
    }
}
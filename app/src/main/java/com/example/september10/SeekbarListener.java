package com.example.september10;

import android.view.SurfaceView;
import android.widget.SeekBar;

public class SeekbarListener implements SeekBar.OnSeekBarChangeListener{

    private MySurfaceView surfaceView;

    public SeekbarListener(MySurfaceView sv){
        surfaceView = sv;
    }


    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
        surfaceView.setBitmapSize(progress);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    public void onStopTrackingTouch(SeekBar seekBar){

    }
}

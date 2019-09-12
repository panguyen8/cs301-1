
package com.example.september10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySurfaceView mySurfaceView = (MySurfaceView) findViewById(R.id.surfaceView);


        SeekBar seekbarObj = (SeekBar) findViewById(R.id.seekbar);
        seekbarObj.setOnSeekBarChangeListener(new SeekbarListener(mySurfaceView));


    }
}

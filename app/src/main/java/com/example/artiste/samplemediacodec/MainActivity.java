package com.example.artiste.samplemediacodec;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.Surface;

public class MainActivity extends Activity {
    SampleMediaCodec sampleMediaCodec;
    private SurfaceView videoSurfaceView;
    private SurfaceHolder surfaceHolder;
    private Surface surface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sampleMediaCodec = new SampleMediaCodec();
        videoSurfaceView = (SurfaceView)findViewById(R.id.surfaceView);
        surfaceHolder = videoSurfaceView.getHolder();
        surface = surfaceHolder.getSurface();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_play) {
            sampleMediaCodec.play(this, surface);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

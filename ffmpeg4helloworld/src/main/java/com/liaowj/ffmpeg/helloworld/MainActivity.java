package com.liaowj.ffmpeg.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/**
 * @author liaowj
 * @time 2018/12/31 11:36 PM
 * @desc
 **/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 获取 FFMpeg 相关信息，打印到 TextView 中
     *
     * @param view
     */
    public void logFFMpegInfo(View view) {
        FFmpegDemo fFmpegDemo = new FFmpegDemo();
        fFmpegDemo.logFFMpegInfo();
    }
}

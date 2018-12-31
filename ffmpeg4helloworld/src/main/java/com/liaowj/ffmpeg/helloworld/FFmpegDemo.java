package com.liaowj.ffmpeg.helloworld;

/**
 * @author liaowj
 * @time 2018/12/31 11:04 PM
 * @desc
 **/
public class FFmpegDemo {

    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("swresample-2");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("postproc-54");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avdevice-57");
    }


    public native void logFFMpegInfo();
}

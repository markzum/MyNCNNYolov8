package com.appzum.myncnnyolov8;

import android.content.res.AssetManager;
import android.view.Surface;


public class Yolov8Ncnn {
    public native boolean loadModel(AssetManager mgr, int modelid, int cpugpu);
    public native boolean openCamera(int facing);
    public native boolean closeCamera();
    public native boolean setOutputWindow(Surface surface);
//    public native boolean detect(Surface surface);

    static {
        System.loadLibrary("yolov8ncnn");
    }
}
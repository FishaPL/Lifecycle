package com.fisha.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver
{
    private static final String TAG = MainActivityObserver.class.getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void create() {
        Log.i(TAG, "[] ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void start() {
        Log.i(TAG, "[] ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void resume() {
        Log.i(TAG, "[] ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void pause() {
        Log.i(TAG, "[] ON_PAUSE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void stop() {
        Log.i(TAG, "[] ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void destroy() {
        Log.i(TAG, "[] ON_DESTROY");
    }
}

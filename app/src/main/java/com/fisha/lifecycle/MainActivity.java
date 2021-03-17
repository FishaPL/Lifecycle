package com.fisha.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.fisha.lifecycle.databinding.ActivityMainBinding;

// https://developer.android.com/guide/components/activities/activity-lifecycle
public class MainActivity extends AppCompatActivity {

    private static  final String TAG = MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    private void printMethodName(String methodName) {
        Log.i(TAG, "[] " + methodName);
        binding.textViewActivityLog.append("\n[] " + methodName);
        Toast.makeText(getApplicationContext(), methodName + " in Fragment was Called", Toast.LENGTH_SHORT).show();
    }
}

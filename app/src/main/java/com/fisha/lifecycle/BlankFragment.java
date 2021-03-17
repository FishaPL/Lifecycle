package com.fisha.lifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.fisha.lifecycle.databinding.FragmentBlankBinding;

// https://developer.android.com/guide/fragments/lifecycle
public class BlankFragment extends Fragment
{
    private static  final String TAG = BlankFragment.class.getSimpleName();
    private FragmentBlankBinding binding;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(TAG, "[] " + methodName);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(TAG, "[] " + methodName);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onStart() {
        super.onStart();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onResume() {
        super.onResume();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onPause() {
        super.onPause();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onStop() {
        super.onStop();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        printMethodName(methodName);
    }

    private void printMethodName(String methodName)
    {
        Log.i(TAG, "[] " + methodName);
        binding.textViewFragmentLog.append("\n[] " + methodName);
        Toast.makeText(getActivity(), methodName + " in Fragment was Called", Toast.LENGTH_SHORT).show();
    }
}
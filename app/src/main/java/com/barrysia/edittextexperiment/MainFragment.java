package com.barrysia.edittextexperiment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainFragment extends Fragment {

    @Override
    public void onCreate(final Bundle savedInstance) {
        super.onCreate(savedInstance);
        getFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                if (getView() != null) {
                    getView().setFocusable(true);
                    getView().requestFocus(View.FOCUS_DOWN);
                }
            }
        });

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstance) {
        final View view = inflater.inflate(R.layout.content_main, container, false);

//        EditText edit = (EditText) view.findViewById(R.id.first_edittext);
//        InputMethodManager imgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//        //imgr.showSoftInput(getView(), InputMethodManager.SHOW_IMPLICIT);
//        imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
//
//        edit.requestFocus();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                EditText edit = (EditText) view.findViewById(R.id.first_edittext);
                InputMethodManager imgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                //imgr.showSoftInput(getView(), InputMethodManager.SHOW_IMPLICIT);
                //imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
                //getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM);
                //getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE);
                //edit.requestFocus();


                //view.requestFocus();
                edit.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_DOWN, 0, 0, 0));
                edit.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), MotionEvent.ACTION_UP, 0, 0, 0));
            }
        }, 3000);

        getFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                if (getView() != null) {
                    getView().setFocusable(true);
                    getView().requestFocus();
                }
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(final Bundle savedInstance) {
        super.onActivityCreated(savedInstance);
//        EditText edit = (EditText) getView().findViewById(R.id.first_edittext);
//        InputMethodManager imgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//        //imgr.showSoftInput(getView(), InputMethodManager.SHOW_IMPLICIT);
//        imgr.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
//
//        edit.requestFocus();

    }

}

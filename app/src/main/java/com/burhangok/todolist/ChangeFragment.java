package com.burhangok.todolist;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class ChangeFragment {


    public Context context;

    public ChangeFragment(Context context) {
        this.context = context;
    }

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    void change (Fragment fragment) {

        fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.replace(R.id.content_frame,fragment);
        fragmentTransaction.commit();
    }
}

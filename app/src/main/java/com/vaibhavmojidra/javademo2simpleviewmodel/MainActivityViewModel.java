package com.vaibhavmojidra.javademo2simpleviewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int count=0;
    int getCount(){
        return count;
    }

    void incrementCounter(){
        count++;
    }
}

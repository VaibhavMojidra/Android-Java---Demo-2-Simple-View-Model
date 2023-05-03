package com.vaibhavmojidra.javademo2simpleviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.javademo2simpleviewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel=new  ViewModelProvider(this).get(MainActivityViewModel.class);
        mainBinding.countTextview.setText(viewModel.getCount()+"");
        mainBinding.incrementBtn.setOnClickListener(view -> {
            viewModel.incrementCounter();
            mainBinding.countTextview.setText(viewModel.getCount()+"");
        });
    }
}
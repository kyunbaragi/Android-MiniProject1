package com.project1.mini.yunkyun.miniproject1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project1.mini.yunkyun.miniproject1.R;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class EmptyFragment extends Fragment {
    public EmptyFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_empty, container, false);
    }
}

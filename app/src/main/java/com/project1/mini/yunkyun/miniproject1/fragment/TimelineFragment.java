package com.project1.mini.yunkyun.miniproject1.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project1.mini.yunkyun.miniproject1.R;
import com.project1.mini.yunkyun.miniproject1.adapter.RecyclerAdapter;
import com.project1.mini.yunkyun.miniproject1.object.TimelineItem;

import java.util.LinkedList;
import java.util.List;

import static com.project1.mini.yunkyun.miniproject1.R.id.rv;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class TimelineFragment extends Fragment {
    private List<TimelineItem> itemList;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    public TimelineFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timeline, container, false);

        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView = view.findViewById(rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        itemList = new LinkedList<>();
        initTimelineContent();

        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), itemList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    private void initTimelineContent() {
        itemList = new LinkedList<>();
        itemList.add(new TimelineItem("CHEEZE(치즈)_Mood Indigo(무드 인디고)",
                "게시일: 2017. 2. 17.\n"
                        + "CHEEZE(치즈)_Mood Indigo(무드 인디고)\n"
                        + "https://www.youtube.com/watch?v=xlBw-07WC1I\n"
                        + "'여친이 무드인디고를 불러준다면?'"));
        itemList.add(new TimelineItem());
        itemList.add(new TimelineItem());
        itemList.add(new TimelineItem());
        itemList.add(new TimelineItem());
    }
}

package com.project1.mini.yunkyun.miniproject1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project1.mini.yunkyun.miniproject1.R;
import com.project1.mini.yunkyun.miniproject1.object.TimelineItem;

import java.util.List;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context context = null;
    private List<TimelineItem> items = null;

    public RecyclerAdapter(Context context, List<TimelineItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_timeline_item, null);



        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final TimelineItem item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.content.setText(item.getContent());
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title = null;
        TextView content = null;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.timeline_item_title);
            content = itemView.findViewById(R.id.timeline_item_content);
        }
    }
}

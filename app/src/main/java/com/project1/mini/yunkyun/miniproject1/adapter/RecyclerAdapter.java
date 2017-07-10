package com.project1.mini.yunkyun.miniproject1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.project1.mini.yunkyun.miniproject1.R;
import com.project1.mini.yunkyun.miniproject1.object.TimelineItem;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<TimelineItem> itemList = null;
    private Context context = null;

    public RecyclerAdapter(Context context) {
        this.itemList = new LinkedList<>();
        this.context = context;
    }

    public void addItem(TimelineItem item){
        itemList.add(item);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final TimelineItem item = itemList.get(position);
        holder.title.setText(item.getTitle());
        holder.content.setText(item.getContent());
        holder.like.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, context.getResources().getString(R.string.touch_timeline_like), Toast.LENGTH_SHORT).show();
            }
        });
        holder.comment.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, context.getResources().getString(R.string.touch_timeline_comment), Toast.LENGTH_SHORT).show();
            }
        });
        holder.share.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, context.getResources().getString(R.string.touch_timeline_share), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title = null;
        private TextView content = null;
        private ImageButton like = null;
        private ImageButton comment = null;
        private ImageButton share = null;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_timeline_item_title);
            content = itemView.findViewById(R.id.tv_timeline_item_content);
            like = itemView.findViewById(R.id.btn_timeline_like);
            comment = itemView.findViewById(R.id.btn_timeline_comment);
            share = itemView.findViewById(R.id.btn_timeline_share);
        }
    }
}

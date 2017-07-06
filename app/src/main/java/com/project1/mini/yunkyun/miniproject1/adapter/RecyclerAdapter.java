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

import java.util.List;

/**
 * Created by YunKyun on 2017-07-04.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context context = null;
    private List<TimelineItem> itemList = null;

    public RecyclerAdapter(Context context, List<TimelineItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item, null);
        ImageButton like = view.findViewById(R.id.btn_timeline_like);
        ImageButton comment = view.findViewById(R.id.btn_timeline_comment);
        ImageButton share = view.findViewById(R.id.btn_timeline_share);
        like.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "'좋아요 버튼'을 누릅니다.", Toast.LENGTH_SHORT).show();
            }
        });
        comment.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "'댓글달기 버튼'을 누릅니다.", Toast.LENGTH_SHORT).show();
            }
        });
        share.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "'공유하기 버튼'을 누릅니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final TimelineItem item = itemList.get(position);
        holder.title.setText(item.getTitle());
        holder.content.setText(item.getContent());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title = null;
        TextView content = null;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_timeline_item_title);
            content = itemView.findViewById(R.id.tv_timeline_item_content);
        }
    }
}

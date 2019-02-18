package com.bw.djr2019218.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bw.djr2019218.R;
import com.bw.djr2019218.model.JavaBean1;


import java.util.ArrayList;
import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private ArrayList<JavaBean1> bean1s;
    private static final int TYPE_ONE = 0;
    private static final int TYPE_TWO = 1;
    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    public MyAdapter(Context context, ArrayList<JavaBean1> bean1s) {
        this.context = context;
        this.bean1s = bean1s;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (TYPE_ONE == i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, null, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        } else {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item1,
                    null, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (TYPE_ONE == itemViewType) {
            viewHolder.text1.setText(bean1s.get(i).getStep());
            Glide.with(context).load(bean1s.get(i).getImg()).into(viewHolder.img1);
        } else {
            Glide.with(context).load(bean1s.get(i).getImg()).into(viewHolder.img2); } }
    @Override
    public int getItemCount() {
        return bean1s.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView img1;
        private final TextView text1;
        private final ImageView img2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img1);
           text1= itemView.findViewById(android.R.id.text1);
            img2 = itemView.findViewById(R.id.img2);
        }
    }
}

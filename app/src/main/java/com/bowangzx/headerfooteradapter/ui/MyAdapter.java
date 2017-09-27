package com.bowangzx.headerfooteradapter.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bowangzx.headerfooteradapter.R;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    Context context;

    public MyAdapter(Context context) {
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_test,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText("我是第"+position+"项");
    }
    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.tv);

        }
    }
}

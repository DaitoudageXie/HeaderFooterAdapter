package com.bowangzx.headerfooteradapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/5 0005.
 */

public abstract class MyBaseRecyclerAdapter<T,VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH>{
    List<T> datas;
    Context context;

    public MyBaseRecyclerAdapter(Context context) {
        this.context=context;
        datas=new ArrayList<>();
    }

    public void clearData(){
        datas.clear();
        notifyDataSetChanged();
    }
    public int getSize(){
        return datas.size();
    }
    public void addData(T t){
        if (t==null){
            return;
        }
        datas.add(t);
        notifyDataSetChanged();
    }
    public void deleteData(int pos){
        datas.remove(pos);
        notifyDataSetChanged();
    }
    public void addData(int index,T t){
        if (t==null){
            return;
        }
        datas.add(index,t);
        notifyDataSetChanged();
    }
    public void addAllDatas(List<T> ts){
        if (ts==null){
            return;
        }
        datas.addAll(ts);
        notifyDataSetChanged();
    }

    public List<T> getAllData(){
        return datas;
    }

    public T getData(int pos){
        return datas.get(pos);
    }
    public void remove(int index){
        datas.remove(index);
        notifyDataSetChanged();
    }
    public void remove(T t){
        datas.remove(t);
        notifyDataSetChanged();
    }

    public  void setData(int pos,T t){
        datas.set(pos,t);
        notifyDataSetChanged();
    }

}

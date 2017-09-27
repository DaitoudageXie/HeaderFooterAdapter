package com.bowangzx.headerfooteradapter.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bowangzx.headerfooteradapter.R;
import com.bowangzx.headerfooteradapter.hongyang.HeaderAndFooterWrapper;

public class TestZhyActivity extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter myAdapter;
    HeaderAndFooterWrapper wrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_zhy);
        rv= (RecyclerView) findViewById(R.id.rv);
        myAdapter=new MyAdapter(this);

        wrapper=new HeaderAndFooterWrapper(myAdapter);
        rv.setAdapter(wrapper);
        rv.setLayoutManager(new LinearLayoutManager(this));
        View header=View.inflate(this,R.layout.item_header,null);
        View header2=View.inflate(this,R.layout.item_header2,null);
        wrapper.addHeaderView(header);
        wrapper.addHeaderView(header2);
        wrapper.addFootView(header);

    }
}

package com.bw.djr2019218.view.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.bw.djr2019218.R;
import com.bw.djr2019218.model.JavaBean1;
import com.bw.djr2019218.model.JavaBean2;
import com.bw.djr2019218.model.JavaBean3;
import com.bw.djr2019218.presenter.presenter;
import com.bw.djr2019218.view.ImainView;
import com.bw.djr2019218.view.MyAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ImainView {

    private RecyclerView recyclerView;
    private com.bw.djr2019218.presenter.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        presenter = new presenter(this);
        presenter.qing();

    }

    @Override
    public void getDate(String s) {
        Gson gson = new Gson();
        JavaBean3 bean3 = gson.fromJson(s, JavaBean3.class);
        JavaBean2 bean2 = bean3.getResult().getData().get(0);
        ArrayList<JavaBean1> bean1s = bean2.getSteps();
        Message message = new Message();
        message.obj=bean1s;
        handler.sendMessage(message);
    }
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            ArrayList<JavaBean1> bean1s= (ArrayList<JavaBean1>) msg.obj;
             Toast.makeText(MainActivity.this,bean1s.toString(),Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.jiebang();
    }
}

package com.example.subs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewist;
    private ArrayList<GetterSetterData> data ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewist = findViewById(R.id.recyclerv_view);
        recyclerViewist.setHasFixedSize(true);

        showList();
    }

    private void showList() {
        recyclerViewist.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(MainActivity.this,Data.getListData());
        recyclerViewist.setAdapter(recycleViewAdapter);

    }

    private void runLayoutAnimation(RecyclerView recyclerView){
        Context context = recyclerView.getContext();
        LayoutAnimationController layoutAnimationController = AnimationUtils.loadLayoutAnimation(context,R.anim.layout_animation_fall_down);

        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

}

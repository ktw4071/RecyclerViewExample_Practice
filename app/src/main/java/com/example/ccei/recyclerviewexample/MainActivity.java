package com.example.ccei.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView taraRecyclerView;
    TARARecyclerViewAdapter taraAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taraRecyclerView = (RecyclerView) findViewById(R.id.recycler_list);

        //아이템을 배치할 레이아웃 매니저를 등록한다.
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //GridLayoutManager layoutManager = new GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL, false);

        taraRecyclerView.setLayoutManager(layoutManager);

        taraAdapter = new TARARecyclerViewAdapter();
        taraAdapter.taraMemberInsert(new TARAValueObject("보람", R.drawable.t_ara_icon_boram));
        taraAdapter.taraMemberInsert(new TARAValueObject("은정", R.drawable.t_ara_icon_eunjung));
        taraAdapter.taraMemberInsert(new TARAValueObject("효민", R.drawable.t_ara_icon_hyomin));
        taraAdapter.taraMemberInsert(new TARAValueObject("지연", R.drawable.t_ara_icon_jiyeon));
        taraAdapter.taraMemberInsert(new TARAValueObject("큐리", R.drawable.t_ara_icon_qri));
        taraAdapter.taraMemberInsert(new TARAValueObject("소연", R.drawable.t_ara_icon_soyeon));

        taraRecyclerView.setAdapter(taraAdapter);
    }
}

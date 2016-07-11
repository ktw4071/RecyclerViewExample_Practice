package com.example.ccei.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccei on 2016-07-11.
 */
public class TARARecyclerViewAdapter extends RecyclerView.Adapter<TARARecyclerViewAdapter.TARAViewHolder> {

    //아이템(Childview)으로 그려질 자료원천지를 선언한다.

    private ArrayList<TARAValueObject> memberList = new ArrayList<>();

    public void taraMemberInsert(TARAValueObject valueObject){
        memberList.add(valueObject);
    }

    public void taraAllInsert(ArrayList<TARAValueObject> members){
        memberList.addAll(members);
    }

    public class TARAViewHolder extends RecyclerView.ViewHolder{
        ImageView memberImage;
        TextView memberName;
        public TARAViewHolder(View itemView){
            super(itemView);
            memberImage = (ImageView)itemView.findViewById(R.id.member_image);
            memberName = (TextView)itemView.findViewById(R.id.member_name);
        }
    }

    @Override
    public void onBindViewHolder(TARAViewHolder holder, int position) {
        final TARAValueObject valueObject = memberList.get(position);
        // memberImage 리소스가 Drawable 대신 int 값으로 접근가능하다(?)
        holder.memberImage.setImageResource(valueObject.memberImage);
        holder.memberName.setText(valueObject.memberName);
        holder.memberImage.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(v.getContext(), valueObject.memberName + "is selected!", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    //아이템이 그려질 레이아웃을 Inflation 하여 TARAViewHolder에 넘겨준다
    @Override
    public TARAViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.tara_list_view_item, parent, false);
        return new TARAViewHolder(itemRootView);
    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }


}

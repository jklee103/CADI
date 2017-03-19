package com.example.a0.myapplication;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 잭0 on 2017-03-19.
 */

public class MemAdapter extends BaseAdapter {
    private ArrayList<Member> itemList;
    private Context context;
    private View mView;
    int position;
    private Button bt;
    private TextView name, number;
    public MemAdapter(ArrayList<Member> itemList, Context context) {
        this.itemList=itemList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
            return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.member_items,parent,false);
        mView=(View)itemView.findViewById(R.id.memView);
        this.position=position;

        name=(TextView) itemView.findViewById(R.id.name);
        number=(TextView) itemView.findViewById(R.id.num);
        bt=(Button) itemView.findViewById(R.id.btn);
        fillViews(mView, position);
        return itemView;
    }

    private void fillViews(View mView, int position) {
        name.setText(itemList.get(position).getMem());
        number.setText(itemList.get(position).getNumber());
        clickButton(bt, position);
    }

    private void clickButton(Button bt, int position){
        bt.setOnClickListener(new btnListener(position));
    }
    private class btnListener implements View.OnClickListener {
        int position;
        public btnListener(int position) {
            this.position = position;
        }
        @Override
        public void onClick(View v) {
            Toast.makeText(context, itemList.get(position).getMem() + " / " + itemList.get(position).getNumber() , Toast.LENGTH_SHORT).show();
        }
    }
}

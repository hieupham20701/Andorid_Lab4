package com.example.lab4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab4.R;
import com.example.lab4.model.Good;

import java.util.ArrayList;

public class CustomerGoodsAdapter extends BaseAdapter {

    public CustomerGoodsAdapter(Context context, int layoutItem, ArrayList<Good> arrayList) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    Context context;
    int layoutItem;
    ArrayList<Good> arrayList;


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(layoutItem,viewGroup, false);
        TextView txtView = view.findViewById(R.id.txtView);
        TextView txtShopName = view.findViewById(R.id.txtShopName);
        ImageView imgGoods = view.findViewById(R.id.imgGoods);

        txtShopName.setText(arrayList.get(i).getName());
        txtShopName.setText(arrayList.get(i).getShopName());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());

        return view;
    }

}

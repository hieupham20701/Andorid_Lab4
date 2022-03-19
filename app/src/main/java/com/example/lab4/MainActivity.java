package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab4.adapter.CustomerGoodsAdapter;
import com.example.lab4.model.Good;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Good> goods;
    private ListView lstGoods;
    private CustomerGoodsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstGoods = findViewById(R.id.lstGoods);

        goods = new ArrayList<>();
        goods.add(new Good("Ca nấu lẫu, nấu mì mini...","Shop Devang",R.drawable.ca_nau_lau));
        goods.add(new Good("1 Kg gà khô bơ tỏi,..","LTD Food",R.drawable.ga_bo_toi));
        goods.add(new Good("Xe cần cẩu đa năng","Shop Thế giới đồ chơi",R.drawable.xa_can_cau));
        goods.add(new Good("Đồ chơi dạng mô hình","Shop thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        goods.add(new Good("Lãnh đạo giản đơn","Minh Long Book",R.drawable.lanh_dao_gian_don));
        goods.add(new Good("Hiểu lòng con trẻ","Minh Long Book",R.drawable.hieu_long_con_tre));

        adapter = new CustomerGoodsAdapter(this,R.layout.item_listview, goods);
        lstGoods.setAdapter(adapter);

    }
}
package com.example.doan.playlist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.R;
import com.example.doan.adapter.AdapterMSPlist;
import com.example.doan.fragment.ChartFragment;
import com.example.doan.fragment.HomeFragment;
import com.example.doan.fragment.LibraryFragment;
import com.example.doan.fragment.SearchFragment;
import com.example.doan.users.MSPList;
import com.example.doan.users.User;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MusicPlaylistActivity extends AppCompatActivity {
    RecyclerView   rcMSPlist;
    AdapterMSPlist adapterMSPlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_playlist);
        rcMSPlist = findViewById(R.id.rc_MSPlist);
        adapterMSPlist = new AdapterMSPlist(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1 );
         rcMSPlist.setLayoutManager(gridLayoutManager);
         adapterMSPlist.setDataMSPL(getListMSPL());
         rcMSPlist.setAdapter(adapterMSPlist);
    }
    private List<MSPList> getListMSPL(){
        List<MSPList> list = new ArrayList<>();
        list.add(new MSPList("1","An Tinh Sang Trang","An Tinh Sang Trang","antinhsangtrang.jpg"));
        list.add(new MSPList("2","Chạm","Chạm","cham.jpg"));
        list.add(new MSPList("3","Có Chơi Có Chịu","Có Chơi Có Chịu","cochoicochiu.jpg"));
        list.add(new MSPList("4","Không Biết","Không Biết","khongbiet.jpg"));
        list.add(new MSPList("5","Quen Anh Đi","Quen Anh Đi","quenanhdi.jpg"));
        list.add(new MSPList("6","Sunroof","Sunroof","sunroof.jpg"));
        list.add(new MSPList("7","Thế Giới Trong Em","Thế Giới Trong Em","thegioitrongem.jpg"));
        list.add(new MSPList("8","Tòng Phu","Tòng Phu","tongphu.jpg"));
        list.add(new MSPList("9","Unoly","Unoly","unoly.jpg"));
        list.add(new MSPList("10","Waitting For You","Waitting For You","waitingforyou.jpg"));
        return list;
    }
}
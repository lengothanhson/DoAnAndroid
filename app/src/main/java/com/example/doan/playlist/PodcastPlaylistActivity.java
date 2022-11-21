package com.example.doan.playlist;
import com.example.doan.R;
import com.example.doan.adapter.AdapterMSPlist;
import com.example.doan.adapter.AdapterPodCast;
import com.example.doan.users.MSPList;
import com.example.doan.users.PodCast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PodcastPlaylistActivity extends AppCompatActivity {
RecyclerView rcPodcast;
AdapterPodCast adapterPodCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_playlist);
      rcPodcast = findViewById(R.id.rc_PodCast);
        adapterPodCast = new AdapterPodCast(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1 );
        rcPodcast.setLayoutManager(gridLayoutManager);
        adapterPodCast.setDataPCast(getListPodCast());
        rcPodcast.setAdapter(adapterPodCast);
    }
    private List<PodCast> getListPodCast(){
        List<PodCast> list = new ArrayList<>();
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));

        return list;
    }
}
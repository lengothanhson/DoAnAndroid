package com.example.doan.playlist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doan.R;
import com.example.doan.adapter.AdapterMSPlist;
import com.example.doan.adapter.AdapterPodCast;
import com.example.doan.users.PodCast;
import com.example.doan.users.User;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PodCastPlayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PodCastPlayFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PodCastPlayFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PodCastPlayFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PodCastPlayFragment newInstance(String param1, String param2) {
        PodCastPlayFragment fragment = new PodCastPlayFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pod_cast_play, container, false);
    }
    RecyclerView rcPodcast;
    ArrayList<PodCast> list ;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getListPodCast();
        rcPodcast = view.findViewById(R.id.rc_PodCast);
        rcPodcast.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        rcPodcast.setHasFixedSize(true);
        AdapterPodCast adapterPodCast = new AdapterPodCast(list, new AdapterPodCast.onitemclick() {
            @Override
            public void onItemClick(User user) {
            }
        });
        rcPodcast.setAdapter(adapterPodCast);
        adapterPodCast.notifyDataSetChanged();
    }
     void getListPodCast(){
       list = new ArrayList<>();
        list.add(new PodCast("1","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("2","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("3","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("4","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("5","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("6","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("7","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("8","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("9","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
        list.add(new PodCast("10","antinhsangtrang.jpg","An Tinh Sang Trang","Úm ba la a ba la tráp một câu chuyện buồn thật sự của một chàng trai và một cô gái có mối tình ngàn năm nhưng chằng thể đến được với nhau"));
    }
}
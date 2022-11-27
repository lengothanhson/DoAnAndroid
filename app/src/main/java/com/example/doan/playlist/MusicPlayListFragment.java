package com.example.doan.playlist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doan.R;
import com.example.doan.adapter.AdapterMSPlist;
import com.example.doan.users.MSPList;
import com.example.doan.users.User;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicPlayListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicPlayListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MusicPlayListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicPlayListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicPlayListFragment newInstance(String param1, String param2) {
        MusicPlayListFragment fragment = new MusicPlayListFragment();
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
        return inflater.inflate(R.layout.fragment_music_play_list, container, false);
    }
    RecyclerView rcMSPlist;
    ArrayList<MSPList> list;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcMSPlist = view.findViewById(R.id.rc_MSPlist);
        getListMSPL();
        rcMSPlist.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        rcMSPlist.setHasFixedSize(true);
        AdapterMSPlist adapterMSPlist = new AdapterMSPlist(list, new AdapterMSPlist.onitemclick() {
            @Override
            public void onItemClick(User user) {
            }
        });
        rcMSPlist.setAdapter(adapterMSPlist);
        adapterMSPlist.notifyDataSetChanged();
    }
    void getListMSPL(){
        list = new ArrayList<>();
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

    }

}
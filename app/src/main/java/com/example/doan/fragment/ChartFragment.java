package com.example.doan.fragment;

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
import com.example.doan.users.User;
import com.example.doan.adapter.UserAdapter;
import com.example.doan.adapter.UserAdapterChart;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChartFragment extends Fragment {
    ArrayList<User> lstUser;
    UserAdapter userAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView rvListC;
    public ChartFragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChartFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChartFragment newInstance(String param1, String param2) {
        ChartFragment fragment = new ChartFragment();
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
        return inflater.inflate(R.layout.fragment_chart, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        rvListC =view.findViewById(R.id.rvListChart);
        rvListC.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));
        rvListC.setHasFixedSize(true);
        UserAdapterChart userAdapterChart = new UserAdapterChart(lstUser, new UserAdapterChart.onitemclick() {
            @Override
            public void onItemClick(User user) {
            }
        });
//        StaggeredGridLayoutManager gridLayoutManager =
//                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        rvListC.setLayoutManager(gridLayoutManager);
      rvListC.setAdapter(userAdapterChart);
       userAdapterChart.notifyDataSetChanged();
    }
    void LoadData(){
        lstUser = new ArrayList<>();
        lstUser.add(new User("1","Ân Tình Sang Trang","antinhsangtrang.jpg"));
        lstUser.add(new User("2","Chạm","cham.jpg"));
        lstUser.add(new User("3","Có Chơi Có Chịu","cochoicochiu.jpg"));
        lstUser.add(new User("4","Không Biết","khongbiet.jpg"));
        lstUser.add(new User("5","Quên Anh Đi","quenanhdi.jpg"));
        lstUser.add(new User("6","SunRoof","sunroof.jpg"));
        lstUser.add(new User("7","Thế Giới Trong Em","thegioitrongem.jpg"));
        lstUser.add(new User("8","Tòng Phu","tongphu.jpg"));
        lstUser.add(new User("9","Unnoly","unoly.jpg"));
        lstUser.add(new User("10","Waiting For You","waitingforyou.jpg"));

    }
}
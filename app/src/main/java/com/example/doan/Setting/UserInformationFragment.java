package com.example.doan.Setting;

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
import com.example.doan.adapter.AdapterUFT;
import com.example.doan.adapter.UserAdapterLibrary;
import com.example.doan.users.User;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserInformationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserInformationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UserInformationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UserInformationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserInformationFragment newInstance(String param1, String param2) {
        UserInformationFragment fragment = new UserInformationFragment();
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
    ArrayList<User> lstUser;
    AdapterUFT userAdapterLibrary;
    private RecyclerView rvListLibraryC;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_information, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        rvListLibraryC = view.findViewById(R.id.rvDanhSachPhat);
        rvListLibraryC.setLayoutManager(new LinearLayoutManager(getContext()));
        rvListLibraryC.setHasFixedSize(true);
        UserAdapterLibrary userAdapterLibrary = new UserAdapterLibrary(lstUser);
        rvListLibraryC.setAdapter(userAdapterLibrary);
        userAdapterLibrary.notifyDataSetChanged();
    }
    void LoadData() {
        lstUser = new ArrayList<>();
        lstUser.add(new User("1","người lớn đi thi","Giang ơi Radio","podcast_giangoi.png"));
        lstUser.add(new User("2","Ba câu chuyện kinh doanh","Hiếu TV","podcast_hieutv.png"));
        lstUser.add(new User("3","Biến mất trong chớp măt (Phần 1)","Hồ sơ vụ án","podcast_hosovuan.png"));
        lstUser.add(new User("4","Đừng chỉ nghĩ về lí do bắt đầu trước khi bỏ cuộc","Nguyễn Hữu Trí podcast","podcast_nguyenhuutri.png"));
        lstUser.add(new User("5","Học gì để có công việc tốt","The Present Writer","podcast_thepresentwriter.png"));
    }
}
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
import com.example.doan.adapter.UserAdapter;
import com.example.doan.adapter.UserAdapterLibrary;
import com.example.doan.users.User;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LibraryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryFragment extends Fragment {
    ArrayList<User> lstUser;
    UserAdapterLibrary userAdapterLibrary;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView rvListLibraryC;

    public LibraryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LibraryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LibraryFragment newInstance(String param1, String param2) {
        LibraryFragment fragment = new LibraryFragment();
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
        return inflater.inflate(R.layout.fragment_library, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LoadData();
        rvListLibraryC = view.findViewById(R.id.rvListLibrary);
        rvListLibraryC.setLayoutManager(new LinearLayoutManager(getContext()));
        rvListLibraryC.setHasFixedSize(true);
        UserAdapterLibrary userAdapterLibrary = new UserAdapterLibrary(lstUser);
        rvListLibraryC.setAdapter(userAdapterLibrary);
        userAdapterLibrary.notifyDataSetChanged();
    }

    void LoadData() {
        lstUser = new ArrayList<>();
        lstUser.add(new User("1","Người lớn chơi trung thu","Giang ơi Radio","podcast_giangoi.png"));
        lstUser.add(new User("2","Hành trình hiểu về bản thân","Hiếu TV","podcast_hieutv.png"));
        lstUser.add(new User("3","Biến mất trong chớp măt (Phần 1)","Hồ sơ vụ án","podcast_hosovuan.png"));
        lstUser.add(new User("4","Đừng chỉ nghĩ về lí do bắt đầu trước khi bỏ cuộc","Nguyễn Hữu Trí podcast","podcast_nguyenhuutri.png"));
        lstUser.add(new User("5","Học gì để có công việc tốt","The Present Writer","podcast_thepresentwriter.png"));
    }
}
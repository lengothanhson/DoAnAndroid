package com.example.doan.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.doan.R;
import com.example.doan.play.PlaySoundFragment;
import com.example.doan.searchtype.SearchTypeKpopFragment;
import com.example.doan.users.User;
import com.example.doan.adapter.UserAdapterSearch;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {
    ArrayList<User> lstUser;
    UserAdapterSearch userAdapterSearch;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView rvSearchListC;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
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
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LoadData();
        rvSearchListC = view.findViewById(R.id.rvSearchList);
        rvSearchListC.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        rvSearchListC.setHasFixedSize(true);
        UserAdapterSearch userAdapterSearch = new UserAdapterSearch(lstUser, new UserAdapterSearch.onitemclick() {
            @Override
            public void onItemClick(User user) {
                LoadFragment(new SearchTypeKpopFragment());
            }
        });
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rvSearchListC.setLayoutManager(gridLayoutManager);
        rvSearchListC.setAdapter(userAdapterSearch);
    userAdapterSearch.notifyDataSetChanged();
    }

    void LoadData() {
            lstUser = new ArrayList<>();
            lstUser.add(new User("1","Podcasts","","podcast_giangoi.png"));
            lstUser.add(new User("2","Dành cho bạn","","tuyentapnhachiphop.png"));
            lstUser.add(new User("3","Mới Phát Hành","","things_diablo.png"));
            lstUser.add(new User("4","Nhạc Việt","","vpopkhongthethieu.png"));
            lstUser.add(new User("5","Pop","","tophitoday.png"));
            lstUser.add(new User("6","Kpop","","tuyentapnhackpop.png"));
            lstUser.add(new User("7","Nhạc Việt","","vpopkhongthethieu.png"));
            lstUser.add(new User("8","Pop","","tophitoday.png"));

    }

    void LoadFragment (Fragment fmNew)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, fmNew);
        fragmentTransaction.commit();
    }
}
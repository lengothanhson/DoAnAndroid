package com.example.doan.searchtype;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.doan.R;
import com.example.doan.adapter.UserAdapterKpopType;
import com.example.doan.fragment.SearchFragment;
import com.example.doan.users.User;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchTypeKpopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchTypeKpopFragment extends Fragment {
    ImageButton ibBackSearchTypeC;
    RecyclerView rvKpopType1C, rvKpopType2C;
    ArrayList<User> lstUser;
    UserAdapterKpopType userAdapterKpopType;
    BottomNavigationView mnBottom;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SearchTypeKpopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchTypeKpopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchTypeKpopFragment newInstance(String param1, String param2) {
        SearchTypeKpopFragment fragment = new SearchTypeKpopFragment();
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
        return inflater.inflate(R.layout.fragment_search_type_kpop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ibBackSearchTypeC = view.findViewById(R.id.ibBackSearchType);
        rvKpopType1C = view.findViewById(R.id.rvKpopType1);
        rvKpopType2C = view.findViewById(R.id.rvKpopType2);

        LoadData1();
        userAdapterKpopType = new UserAdapterKpopType(lstUser, new UserAdapterKpopType.onitemclick() {
            @Override
            public void onItemClick(User user) {

            }
        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rvKpopType1C.setAdapter(userAdapterKpopType);
        rvKpopType1C.setLayoutManager(linearLayoutManager);

        LoadData2();
        userAdapterKpopType = new UserAdapterKpopType(lstUser, new UserAdapterKpopType.onitemclick() {
            @Override
            public void onItemClick(User user) {

            }
        });

        linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL,false);
        rvKpopType2C.setAdapter(userAdapterKpopType);
        rvKpopType2C.setLayoutManager(linearLayoutManager);

//        ibBackSearchTypeC.setOnClickListener(backSearch());
    }

//    private View.OnClickListener backSearch() {
//        return new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragment fm = new SearchFragment();
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.main_fragment, fm).commit();
//            }
//        };
//    }

    void LoadData1() {
        lstUser = new ArrayList<>();
        lstUser.add(new User("1","Cheer up","Listen to the soundtrack of the SBS Mon-Tue drama CHEER UP and the songs recommended by the cast! (SBS 월, 화 드라마 치얼업의 사운드 트랙과 배우진이 추천하는 노래를 들어보세요!)","cheerup.jpg"));
        lstUser.add(new User("2","Kpop ON!","Let's turn ON the movement! Cover: B.I","kpopon.jpg"));
        lstUser.add(new User("3","Kpop Rising","Future K-Pop hits! Cover: VICTON","kpoprising.jpg"));
        lstUser.add(new User("4","Krown","The hottest K-hip hop is here. KR OWN - KrOWN. (Cover: ASH ISLAND) (가장 핫한 한국 힙합 곡들을 만나보세요! 커버:애쉬 아일랜드)","Krown.jpg"));
        lstUser.add(new User("5","Ultra Korea 2022","Meet the lineup of ULTRA KOREA, the best music festival boasting the world's top EDM DJ. (세계 최정상 EDM DJ를 자랑하는 최고의 음악 축제 ULTRA KOREA의 라인업을 만나보세요.)","ultrakorea2022.jpg"));
    }

    void LoadData2() {
        lstUser = new ArrayList<>();
        lstUser.add(new User("1","Cheer up","Listen to the soundtrack of the SBS Mon-Tue drama CHEER UP and the songs recommended by the cast! (SBS 월, 화 드라마 치얼업의 사운드 트랙과 배우진이 추천하는 노래를 들어보세요!)","cheerup.jpg"));
        lstUser.add(new User("2","Kpop ON!","Let's turn ON the movement! Cover: B.I","kpopon.jpg"));
        lstUser.add(new User("3","Kpop Rising","Future K-Pop hits! Cover: VICTON","kpoprising.jpg"));
        lstUser.add(new User("4","Krown","The hottest K-hip hop is here. KR OWN - KrOWN. (Cover: ASH ISLAND) (가장 핫한 한국 힙합 곡들을 만나보세요! 커버:애쉬 아일랜드)","Krown.jpg"));
        lstUser.add(new User("5","Ultra Korea 2022","Meet the lineup of ULTRA KOREA, the best music festival boasting the world's top EDM DJ. (세계 최정상 EDM DJ를 자랑하는 최고의 음악 축제 ULTRA KOREA의 라인업을 만나보세요.)","ultrakorea2022.jpg"));
    }

    void LoadFragment (Fragment fmNew)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, fmNew);
        fragmentTransaction.commit();
    }
}
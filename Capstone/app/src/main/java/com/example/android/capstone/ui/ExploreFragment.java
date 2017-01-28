package com.example.android.capstone.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.capstone.model.Category;
import com.example.android.capstone.R;
import com.example.android.capstone.ui.adapter.ExploreAdapter;

import java.util.ArrayList;
import java.util.List;


public class ExploreFragment extends Fragment {

    public RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    public List<Category> categoryList= new ArrayList<>();
    public ExploreAdapter exploreAdapter;
    public ExploreFragment() {
        // Required empty public constructor
    }

   public static ExploreFragment newInstance() {
        ExploreFragment fragment = new ExploreFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_explore, container, false);
        recyclerView=(RecyclerView) view.findViewById(R.id.expRecView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        exploreAdapter= new ExploreAdapter(getActivity());
        populate();
        exploreAdapter.setCategoryList(categoryList);
        recyclerView.setAdapter(exploreAdapter);
        return view;
    }




    public void populate(){
        categoryList.add(new Category("Animals","animals"));
        categoryList.add(new Category("Textures","backgrounds"));
        categoryList.add(new Category("Architecture","buildings"));
        categoryList.add(new Category("Business","business"));
        categoryList.add(new Category("Communication","computer"));
        categoryList.add(new Category("Education","education"));
        categoryList.add(new Category("Fashion","fashion"));
        categoryList.add(new Category("Emotions","feelings"));
        categoryList.add(new Category("Food","food"));
        categoryList.add(new Category("Health","health"));
        categoryList.add(new Category("Craft","industry"));
        categoryList.add(new Category("Music","music"));
        categoryList.add(new Category("Nature","nature"));
        categoryList.add(new Category("People","people"));
        categoryList.add(new Category("Places","places"));
        categoryList.add(new Category("Religion","religion"));
        categoryList.add(new Category("Technology","science"));
        categoryList.add(new Category("Sports","sports"));
        categoryList.add(new Category("Transportation","transportation"));
        categoryList.add(new Category("Travel","travel"));

    }

}

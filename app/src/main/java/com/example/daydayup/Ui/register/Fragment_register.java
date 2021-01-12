package com.example.daydayup.Ui.register;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toolbar;

import com.example.daydayup.DayDayApplication;
import com.example.daydayup.R;
import com.example.daydayup.logic.model.reg_fraglist;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_register extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_register,container,false);

                RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        Reg_Adapter reg_adapter=new Reg_Adapter(reg_fraglist.list  );
        GridLayoutManager gridLayoutManagenew =new GridLayoutManager(DayDayApplication.getContext(),4);
        recyclerView.setLayoutManager(gridLayoutManagenew);
        recyclerView.setAdapter(reg_adapter);
        return view;
    }

}

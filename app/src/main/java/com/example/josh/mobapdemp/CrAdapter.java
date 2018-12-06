package com.example.josh.mobapdemp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CrAdapter extends RecyclerView.Adapter<CrHolder>{

    private ArrayList<CrModel> list;

    public CrAdapter(){
        list = new ArrayList<CrModel>();
    }

    public void addCr(CrModel cr){
        list.add(cr);
    }


    @NonNull
    @Override
    public CrHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.cr_list, viewGroup, false);
        CrHolder holder = new CrHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CrHolder crHolder, int i) {
       crHolder.setName(list.get(i).getCrName());
       crHolder.setLocation(list.get(i).getCrLocation());
    }

    public void clearList(){
        list.clear();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

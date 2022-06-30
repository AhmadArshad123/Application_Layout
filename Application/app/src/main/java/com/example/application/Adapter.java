package com.example.application;


import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<CardViewHolder>{
    List<CardData> dataList ;

    public Adapter( List<CardData> list)
    {
        this.dataList=list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.address_card, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        String check= dataList.get(position).status;
        if (check== "Unassigned")
        {
            holder.status.setTextColor(Color.parseColor("#FC637F"));
        }
        holder.status.setText(dataList.get(position).status);
        holder.intText.setText(dataList.get(position).intText);
        holder.name.setText(dataList.get(position).name);
        holder.date.setText(dataList.get(position).date);
        holder.srNumber.setText(dataList.get(position).srNumber);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

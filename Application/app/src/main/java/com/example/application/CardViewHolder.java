package com.example.application;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardViewHolder extends RecyclerView.ViewHolder{

    TextView srNumber;
    TextView date;
    TextView name;
    TextView intText;
    TextView status;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        srNumber=(TextView) itemView.findViewById(R.id.tv_sr_no);
        date=(TextView) itemView.findViewById(R.id.tv_date_card);
        name=(TextView) itemView.findViewById(R.id.tv_card_name);
        intText=(TextView) itemView.findViewById(R.id.tv_int_text);
        status=(TextView) itemView.findViewById(R.id.tv_status_card);
    }
}

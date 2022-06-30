package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;
    TextView tvOwner;
    TextView tvKeeper;
    TextView tvAnimalRegistration;
    TextView tvHerd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOwner = (TextView) findViewById(R.id.tv_owner_select) ;
       // txt.setPaintFlags(txt.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tvOwner.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                tvKeeper.setTextColor(Color.parseColor("#B0B0B0"));
                tvKeeper.setPaintFlags(0);

                tvAnimalRegistration.setTextColor(Color.parseColor("#B0B0B0"));
                tvAnimalRegistration.setPaintFlags(0);

                tvHerd.setTextColor(Color.parseColor("#B0B0B0"));
                tvHerd.setPaintFlags(0);

                tvOwner.setTextColor(Color.parseColor("#2D6C98"));
                tvOwner.setPaintFlags(tvOwner.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
                List<CardData> list= getDataOwner();
                recyclerView =(RecyclerView) findViewById(R.id.rv_card_container);
                adapter=new Adapter(list);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
            }
        });


        tvKeeper =(TextView) findViewById(R.id.tv_keeper_select) ;
        tvKeeper.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                tvOwner.setTextColor(Color.parseColor("#B0B0B0"));
                tvOwner.setPaintFlags(0);

                tvAnimalRegistration.setTextColor(Color.parseColor("#B0B0B0"));
                tvAnimalRegistration.setPaintFlags(0);

                tvHerd.setTextColor(Color.parseColor("#B0B0B0"));
                tvHerd.setPaintFlags(0);

                tvKeeper.setTextColor(Color.parseColor("#2D6C98"));
                tvKeeper.setPaintFlags(tvKeeper.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

                List<CardData> list= getDataKeeper();
                recyclerView =(RecyclerView) findViewById(R.id.rv_card_container);
                adapter=new Adapter(list);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
            }
        });

        tvAnimalRegistration =(TextView) findViewById(R.id.tv_animal_registration_select);
        tvAnimalRegistration.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                tvHerd.setTextColor(Color.parseColor("#B0B0B0"));
                tvHerd.setPaintFlags(0);

                tvOwner.setTextColor(Color.parseColor("#B0B0B0"));
                tvOwner.setPaintFlags(0);

                tvKeeper.setTextColor(Color.parseColor("#B0B0B0"));
                tvKeeper.setPaintFlags(0);

                tvAnimalRegistration.setTextColor(Color.parseColor("#2D6C98"));
                tvAnimalRegistration.setPaintFlags(tvAnimalRegistration.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

                List<CardData> list= getDataAnimalRegistration();
                recyclerView =(RecyclerView) findViewById(R.id.rv_card_container);
                adapter=new Adapter(list);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
            }
        });

        tvHerd =(TextView) findViewById(R.id.tv_herd_select);
        tvHerd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                tvOwner.setTextColor(Color.parseColor("#B0B0B0"));
                tvOwner.setPaintFlags(0);

                tvKeeper.setTextColor(Color.parseColor("#B0B0B0"));
                tvKeeper.setPaintFlags(0);

                tvAnimalRegistration.setTextColor(Color.parseColor("#B0B0B0"));
                tvAnimalRegistration.setPaintFlags(0);

                tvHerd.setTextColor(Color.parseColor("#2D6C98"));
                tvHerd.setPaintFlags(tvHerd.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

                List<CardData> list= getDataHerd();
                recyclerView =(RecyclerView) findViewById(R.id.rv_card_container);
                adapter=new Adapter(list);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);
            }
        });
        setAppBar();


    }

    public List<CardData> getDataHerd()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("1111", "Assigned",
                "10-10-2010", "00010", "Herd Ipsum"));

        list.add(new CardData("1111", "Assigned",
                "10-10-2010", "00010", "Herd Ipsum"));

        return list;
    }

    public List<CardData> getDataAnimalRegistration()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("9999", "Assigned",
                "01-02-2020", "00034", "Lorem Ipsum"));

        list.add(new CardData("9999", "Assigned",
                "01-02-2020", "00034", "Lorem Ipsum"));

        return list;
    }


    public List<CardData> getDataKeeper()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("0134", "Assigned",
                "01-02-2022", "87393", "Lorem Ipsum"));


        return list;
    }

    public List<CardData> getDataOwner()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        return list;
    }

    public void setAppBar()
    {
        AppBarLayout myAppBar =(AppBarLayout) findViewById(R.id.app_bar);
        TextView tvKeepers= (TextView) findViewById(R.id.tv_keepers);

        TextView tvCode= (TextView) findViewById(R.id.tv_code);

        TextView tvNRN= (TextView) findViewById(R.id.tv_NRN);
        TextView tvAnimals= (TextView) findViewById(R.id.tv_animal_count);
        TextView tvAddress= (TextView) findViewById(R.id.tv_address);
        TextView tvPhoneNumber= (TextView) findViewById(R.id.tv_phone_number);
        ImageView ivLocationIcon = (ImageView) findViewById(R.id.iv_pin);
        ImageView ivPhoneIcon = (ImageView) findViewById(R.id.iv_phone);

        RelativeLayout relativeLayout= (RelativeLayout) findViewById(R.id.rl_first_row);
        LinearLayout linearLayout= (LinearLayout) findViewById(R.id.ll_card_first_row);

        myAppBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                //float percentage = (float) Math.abs(verticalOffset) / appBarLayout.getTotalScrollRange();

                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }

                if (scrollRange + verticalOffset == 0) {
                    //  Collapsed
                    //Hide your TextView here
                    isShow=true;
                    relativeLayout.setTranslationY(55);
                    linearLayout.setTranslationY(43);
                    tvCode.setVisibility(View.GONE);
                    tvKeepers.setVisibility(View.GONE);
                    tvNRN.setVisibility(View.GONE);
                    tvAnimals.setVisibility(View.GONE);
                    tvAddress.setVisibility(View.GONE);
                    tvPhoneNumber.setVisibility(View.GONE);
                    ivLocationIcon.setVisibility(View.GONE);
                    ivPhoneIcon.setVisibility(View.GONE);
                } else if(isShow) {
                    //Expanded
                    //Show your TextView here
                    relativeLayout.setTranslationY(0);
                    linearLayout.setTranslationY(0);
                    isShow=false;
                    tvCode.setVisibility(View.VISIBLE);
                    tvKeepers.setVisibility(View.VISIBLE);
                    tvNRN.setVisibility(View.VISIBLE);
                    tvAnimals.setVisibility(View.VISIBLE);
                    tvAddress.setVisibility(View.VISIBLE);
                    tvPhoneNumber.setVisibility(View.VISIBLE);
                    ivLocationIcon.setVisibility(View.VISIBLE);
                    ivPhoneIcon.setVisibility(View.VISIBLE);

                }


            }
        });
    }
}
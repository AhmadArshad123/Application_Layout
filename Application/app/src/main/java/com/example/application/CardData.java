package com.example.application;

public class CardData {

    String srNumber;
    String date;
    String name;
    String intText;
    String status;

    CardData(String srNumber,
             String status,
             String date,
             String intText, String name)
    {
        this.date=date;
        this.intText=intText;
        this.name=name;
        this.status=status;
        this.srNumber=srNumber;
    }
}

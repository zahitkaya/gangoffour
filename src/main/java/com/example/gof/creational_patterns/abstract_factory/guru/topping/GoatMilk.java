package com.example.gof.creational_patterns.abstract_factory.guru.topping;

public class GoatMilk implements IMilk{
    public GoatMilk() {
        prepareMilk();
    }

    @Override
    public void prepareMilk() {
        System.out.println("Keçi sütünüz hazırlanıyor...");
    }
}

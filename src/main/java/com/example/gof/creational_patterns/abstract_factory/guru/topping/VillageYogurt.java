package com.example.gof.creational_patterns.abstract_factory.guru.topping;

public class VillageYogurt implements IYogurt{
    public VillageYogurt() {
        prepareYogurt();
    }

    @Override
    public void prepareYogurt() {
        System.out.println("Köy yoğurdunuz hazırlanıyor...");
    }
}

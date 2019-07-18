package com.expample.di;

import com.expample.di.application.AdvertiseService;

public class Application {
    public static void main(String[] args) {
        final AdvertiseService advertiseService = new AdvertiseService();
        advertiseService.advertise(1L, "販促メッセージ");
    }
}

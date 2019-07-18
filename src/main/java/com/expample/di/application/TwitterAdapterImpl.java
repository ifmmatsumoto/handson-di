package com.expample.di.application;

public class TwitterAdapterImpl {
    public void post(final Tweet tweet) {
        // Tweetしてるフリ
        System.out.println("tweet: {" + tweet + "}");
    }
}

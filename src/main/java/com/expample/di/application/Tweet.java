package com.expample.di.application;

public class Tweet {
    private final String message;

    public Tweet(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "message: " + message;
    }
}

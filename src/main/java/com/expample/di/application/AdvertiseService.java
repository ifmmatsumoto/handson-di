package com.expample.di.application;

public class AdvertiseService {
    public void advertise(final long productId, final String promotionalMessage) {
        final ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        final Product product = productRepository.findById(productId);

        final String postMessage = promotionalMessage + ", " + product.getProductName();
        final Tweet tweet = new Tweet(postMessage);
        final TwitterAdapterImpl twitterAdapter = new TwitterAdapterImpl();
        twitterAdapter.post(tweet);
    }
}

package com.example.yanolja.repository.review;

import com.example.yanolja.domain.review.Review;
import com.example.yanolja.domain.user.User;

import java.util.*;

public class MemoryReviewRepository implements ReviewRepository{
    private static long sequence = 0L;
    private static final Map<Long, Review> store = new HashMap<>();
    @Override
    public Review save(Review review) {
        review.setId(++sequence);
        return store.put(review.getId(), review);
    }

    @Override
    public Optional<Review> findbyId(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Review> findbyRoomId(long roomId) {
        List<Review> allReviewList = new ArrayList<>(store.values());
        List<Review> reviewList = new ArrayList<>();
        for (Review review : allReviewList) {
            if (review.getRoomId() == roomId) {
                reviewList.add(review);
            }
        }
        return reviewList;
    }
}

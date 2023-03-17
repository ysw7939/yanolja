package com.example.yanolja.Service.review;

import com.example.yanolja.domain.review.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review save(Review review);
    Optional<Review> findbyId(long id);
    List<Review> findbyRoomId(long roomId);
}

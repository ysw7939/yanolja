package com.example.yanolja.Service.review;

import com.example.yanolja.domain.review.Review;
import com.example.yanolja.repository.review.ReviewRepository;

import java.util.List;
import java.util.Optional;

public class ReviewServiceImpl implements ReviewService{
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Optional<Review> findbyId(long id) {
        Optional<Review> reviewOptional = reviewRepository.findbyId(id);
        if (reviewOptional.isPresent()) {
            return reviewOptional;
        }
        return Optional.empty();
    }

    @Override
    public List<Review> findbyRoomId(long roomId) {
        return reviewRepository.findbyRoomId(roomId);
    }
}

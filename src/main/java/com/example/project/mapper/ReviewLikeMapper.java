package com.example.project.mapper;

import com.example.project.vo.ReviewLikeVO;

public interface ReviewLikeMapper {
    int hasLiked(ReviewLikeVO like);        // hasLiked
    int insertReviewLike(ReviewLikeVO like); // insertReviewLike
    int deleteReviewLike(ReviewLikeVO like); // deleteReviewLike
    int countLikes(int rvNum);                // countLikes
}

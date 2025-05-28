package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.mapper.ReviewLikeMapper;
import com.example.project.mapper.ReviewMapper;
import com.example.project.vo.ReviewLikeVO;
import com.example.project.vo.ReviewVO;

@Service
public class ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	@Autowired
	private ReviewLikeMapper reviewLikeMapper;
	
  
  public List<ReviewVO> selectReviews(ReviewVO review) {
      return reviewMapper.selectReviews(review);
  }
 
  public ReviewVO selectReview(int rvNum) {
  		reviewMapper.updateViewCount(rvNum);
      return reviewMapper.selectReview(rvNum);
  }
  
  public int insertReview(ReviewVO review) {
      return reviewMapper.insertReview(review);
  }
  
  public int updateReview(ReviewVO review) {
      return reviewMapper.updateReview(review);
  }
  
  public int deleteReview(int rvNum) {
      return reviewMapper.deleteReview(rvNum);
  }

  
  
  public int updateViewCount(int rvNum) {
      return reviewMapper.updateViewCount(rvNum);
  }

  
  public int countLikes(int rvNum) {
      return reviewLikeMapper.countLikes(rvNum);
  }

  
  public int hasLiked(ReviewLikeVO reviewLikeVO) {
      return reviewLikeMapper.hasLiked(reviewLikeVO);
  }

}

package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.ReviewService;
import com.example.project.vo.ReviewLikeVO;
import com.example.project.vo.ReviewVO;

@RestController
public class ReviewController {
	@Autowired
  private ReviewService reviewService;

  // 리뷰 목록 조회 (검색 포함)
  @GetMapping("/reviews")
  public List<ReviewVO> getReviews(ReviewVO review) {
      return reviewService.selectReviews(review);
  }

  // 단일 리뷰 조회 (조회수 증가 포함)
  @GetMapping("/reviews/{rvNum}")
  public ReviewVO getReview(@PathVariable("rvNum") int rvNum) {
      return reviewService.selectReview(rvNum);
  }

  // 리뷰 등록
  @PostMapping("/reviews")
  public int addReview(@RequestBody ReviewVO review) {
      return reviewService.insertReview(review);
  }

  // 리뷰 수정
  @PutMapping("/reviews")
  public int updateReview(@RequestBody ReviewVO review) {
      return reviewService.updateReview(review);
  }

  // 리뷰 삭제
  @DeleteMapping("/reviews/{rvNum}")
  public int deleteReview(@PathVariable("rvNum")  int rvNum) {
      return reviewService.deleteReview(rvNum);
  }
  
  // 좋아요 수 조회
  @GetMapping("/reviews/{rvNum}/likes")
  public int getLikesCount(@PathVariable int rvNum) {
      return reviewService.countLikes(rvNum);
  }

  // 특정 유저가 특정 리뷰 좋아요 여부 확인
  @PostMapping("/reviews/likes/check")
  public int hasLiked(@RequestBody ReviewLikeVO reviewLikeVO) {
      return reviewService.hasLiked(reviewLikeVO);
  }
  
  
}

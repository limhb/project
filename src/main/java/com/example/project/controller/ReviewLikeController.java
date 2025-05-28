package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.ReviewLikeService;
import com.example.project.vo.ReviewLikeVO;

@RestController
public class ReviewLikeController {

  @Autowired
  private ReviewLikeService reviewLikeService;
  @PostMapping("/like")
  public int addLike(@RequestBody ReviewLikeVO reviewLikeVO) {
      return reviewLikeService.addLike(reviewLikeVO);
  }
  @DeleteMapping("/like")
  public int removeLike(@RequestBody ReviewLikeVO reviewLikeVO) {
      return reviewLikeService.removeLike(reviewLikeVO);
  }
}

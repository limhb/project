package com.example.project.mapper;

import java.util.List;

import com.example.project.vo.ReviewVO;

public interface ReviewMapper {
  List<ReviewVO> selectReviews(ReviewVO review);   // 검색 및 목록 조회 (조건 포함)
  ReviewVO selectReview(int rvNum);               // 단일 리뷰 조회
  int insertReview(ReviewVO review);              // 리뷰 등록
  int updateReview(ReviewVO review);              // 리뷰 수정
  int deleteReview(int rvNum);                     // 리뷰 삭제
  int updateViewCount(int rvNum); 
  int increaseLikeCnt(int rvNum);
  int decreaseLikeCnt(int rvNum);
}

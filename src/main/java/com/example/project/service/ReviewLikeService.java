package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.mapper.ReviewLikeMapper;
import com.example.project.mapper.ReviewMapper;
import com.example.project.vo.ReviewLikeVO;

@Service
public class ReviewLikeService {
	@Autowired
	private ReviewLikeMapper reviewLikeMapper;
	@Autowired
	private ReviewMapper reviewMapper;

	@Transactional
	public int addLike(ReviewLikeVO like) {
		reviewMapper.increaseLikeCnt(like.getRvNum());
		return reviewLikeMapper.insertReviewLike(like);
	}
	
	@Transactional
	public int removeLike(ReviewLikeVO like) {
		reviewMapper.decreaseLikeCnt(like.getRvNum());
		return reviewLikeMapper.deleteReviewLike(like);
	}
}

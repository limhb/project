package com.example.project.mapper;

import java.util.List;

import com.example.project.vo.ReplyVO;

public interface ReplyMapper {
  List<ReplyVO> selectCommentsByBoardNum(ReplyVO comment);

  // 댓글 단건 조회
  ReplyVO selectComment(int bcNum);

  // 댓글 등록
  int insertComment(ReplyVO comment);

  // 댓글 수정
  int updateComment(ReplyVO comment);

  // 댓글 삭제
  int deleteComment(int bcNum);
  
  int deleteCommentsByBoardId(int biNum);
}

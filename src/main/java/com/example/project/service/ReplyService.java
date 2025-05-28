package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.mapper.ReplyMapper;
import com.example.project.vo.ReplyVO;

@Service
public class ReplyService {
	@Autowired
	private ReplyMapper replyMapper;
  
  public List<ReplyVO> getReplyList(ReplyVO reply) {
      return replyMapper.selectCommentsByBoardNum(reply);
  }

  
  public ReplyVO getReply(int bcNum) {
      return replyMapper.selectComment(bcNum);
  }

  
  public int insertReply(ReplyVO reply) {
      return replyMapper.insertComment(reply);
  }

  
  public int updateReply(ReplyVO reply) {
      return replyMapper.updateComment(reply);
  }

  
  public int deleteReply(int bcNum) {
      return replyMapper.deleteComment(bcNum);
  }

}

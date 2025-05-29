package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.ReplyService;
import com.example.project.vo.ReplyVO;

@RestController
public class ReplyController {
	@Autowired
  private ReplyService replyService;

  // 댓글 목록 조회 (게시글 번호 기준)
  @GetMapping("/reply")
  public List<ReplyVO> getReplyList(@RequestParam("biNum") int biNum) {
      ReplyVO vo = new ReplyVO();
      vo.setBiNum(biNum);
      return replyService.getReplyList(vo);
  }

  // 댓글 단건 조회
  @GetMapping("/reply/{bcNum}")
  public ReplyVO getReply(@PathVariable("bcNum") int bcNum) {
      return replyService.getReply(bcNum);
  }

  // 댓글 등록
  @PostMapping("/reply/insert")
  public int insertReply(@RequestBody ReplyVO reply) {
      return replyService.insertReply(reply);
  }

  // 댓글 수정
  @PostMapping("/reply/update")
  public int updateReply(@RequestBody ReplyVO reply) {
      return replyService.updateReply(reply);
  }

  // 댓글 삭제
  @DeleteMapping("/reply/delete/{bcNum}")
  public int deleteReply(@PathVariable("bcNum") int bcNum) {
      return replyService.deleteReply(bcNum);
  }
}

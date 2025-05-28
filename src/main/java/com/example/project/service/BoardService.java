package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.mapper.BoardMapper;
import com.example.project.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public List<BoardVO> getBoardList(BoardVO board){
		return boardMapper.selectBoards(board);
	}
	
	public BoardVO getBoard(int biNum) {
		boardMapper.updateViewCount(biNum);
		return boardMapper.selectBoard(biNum);
	}
	
	public BoardVO getBoardForUpdate(int biNum) {
		return boardMapper.selectBoard(biNum);
	}
	
	public int insertBoard(BoardVO board) {
		return boardMapper.insertBoard(board);
	}
	
	public int updateBoard(BoardVO board) {
		return boardMapper.updateBoard(board);
	}
	
	public int deleteBoard(int biNum) {
		return boardMapper.deleteBoard(biNum);
	}
}

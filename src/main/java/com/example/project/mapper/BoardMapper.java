package com.example.project.mapper;

import java.util.List;

import com.example.project.vo.BoardVO;

public interface BoardMapper {
  List<BoardVO> selectBoards(BoardVO board);
  BoardVO selectBoard(int biNum);
  int insertBoard(BoardVO board);
  int updateBoard(BoardVO board);
  int deleteBoard(int biNum);
  int updateViewCount(int biNum);
}

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

import com.example.project.service.BoardService;
import com.example.project.vo.BoardVO;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/boards")
	public List<BoardVO> getBoards(BoardVO board) {
		return boardService.getBoardList(board);
	}

	@GetMapping("/boards/{biNum}")
	public BoardVO getBoard(@PathVariable("biNum") int biNum, HttpServletRequest request) {
		if ("true".equals(request.getHeader("x-update-board"))) {
			return boardService.getBoardForUpdate(biNum);
		}
		return boardService.getBoard(biNum);
	}

	@PostMapping("/boards")
	public int insertBoard(@RequestBody BoardVO board) {
		return boardService.insertBoard(board);
	}

	@PutMapping("/boards")
	public int updateBoard(@RequestBody BoardVO board) {
		return boardService.updateBoard(board);
	}

	@DeleteMapping("/boards/{biNum}")
	public int deleteBoard(@PathVariable("biNum") int biNum) {
		return boardService.deleteBoard(biNum);
	}
}

package com.spring.biz;

import java.util.List;

import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardCommentVO;
import com.spring.biz.vo.BoardVO;

public interface SampleService {
	
	List<BoardCategoryVO> categoryList();
	
	BoardCategoryVO categoryName (int categoryNum);
	
	List<BoardVO> boardList(BoardVO boardVO);
	
	int insertBoard(BoardVO boardVO);
	
	BoardVO detail(BoardVO boardVO);
	
	int deleteBoard(BoardVO boardVO);
	
	int readCnt(int boardNum);
	
	int updateBoard(BoardVO boardVO);
	
	int insertComment(BoardCommentVO boardCommentVO);
	
	List<BoardCommentVO> selectComment(int boardNum);
	
	int commentCnt(int boardNum);
	
	
	
}





















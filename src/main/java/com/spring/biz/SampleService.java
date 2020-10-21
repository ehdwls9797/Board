package com.spring.biz;

import java.util.List;

import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardVO;

public interface SampleService {
	
	List<BoardCategoryVO> categoryList();
	
	BoardCategoryVO categoryName (int categoryNum);
	
	List<BoardVO> boardList(int categoryNum);
	
	int insertBoard(BoardVO boardVO);
	
	BoardVO detail(BoardVO boardVO);
	
	int deleteBoard(BoardVO boardVO);
	
	int readCnt(int boardNum);
	
}





















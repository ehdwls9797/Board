package com.spring.biz;

import java.util.List;

import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardCommentVO;
import com.spring.biz.vo.BoardVO;

public interface SampleService {
	
	//카테고리 리스트
	List<BoardCategoryVO> categoryList();
	
	//보드게시판에서 카테고리 이름빼오기
	BoardCategoryVO categoryName (int categoryNum);
	
	//게시판 리스트 뽑아오기1
	List<BoardVO> boardList(BoardVO boardVO);
	
	//글쓰기
	int insertBoard(BoardVO boardVO);
	
	//상세보기
	BoardVO detail(BoardVO boardVO);
	
	//글삭제
	int deleteBoard(BoardVO boardVO);
	
	//조회수
	int readCnt(int boardNum);
	
	//글수정
	int updateBoard(BoardVO boardVO);
	
	//댓글입력
	int insertComment(BoardCommentVO boardCommentVO);
	
	//댓글 리스트 뽑아오기
	List<BoardCommentVO> selectComment(int boardNum);
	
	//댓글 총 갯수 출력
	int commentCnt(int boardNum);
	
	int insertBoard1(BoardVO boardVO);
	
}





















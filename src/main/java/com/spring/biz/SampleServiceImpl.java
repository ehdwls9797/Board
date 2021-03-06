package com.spring.biz;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardCommentVO;
import com.spring.biz.vo.BoardVO;

@Service("sampleService") 
public class SampleServiceImpl implements SampleService{
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardCategoryVO> categoryList() {
		return sqlSession.selectList("categoryList");
	}
	
	@Override
	public List<BoardVO> boardList(BoardVO boardVO) {
		return sqlSession.selectList("boardList", boardVO);
	}

	@Override
	public BoardCategoryVO categoryName(int categoryNum) {
		return sqlSession.selectOne("categoryName", categoryNum);
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		return sqlSession.insert("insertBoard", boardVO);
	}

	@Override
	public BoardVO detail(BoardVO boardVO) {
		return sqlSession.selectOne("detail", boardVO);
	}

	@Override
	public int deleteBoard(BoardVO boardVO) {
		return sqlSession.delete("deleteBoard", boardVO);
	}

	@Override
	public int readCnt(int boardNum) {
		return sqlSession.update("readCnt", boardNum);
	}

	@Override
	public int updateBoard(BoardVO boardVO) {
		return sqlSession.update("updateBoard", boardVO);
	}

	@Override
	public int insertComment(BoardCommentVO boardCommentVO) {
		return sqlSession.insert("insertComment1", boardCommentVO);
	}

	@Override
	public List<BoardCommentVO> selectComment(int boardNum) {
		return sqlSession.selectList("selectComment", boardNum);
	}

	@Override
	public int commentCnt(int boardNum) {
		return sqlSession.update("commentCnt", boardNum);
	}

	@Override
	public int insertBoard1(BoardVO boardVO) {
		return sqlSession.insert("insertBoard1", boardVO);
	}

	@Override
	public int getBoardListCnt(int categoryNum) {
		return sqlSession.selectOne("getBoardListCnt", categoryNum);
	}

	
	
}













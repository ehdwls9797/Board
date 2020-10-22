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
	public List<BoardVO> boardList(int categoryNum) {
		return sqlSession.selectList("boardList", categoryNum);
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
	public int insertComment1(BoardCommentVO boardCommentVO) {
		return sqlSession.insert("insertComment1", boardCommentVO);
	}

	@Override
	public List<BoardCommentVO> selectComment(int boardNum) {
		return sqlSession.selectList("selectComment", boardNum);
	}

	
	
}













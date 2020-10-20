package com.spring.biz;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardVO;

@Service("sampleService") 
public class SampleServiceImpl implements SampleService{
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardCategoryVO> categoryList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("categoryList");
	}
	
	@Override
	public List<BoardVO> boardList(int categoryNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardList", categoryNum);
	}

	@Override
	public BoardCategoryVO categoryName(int categoryNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("categoryName", categoryNum);
	}

	
	
}













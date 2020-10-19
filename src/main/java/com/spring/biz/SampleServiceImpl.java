package com.spring.biz;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.vo.BoardVO;

@Service("sampleService") 
public class SampleServiceImpl implements SampleService{
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardVO> boardList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardList");
	}
	
	
}













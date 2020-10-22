package com.spring.view;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.biz.SampleService;
import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardVO;

@Controller
public class SampleController {
	@Resource(name = "sampleService")
	SampleService sampleService;
	
	//시작 카테고리 목록 띄우기
	@RequestMapping(value = "/sample.do")
	public String sample(Model model) {
		
		List<BoardCategoryVO> category = sampleService.categoryList();
		model.addAttribute("category", category);
		
		return "sample/sample"; 
	}
	
	//게시판 리스트 + 카테고리 명 + 카테고리 번호 가지고가기
	@RequestMapping(value = "/board.do")
	public String board(Model model, int categoryNum) {
		
		List<BoardVO> list = sampleService.boardList(categoryNum);
		BoardCategoryVO vo = sampleService.categoryName(categoryNum);
		model.addAttribute("board", list);
		model.addAttribute("categoryName", vo);
		model.addAttribute("category", categoryNum);
		
		return "sample/board"; 
	}
	
	// 글쓰기 폼 화면
	@RequestMapping(value = "/writeForm.do")
	public String writeForm(Model model, int categoryNum) {
		
		model.addAttribute("category", categoryNum);
		
		return "sample/writeForm"; 
	}
	
	//실제 글쓰기 구현
	@RequestMapping(value = "/write.do")
	public String write(Model model, BoardVO boardVO) {
		
		sampleService.insertBoard(boardVO);
		
		return "redirect:board.do?categoryNum="+boardVO.getCategoryNum(); 
	}
	
	// 상세보기
	@RequestMapping(value = "/boardDetail.do")
	public String boardDetail(Model model, int categoryNum, BoardVO boardVO) {
		
		BoardVO vo = sampleService.detail(boardVO);
		model.addAttribute("category", categoryNum);
		model.addAttribute("detail", vo);
		sampleService.readCnt(vo.getBoardNum());
		
		return "sample/boardDetail"; 
	}
	
	// 글삭제
	@RequestMapping(value = "/delete.do")
	public String delete(BoardVO boardVO) {
		
		sampleService.deleteBoard(boardVO);
		
		return "redirect:board.do?categoryNum="+boardVO.getCategoryNum();
	}
	
	// 수정화면
	@RequestMapping(value = "/updateForm.do")
	public String updateForm(Model model, BoardVO boardVO) {
		
		BoardVO vo = sampleService.detail(boardVO);
		model.addAttribute("boardNum", boardVO.getBoardNum());
		model.addAttribute("categoryNum", boardVO.getCategoryNum());
		model.addAttribute("update", vo);
		
		return "sample/updateForm";
	}
	
	// 수정완료
	@RequestMapping(value = "/update.do")
	public String update(Model model, BoardVO boardVO) {
		
		sampleService.updateBoard(boardVO);
		
		return "redirect:board.do?categoryNum="+boardVO.getCategoryNum();
	}
	
}











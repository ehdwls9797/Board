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
	
	@RequestMapping(value = "/sample.do")
	public String sample(Model model) {
		
		List<BoardCategoryVO> category = sampleService.categoryList();
		model.addAttribute("category", category);
		
		return "sample/sample"; 
	}
	
	@RequestMapping(value = "/board.do")
	public String board(Model model, int categoryNum) {
		
		List<BoardVO> list = sampleService.boardList(categoryNum);
		BoardCategoryVO vo = sampleService.categoryName(categoryNum);
		model.addAttribute("board", list);
		model.addAttribute("categoryName", vo);
		model.addAttribute("category", categoryNum);
		
		return "sample/board"; 
	}
	
	@RequestMapping(value = "/writeForm.do")
	public String writeForm(Model model, int categoryNum) {
		
		model.addAttribute("category", categoryNum);
		
		return "sample/writeForm"; 
	}
	
	@RequestMapping(value = "/write.do")
	public String write(Model model, BoardVO boardVO) {
		
		sampleService.insertBoard(boardVO);
		
		return "redirect:board.do?categoryNum="+boardVO.getCategoryNum(); 
	}
	
}











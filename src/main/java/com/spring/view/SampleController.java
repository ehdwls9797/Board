package com.spring.view;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.biz.SampleService;
import com.spring.biz.vo.BoardVO;

@Controller
public class SampleController {
	@Resource(name = "sampleService")
	SampleService sampleService;
	
	@RequestMapping(value = "/sample.do")
	public String sample() {
		return "sample/sample"; 
	}
	
	@RequestMapping(value = "/board.do")
	public String board(Model model) {
		
		List<BoardVO> list = sampleService.boardList();
		
		model.addAttribute("board", list);
		
		return "sample/board"; 
	}
	
}











package com.spring.view;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.biz.SampleService;

@Controller
public class SampleController {
	@Resource(name = "sampleService")
	SampleService sampleService;
	
	@RequestMapping(value = "/sample.do")
	public String sample() {
		return "sample/sample"; 
	}
	
	@RequestMapping(value = "/board.do")
	public String board() {
		return "sample/board"; 
	}
	
}











package com.spring.view;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.biz.SampleService;
import com.spring.biz.vo.BoardCategoryVO;
import com.spring.biz.vo.BoardCommentVO;
import com.spring.biz.vo.BoardVO;
import com.spring.biz.vo.Pagination;

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
	public String board(Model model, BoardVO boardVO, @RequestParam(required = false, defaultValue = "1") int page
			, @RequestParam(required = false, defaultValue = "1") int range) 
	
	{
		//게시판 이름
		BoardCategoryVO vo = sampleService.categoryName(boardVO.getCategoryNum());
		model.addAttribute("categoryName", vo);
		//어떤 게시판인지
		model.addAttribute("category", boardVO.getCategoryNum());
		//댓글수
		sampleService.commentCnt(boardVO.getBoardNum());
		
		//전체 게시글 개수
		int listCnt = sampleService.getBoardListCnt(boardVO.getCategoryNum());
		
		boardVO.pageInfo(page, range, listCnt);
		
		List<BoardVO> list = sampleService.boardList(boardVO);
		model.addAttribute("board", list);
		
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
	public String boardDetail(Model model, int categoryNum, BoardVO boardVO, int boardNum) {
		
		BoardVO vo = sampleService.detail(boardVO);
		model.addAttribute("category", categoryNum);
		model.addAttribute("detail", vo);
		sampleService.readCnt(vo.getBoardNum());
		List<BoardCommentVO> list = sampleService.selectComment(boardNum);
		model.addAttribute("commentList", list);
		
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
	
	// 댓글작성
	@RequestMapping(value = "/insertComment.do")
	public String insertComment(Model model, BoardCommentVO boardCommentVO, BoardVO boardVO, RedirectAttributes re) {
		
		sampleService.insertComment(boardCommentVO);
		re.addAttribute("categoryNum", boardVO.getCategoryNum());
		re.addAttribute("boardNum", boardVO.getBoardNum());
		sampleService.commentCnt(boardVO.getBoardNum());
		
		return "redirect:boardDetail.do";
	}
	
	// 댓글작성
	@RequestMapping(value = "/replyForm.do")
	public String replyForm(BoardVO boardVO, Model model) {

		model.addAttribute("categoryNum", boardVO.getCategoryNum());
		model.addAttribute("boardNum", boardVO.getBoardNum());
		
		return "sample/reply";
	}
	
	// 댓글작성
	@RequestMapping(value = "/reply.do")
	public String reply(BoardVO boardVO, Model model) {

		System.out.println(boardVO);
		sampleService.insertBoard1(boardVO);
		
		return "redirect:board.do?categoryNum="+boardVO.getCategoryNum();
	}
	
	
}











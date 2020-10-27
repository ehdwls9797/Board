package com.spring.biz.vo;


public class BoardVO {

//	    BOARD_NUM NUMBER PRIMARY KEY,
//	    BOARD_TITLE VARCHAR2(50),
//	    BOARD_CONTENT VARCHAR2(500),
//	    BOARD_WRITER VARCHAR2(50),
//	    BOARD_CREATE_DATE DATE DEFAULT SYSDATE,
//	    BOARD_READ_CNT NUMBER DEFAULT 0,
//	    CATEGORY_NUM NUMBER
	
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String createDate;
	private int readCnt;
	private int categoryNum;
	private int commentCnt;
	private int boardGroup;
	private int boardOrder;
	
	private String searchKeyword;
	private String searchValue;
	
//	/* private int totalCount = ; */
//	 
//	private int listCount = 10;
//	 
//	private int totalPage = totalCount / listCount;

	
	
	public int getBoardGroup() {
		return boardGroup;
	}
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", createDate=" + createDate + ", readCnt=" + readCnt
				+ ", categoryNum=" + categoryNum + ", commentCnt=" + commentCnt + ", boardGroup=" + boardGroup
				+ ", boardOrder=" + boardOrder + ", searchKeyword=" + searchKeyword + ", searchValue=" + searchValue
				+ "]";
	}
	public int getBoardOrder() {
		return boardOrder;
	}
	public void setBoardOrder(int boardOrder) {
		this.boardOrder = boardOrder;
	}
	public void setBoardGroup(int boardGroup) {
		this.boardGroup = boardGroup;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	
	
}


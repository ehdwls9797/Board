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
	
	@Override
	public String toString() {
		return "Board [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", createDate=" + createDate + ", readCnt=" + readCnt
				+ ", categoryNum=" + categoryNum + "]";
	}
	
}


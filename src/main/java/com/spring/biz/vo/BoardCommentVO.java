package com.spring.biz.vo;

public class BoardCommentVO {

//    COMMENT_NUM            NUMBER           NULL, 
//    BOARD_NUM              NUMBER           NULL, 
//    COMMENT_CONTENT        VARCHAR2(500)    NULL, 
//    COMMENT_CREATE_DATE    DATE             DEFAULT SYSDATE NULL, 
//    COMMENT_WRITER         VARCHAR2(50)     NULL, 
//    COMMENT_PRICE          NUMBER           DEFAULT 1 NULL,
	
	private int commentNum;
	private int boardNum;
	private String commentContent;
	private String commentCreateDate;
	private String commentWriter;
	private String commentPrice;
	
	// 카테고리 2번일때 써야함
	private String commentTitle;

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentCreateDate() {
		return commentCreateDate;
	}

	public void setCommentCreateDate(String commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public String getCommentPrice() {
		return commentPrice;
	}

	public void setCommentPrice(String commentPrice) {
		this.commentPrice = commentPrice;
	}

	public String getCommentTitle() {
		return commentTitle;
	}

	public void setCommentTitle(String commentTitle) {
		this.commentTitle = commentTitle;
	}

	@Override
	public String toString() {
		return "BoardCommentVO [commentNum=" + commentNum + ", boardNum=" + boardNum + ", commentContent="
				+ commentContent + ", commentCreateDate=" + commentCreateDate + ", commentWriter=" + commentWriter
				+ ", commentPrice=" + commentPrice + ", commentTitle=" + commentTitle + "]";
	}
	
	
}











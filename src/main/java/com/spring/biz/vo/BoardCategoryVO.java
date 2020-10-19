package com.spring.biz.vo;

public class BoardCategoryVO {
//	  CATEGORY_NUM NUMBER PRIMARY KEY,
//    CATEGORY_NAME VARCHAR2(50)
	
	private int categoryNum;
	private String categoryName;
	
	public int getCategoryNum() {
		return categoryNum;
	}
	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "BoardCategoryVO [categoryNum=" + categoryNum + ", categoryName=" + categoryName + "]";
	}
	
}











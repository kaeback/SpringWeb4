package com.spring.web4.vo;

public class Board {
	private int boardnum;
	private String name;
	private String password;
	private String content;
	private String inputdate;
	
	public Board() {}

	public Board(int boardnum, String name, String password, String content, String inputdate) {
		super();
		this.boardnum = boardnum;
		this.name = name;
		this.password = password;
		this.content = content;
		this.inputdate = inputdate;
	}

	public int getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	@Override
	public String toString() {
		return "Board [boardnum=" + boardnum + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", inputdate=" + inputdate + "]";
	}
	
}

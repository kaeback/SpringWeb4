package com.spring.web4.dao;

import java.util.ArrayList;
import java.util.Map;

import com.spring.web4.vo.Board;

public interface BoardMapper {
	// 글 저장
	public int insert(Board board);
	// 전체 글 정보 검색
	public ArrayList<Board> select();
	// 번호화 비밀번호로 해당 글 삭제 (VO)
	public int delete(Board board);
	// 번호와 비밀번호로 해당 글 삭제 (Map)
	public int delete2(Map map);
	// 번호와 비밀번호로 해당 글 삭제 (여러개의 parameter)
	public int delete3(int boardnum, String password);
}

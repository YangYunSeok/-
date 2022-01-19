package com.comento.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.comento.domain.BoardVO;

@Repository
public interface BoardService {

	  public void regist(BoardVO board) throws Exception;

	  public BoardVO read(Integer bno) throws Exception;

	  public void modify(BoardVO board) throws Exception;

	  public void remove(Integer bno) throws Exception;

	  public List<BoardVO> listAll() throws Exception;

}
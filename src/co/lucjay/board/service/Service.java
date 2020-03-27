package co.lucjay.board.service;

import java.util.List;

import co.lucjay.board.dto.BoardDto;

public interface Service {

	default void defaultTest() {
		System.out.println("이것은 디폴트 지시자 메소드 테스트임");
	}

	public List<BoardDto> allselect();

	public BoardDto select(BoardDto dto);

	public int insert(BoardDto e);

	public int update(BoardDto e);

	public int delete(BoardDto e);
}

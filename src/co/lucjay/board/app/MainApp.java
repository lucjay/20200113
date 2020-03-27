package co.lucjay.board.app;

import co.lucjay.board.dto.BoardDto;
import co.lucjay.board.dto.serviceImpl.BoardServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		BoardServiceImpl board = new BoardServiceImpl();
		board.defaultTest(); // 디폴트 메소드 연습

		BoardDto dto = new BoardDto();
		dto.setBoard_id(1);
		dto = board.select(dto);
		dto.toString();
		dto = (BoardDto) board.allselect();
		dto.toString();
	}

}

package co.lucjay.board.dto.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.lucjay.board.dto.BoardDto;
import co.lucjay.board.service.DAO;
import co.lucjay.board.service.Service;

public class BoardServiceImpl extends DAO implements Service {
	private final String SELECT = "SELECT * FROM board WHERE board_id = ?";
	private final String ALL_SELECT = "SELECT * FROM board";

	@Override
	public List<BoardDto> allselect() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		BoardDto dto;
		try {
			psmt = conn.prepareStatement(ALL_SELECT);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public BoardDto select(BoardDto dto) {
		try {
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, dto.getBoard_id());
			rs = psmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDto();
				dto.setBoard_id(rs.getInt("board_id"));
				dto.setBoard_writer(rs.getString("board_writer"));
				dto.setBoard_date(rs.getDate("board_date"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_subject(rs.getString("board_subject"));
				dto.setHit(rs.getInt("hit"));

			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}

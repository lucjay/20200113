package co.lucjay.board.dto;

import java.sql.Date;

public class BoardDto {
	private int board_id;
	private String board_writer;
	private Date board_date;
	private String board_title;
	private String board_subject;
	private int hit;

	public BoardDto() {

	}

	public int getBoard_id() {
		return board_id;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public String getBoard_title() {
		return board_title;
	}

	public String getBoard_subject() {
		return board_subject;
	}

	public int getHit() {
		return hit;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		System.out.print(board_id + " : ");
		System.out.print(board_writer + " : ");
		System.out.print(board_date + " : ");
		System.out.print(board_title + " : ");
		System.out.print(board_subject + " : ");
		System.out.println(hit + " : ");
		return null;
	}

}
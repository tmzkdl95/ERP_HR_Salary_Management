package com.mycompany.vo;

public class boardVO {
	String id;
	String user_id;
	String title;
	String content;
	String write_date;
	String update_date;
	String boardnum;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getBoardnum() {
		return boardnum;
	}
	public void setBoardnum(String boardnum) {
		this.boardnum = boardnum;
	}
	
	@Override
	public String toString() {
		return "boardVO [id=" + id + ", user_id=" + user_id + ", title=" + title + ", content=" + content
				+ ", write_date=" + write_date + ", update_date=" + update_date + ", boardnum=" + boardnum + "]";
	}
}

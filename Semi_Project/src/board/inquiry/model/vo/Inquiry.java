package board.inquiry.model.vo;

import java.sql.Date;

public class Inquiry {
	private int q_no;
	private String user_id;
	private Date q_date;
	private String q_cate;
	private String question;
	private String q_yn;
	private String paint_title;
	public Inquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inquiry(int q_no, String user_id, Date q_date, String q_cate, String question, String q_yn,
			String paint_title) {
		super();
		this.q_no = q_no;
		this.user_id = user_id;
		this.q_date = q_date;
		this.q_cate = q_cate;
		this.question = question;
		this.q_yn = q_yn;
		this.paint_title = paint_title;
	}
	public int getQ_no() {
		return q_no;
	}
	public void setQ_no(int q_no) {
		this.q_no = q_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Date getQ_date() {
		return q_date;
	}
	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}
	public String getQ_cate() {
		return q_cate;
	}
	public void setQ_cate(String q_cate) {
		this.q_cate = q_cate;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQ_yn() {
		return q_yn;
	}
	public void setQ_yn(String q_yn) {
		this.q_yn = q_yn;
	}
	public String getPaint_title() {
		return paint_title;
	}
	public void setPaint_title(String paint_title) {
		this.paint_title = paint_title;
	}
	@Override
	public String toString() {
		return "Inquiry [q_no=" + q_no + ", user_id=" + user_id + ", q_date=" + q_date + ", q_cate=" + q_cate
				+ ", question=" + question + ", q_yn=" + q_yn + ", paint_title=" + paint_title + "]";
	}
	
	


	

}

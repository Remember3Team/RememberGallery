package product.model.vo;

public class masterpiece {
	
	
	private int afile_no;  //작품번
	private String user_id;	//좋아요 누른사람 아이디
	
	
	public masterpiece() {
	}
	public masterpiece(int afile_no, String user_id) {
		this.afile_no = afile_no;
		this.user_id = user_id;
	}
	public int getAfile_no() {
		return afile_no;
	}
	public void setAfile_no(int afile_no) {
		this.afile_no = afile_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "masterpiece [afile_no=" + afile_no + ", user_id=" + user_id + "]";
	}
	
	
}

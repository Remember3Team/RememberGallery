package product.model.vo;

import java.util.Date;

public class Attachment {
	private int afile_no;			//파일번호
	private int paint_no;			//파일이 등록된 상품 번호
	private String originName;		//원본 파일명
	private String changeName;		//rename된 파일명
	private String filePath;		//파일의 저장경로
	private Date uploadDate;		//파일을 올린 날짜	
	private int fileLevel;			//대표이미지(0)와 일반이미지(1)
	public Attachment() {
	}
	public Attachment(int afile_no, int paint_no, String originName, String changeName, String filePath,
			Date uploadDate, int fileLevel) {
		this.afile_no = afile_no;
		this.paint_no = paint_no;
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
		this.fileLevel = fileLevel;
	}
	public int getAfile_no() {
		return afile_no;
	}
	public void setAfile_no(int afile_no) {
		this.afile_no = afile_no;
	}
	public int getPaint_no() {
		return paint_no;
	}
	public void setPaint_no(int paint_no) {
		this.paint_no = paint_no;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public int getFileLevel() {
		return fileLevel;
	}
	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}
	@Override
	public String toString() {
		return "Attachment [afile_no=" + afile_no + ", paint_no=" + paint_no + ", originName=" + originName
				+ ", changeName=" + changeName + ", filePath=" + filePath + ", uploadDate=" + uploadDate
				+ ", fileLevel=" + fileLevel + "]";
	}
	


	
}

package mypage_user.mainOrderRefundWish.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Morw implements Serializable {

	
	private static final long serialVersionUID = -5807071061366059782L;
	

	private String orderNo;
	private String aFile;
	private String paintName;
	private int paintPrice;
	private Date orderDate;
	private String orderStatus;
	private String userId;
	private String artistName;
	private int basketNo;
	private int paintNo;
	private String message;
	
	
	public Morw() {
		super();
	}
	
	

	//메인,오더
	public Morw(String orderNo, int paintNo, String aFile, String paintName, String artistName, int paintPrice, Date orderDate, String orderStatus) {
		super();
		this.orderNo = orderNo;
		this.paintNo = paintNo;
		this.aFile = aFile;
		this.paintName = paintName;
		this.artistName = artistName;
		this.paintPrice = paintPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}


	
	//리펀
	public Morw(String orderNo, int paintNo, String aFile, String paintName, String artistName, int paintPrice, String orderStatus) {
		super();
		this.orderNo = orderNo;
		this.paintNo = paintNo;
		this.aFile = aFile;
		this.paintName = paintName;
		this.artistName = artistName;
		this.paintPrice = paintPrice;
		this.orderStatus = orderStatus;
	}
	
	
	

	//위시리스트
	public Morw(int basketNo, int paintNo, String paintName, String artistName,int paintPrice) {
		super();
		this.basketNo = basketNo;
		this.paintNo = paintNo;
		this.paintName = paintName;
		this.artistName = artistName;
		this.paintPrice = paintPrice;
	}
	
	
	

	public Morw(String orderNo, int paintNo, String userId, String message, String paintName,  String artistName) {
		super();
		this.orderNo = orderNo;
		this.paintNo = paintNo;
		this.userId = userId;
		this.message = message;
		this.paintName = paintName;
		this.artistName = artistName;
	}
	
	
	public Morw(String orderNo, int paintNo,  String message, String paintName,  String artistName) {
		super();
		this.orderNo = orderNo;
		this.paintNo = paintNo;
		this.message = message;
		this.paintName = paintName;
		this.artistName = artistName;
	}
	
	
	

	


	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public int getPaintNo() {
		return paintNo;
	}



	public void setPaintNo(int paintNo) {
		this.paintNo = paintNo;
	}



	public int getBasketNo() {
		return basketNo;
	}



	public void setBasketNo(int basketNo) {
		this.basketNo = basketNo;
	}



	public String getOrderNo() {
		return orderNo;
	}



	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}



	public String getaFile() {
		return aFile;
	}



	public void setaFile(String aFile) {
		this.aFile = aFile;
	}



	public String getPaintName() {
		return paintName;
	}



	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}



	public int getPaintPrice() {
		return paintPrice;
	}



	public void setPaintPrice(int paintPrice) {
		this.paintPrice = paintPrice;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public String getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getArtistName() {
		return artistName;
	}



	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Morw [orderNo=" + orderNo + ", aFile=" + aFile + ", paintName=" + paintName + ", paintPrice="
				+ paintPrice + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", userId=" + userId
				+ ", artistName=" + artistName + ", basketNo=" + basketNo + ", paintNo=" + paintNo + ", message="
				+ message + "]";
	}






}

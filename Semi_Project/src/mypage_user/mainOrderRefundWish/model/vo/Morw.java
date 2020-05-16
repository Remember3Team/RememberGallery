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
	
	
	
	public Morw() {
		super();
	}
	
	
	
	
	




	public Morw(String orderNo, String aFile, String paintName, int paintPrice, Date orderDate, String orderStatus) {
		super();
		this.orderNo = orderNo;
		this.aFile = aFile;
		this.paintName = paintName;
		this.paintPrice = paintPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}









	public Morw(String orderNo, String aFile, String paintName, int paintPrice, Date orderDate, String orderStatus,
			String userId) {
		super();
		this.orderNo = orderNo;
		this.aFile = aFile;
		this.paintName = paintName;
		this.paintPrice = paintPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.userId = userId;
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Morw [orderNo=" + orderNo + ", aFile=" + aFile + ", paintName=" + paintName + ", paintPrice="
				+ paintPrice + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", userId=" + userId + "]";
	}
	
	
	
	
	
	
	
	
	
	

}

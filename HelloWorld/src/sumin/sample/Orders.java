package sumin.sample;

public class Orders {
	private String userId; // Member 클래스
	private String prodName; // Product 클래스
	private int qty;
	private String orderDate;
	private String orderDest;
	private int orderPrice;

	public Orders() {

	}

	public Orders(String userId, String prodName, int qty, String orderDate, String orderDest, int orderPrice) {
		super();
		this.userId = userId;
		this.prodName = prodName;
		this.qty = qty;
		this.orderDate = orderDate;
		this.orderDest = orderDest;
		this.orderPrice = orderPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderDest() {
		return orderDest;
	}

	public void setOrderDest(String orderDest) {
		this.orderDest = orderDest;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

}

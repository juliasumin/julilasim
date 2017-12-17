package sumin.sample;

public class Products {
	private String prodName;
	private int price;
	private String category;
	private int qty;
	private String size;

	public Products() {

	}

	public Products(String prodName, int price, String category, int qty, String size) {
		super();
		this.prodName = prodName;
		this.price = price;
		this.category = category;
		this.qty = qty;
		this.size = size;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}

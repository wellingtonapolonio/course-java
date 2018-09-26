package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product product2;
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product2 = product;
		this.product2.name = "Tv";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product2;
	}

	public void setProduct(Product product2) {
		this.product2 = product2;
	}
	
	
	
	

}

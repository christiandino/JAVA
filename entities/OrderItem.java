package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private ProductPedido product; //composição com ProductPedido
	
	public OrderItem(Integer quantity, Double price, ProductPedido product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public ProductPedido getProduct() {
		return product;
	}

	public void setProductPedido(ProductPedido product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProduct().getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}

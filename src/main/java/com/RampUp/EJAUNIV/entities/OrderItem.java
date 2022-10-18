package com.RampUp.EJAUNIV.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.RampUp.EJAUNIV.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Double discount;
	private Integer quantity;
	private Double totalPrice;
	
	public OrderItem(ProductOffering product, Order order, Double discount, Integer quantity, Double totalPrice) {
		super();
		id.setProduct(product);
		id.setOrder(order);
		this.discount = discount;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder (Order order) {
		id.setOrder(order);
	}
	
	public ProductOffering getProduct() {
		return id.getProduct();
	}
	
	public void setProduct (ProductOffering product) {
		id.setProduct(product);
	}


	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	

}

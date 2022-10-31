package com.RampUp.EJAUNIV.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.RampUp.EJAUNIV.entities.enums.CustomerType;

@Entity
@Table(name = "tb_customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String customerName;
	private String documentName;
	private String customerStatus;
	private String creditScore;
	private String password;
	
	private Integer customerType;
	
	@OneToOne
	private User client;
	
	@OneToMany(mappedBy = "client")
	List<Address> addresses = new ArrayList<>();
	
	@OneToMany(mappedBy = "client")
	List<Order> orders = new ArrayList<>();
	
	
	public Customer () {
		
	}

	public Customer(Integer id, String customerName, String documentName, String customerStatus, String creditScore,
			String password, CustomerType customerType) {
		this.id = id;
		this.customerName = customerName;
		this.documentName = documentName;
		this.customerStatus = customerStatus;
		this.creditScore = creditScore;
		this.password = password;
		setCustomerType(customerType);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String custumerName) {
		this.customerName = custumerName;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public CustomerType getCustomerType() {
		return CustomerType.valueOf(customerType);
	}
	
	public void setCustomerType(CustomerType customerType) {
		if(customerType != null) {
			this.customerType = customerType.getCode();
		}
	}
	
	public List<Address> getAddress() {
		return addresses;
	}
	
	public List<Order> getOrders() {
		return orders;
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
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}

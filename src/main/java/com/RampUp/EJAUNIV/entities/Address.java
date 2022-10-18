package com.RampUp.EJAUNIV.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.RampUp.EJAUNIV.entities.enums.AddressType;



@Entity
@Table(name = "tb_address")
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private Integer houseNumber;
	private String neighborhood;
	private String complement;
	private String zipCode;
	private String country;
	
	private Integer addressType;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Customer client;

	public Address(Integer id, String street, Integer houseNumber, String neighborhood, String complement,
			String zipCode, String country, AddressType addressType, Customer client) {
		super();
		this.id = id;
		this.street = street;
		this.houseNumber = houseNumber;
		this.neighborhood = neighborhood;
		this.complement = complement;
		this.zipCode = zipCode;
		this.country = country;
		setAddressType(addressType);
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public AddressType getAddressType() {
		return AddressType.valueOf(addressType);
	}

	public void setAddressType(AddressType addressType) {
		if (addressType != null) {
			this.addressType = addressType.getCode();
		}
	}
	public Customer getClient() {
		return client;
	}

	public void setClient(Customer client) {
		this.client = client;
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
		Address other = (Address) obj;
		return Objects.equals(id, other.id);
	}


	

}

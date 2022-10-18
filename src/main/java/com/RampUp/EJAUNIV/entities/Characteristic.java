package com.RampUp.EJAUNIV.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.RampUp.EJAUNIV.entities.enums.CharacteristicType;

@Entity
@Table(name = "tb_characteristic")
public class Characteristic implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String valueType;
	
	private Integer characteristicType;
	
	@ManyToMany(mappedBy = "characteristics")
	private Set<ProductOffering> productOfferings = new HashSet<>();
	
	@OneToOne(mappedBy = "characteristic", cascade = CascadeType.ALL)
	private TimePeriod validFor;
	
	public Characteristic() {
	}

	public Characteristic(Integer id, String name, String valueType, CharacteristicType characteristicType, TimePeriod validFor) {
		super();
		this.id = id;
		this.name = name;
		this.valueType = valueType;
		setCharacteristicType(characteristicType);
		this.validFor = validFor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public CharacteristicType getCharacteristicType() {
		return CharacteristicType.valueOf(characteristicType);
	}

	public void setCharacteristicType(CharacteristicType characteristicType) {
		if (characteristicType != null) {
			this.characteristicType = characteristicType.getCode();
		}
	}
	
	public TimePeriod getValidFor() {
		return validFor;
	}
	
	public void setValidFor(TimePeriod validFor) {
		this.validFor = validFor;
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
		Characteristic other = (Characteristic) obj;
		return Objects.equals(id, other.id);
	}
}

package com.RampUp.EJAUNIV.entities.enums;

public enum CostumerType {
	LegalPerson(1),
	NaturalPerson(2),
	Technical(3);
	
	private int code;

	private CostumerType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static CostumerType valueOf(int code) {
		for (CostumerType value : CostumerType.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid costumer type code");
	}
	
}
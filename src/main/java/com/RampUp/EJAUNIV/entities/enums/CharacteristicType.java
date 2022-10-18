package com.RampUp.EJAUNIV.entities.enums;

public enum CharacteristicType {
	User(1),
	Internal(2),
	Technical(3);
	
	private int code;

	private CharacteristicType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static CharacteristicType valueOf(int code) {
		for (CharacteristicType value : CharacteristicType.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid characteristic type code");
	}
	
}


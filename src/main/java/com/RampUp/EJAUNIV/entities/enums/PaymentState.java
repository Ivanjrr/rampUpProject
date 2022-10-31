package com.RampUp.EJAUNIV.entities.enums;

public enum PaymentState {
	Paid(1),
	Pending(2),
	Denied(3);
	
	private int code;

	private PaymentState(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static PaymentState valueOf(int code) {
		for (PaymentState value : PaymentState.values()) {
			if (value.getCode() == code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid state code");
	}
	
}


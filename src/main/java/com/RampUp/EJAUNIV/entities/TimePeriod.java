package com.RampUp.EJAUNIV.entities;

import java.io.Serializable;
import java.util.Date;

public class TimePeriod implements Serializable{
	private static final long serialVersionUID = 1L;

	private Date startDateTime;
	private Date endDateTime;
	private Date retireTime;
	
	public TimePeriod() {	
	}

	public TimePeriod(Date startDateTime, Date endDateTime, Date retireTime) {
		super();
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.retireTime = retireTime;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Date getRetireTime() {
		return retireTime;
	}

	public void setRetireTime(Date retireTime) {
		this.retireTime = retireTime;
	}
	
	
	

}

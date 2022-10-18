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

import com.RampUp.EJAUNIV.entities.enums.Authorities;

@Entity
@Table(name = "tb_roles")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L; 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	private Integer authorities;
	
	public Role() {
		
	}
	
	public Role(Integer id, User user, Authorities authorities) {
		super();
		this.id = id;
		this.user = user;
		setAuthorities(authorities);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public Authorities getAuthorities() {
		return Authorities.valueOf(authorities);
	}

	public void setAuthorities(Authorities authorities) {
		if (authorities != null) {
			this.authorities = authorities.getCode();
		}
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
		Role other = (Role) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

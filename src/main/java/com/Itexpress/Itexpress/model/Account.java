package com.Itexpress.Itexpress.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;

import org.hibernate.Hibernate;

import com.Itexpress.Itexpress.model.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer  id;
	private String nameOwner;
	private String agencyCode;
	private String accountCode;
	private String verificationDigitl;
	private List <Card> list;a
	
	
	public Account(String nameOwner, String agencyCode, String accountCode, String verificationDigital,
			List<Card> list) {
		super();
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigital = verificationDigital;
		this.list = list;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountCode, agencyCode, id, list, nameOwner, verificationDigital);
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Account account = (Account) o;
        return id != null && Objects.equals(id, account.id);
    }

	
}
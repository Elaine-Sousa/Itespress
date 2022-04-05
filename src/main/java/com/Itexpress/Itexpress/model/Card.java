package com.Itexpress.Itexpress.model;

import java.util.Objects;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Card {
	private Integer  id;
	private String name;
	private String flag;
	private String typeCard;
	private Long numbre;
	private String digitalCode;
	private double limitBalance;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(digitalCode, flag, id, limitBalance, name, numbre, typeCard);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(digitalCode, other.digitalCode) && Objects.equals(flag, other.flag)
				&& Objects.equals(id, other.id)
				&& Double.doubleToLongBits(limitBalance) == Double.doubleToLongBits(other.limitBalance)
				&& Objects.equals(name, other.name) && Objects.equals(numbre, other.numbre)
				&& Objects.equals(typeCard, other.typeCard);
	}

}


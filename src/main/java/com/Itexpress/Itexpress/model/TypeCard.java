package com.Itexpress.Itexpress.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "cardtype", indexes = {
		@Index(name = "cardtype_name_index", columnList = "name", unique = true)
})
	@Entity
	public class TypeCard implements Serializable {

		private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Integer id;

	    @Column(name = "name", length = 45)
	    private String name;

	    
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TypeCard other = (TypeCard) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name);
		}

	
	    
	    

}

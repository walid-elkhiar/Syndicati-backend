package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Appartement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int credit;
	private String numero;
	private boolean paye;

}

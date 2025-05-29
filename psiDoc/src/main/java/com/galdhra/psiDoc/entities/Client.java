package com.galdhra.psiDoc.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
	
	private Long id;
	private String name;
	private Integer cpf;
	private Integer telefone;
	private LocalDate date;
	private String refNome;
	private Integer refTelefone;
	
	
	public Client() {}


	public Client(Long id, String name, Integer cpf, Integer telefone, LocalDate date, String refNome,
			Integer refTelefone) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.telefone = telefone;
		this.date = date;
		this.refNome = refNome;
		this.refTelefone = refTelefone;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getRefNome() {
		return refNome;
	}


	public void setRefNome(String refNome) {
		this.refNome = refNome;
	}


	public Integer getRefTelefone() {
		return refTelefone;
	}


	public void setRefTelefone(Integer refTelefone) {
		this.refTelefone = refTelefone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}
	
	
	

}

package com.galdhra.psiDoc.entities;

import java.time.LocalDate;

import com.galdhra.psiDoc.enums.Period;

public class Plan {
	
	private Long id;
	private Double fee;
	private Period period;
	private LocalDate start;
	private LocalDate finish;
	private String diagnose;
	
	public Plan() {}

	public Plan(Long id, Double fee, Period period, LocalDate start, LocalDate finish, String diagnose) {
		super();
		this.id = id;
		this.fee = fee;
		this.period = period;
		this.start = start;
		this.finish = finish;
		this.diagnose = diagnose;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getFinish() {
		return finish;
	}

	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	
	
	
	
	

}

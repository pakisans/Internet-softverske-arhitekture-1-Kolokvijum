package com.example.Nemanja_Nakomcic_2017270452.dto;

import java.time.LocalDateTime;

import com.example.Nemanja_Nakomcic_2017270452.model.Pretplata;

public class PretplataDTO {
	private Long id;
	private double cena;
	private LocalDateTime datumRegistracije;
	private LocalDateTime datumOdjave;

	
	public PretplataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PretplataDTO(Pretplata pretplata) {
		super();
		this.id = pretplata.getId();
		this.cena = pretplata.getCena();
		this.datumRegistracije = pretplata.getDatumRegistracije();
		this.datumOdjave = pretplata.getDatumOdjave();
	}


	public PretplataDTO(Long id, double cena, LocalDateTime datumRegistracije, LocalDateTime datumOdjave) {
	
		this.id = id;
		this.cena = cena;
		this.datumRegistracije = datumRegistracije;
		this.datumOdjave = datumOdjave;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public LocalDateTime getDatumRegistracije() {
		return datumRegistracije;
	}


	public void setDatumRegistracije(LocalDateTime datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}


	public LocalDateTime getDatumOdjave() {
		return datumOdjave;
	}


	public void setDatumOdjave(LocalDateTime datumOdjave) {
		this.datumOdjave = datumOdjave;
	}
	
	


	

}

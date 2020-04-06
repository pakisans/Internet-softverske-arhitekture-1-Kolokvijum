package com.example.Nemanja_Nakomcic_2017270452.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.Nemanja_Nakomcic_2017270452.model.Klijent;

public class KlijentDTO {
	private Long id;
	private String ime;
	private String prezime;
	private String jmbg;
	private List<PretplataDTO> pretplate = new ArrayList<>();
	public KlijentDTO() {
		super();
		
	}
	
	
	
	public KlijentDTO(Klijent klijent) {
		super();
		this.id = klijent.getId();
		this.ime = klijent.getIme();
		this.prezime = klijent.getPrezime();
		this.jmbg = klijent.getJmbg();
	}



	public KlijentDTO(Long id, String ime, String prezime, String jmbg, List<PretplataDTO> pretplate) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.pretplate = pretplate;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public String getJmbg() {
		return jmbg;
	}



	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}



	public List<PretplataDTO> getPretplate() {
		return pretplate;
	}



	public void setPretplate(List<PretplataDTO> pretplate) {
		this.pretplate = pretplate;
	}
	
	
	
	
	
	

}

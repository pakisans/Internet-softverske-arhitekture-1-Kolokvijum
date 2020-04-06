package com.example.Nemanja_Nakomcic_2017270452.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Nemanja_Nakomcic_2017270452.model.Klijent;
import com.example.Nemanja_Nakomcic_2017270452.repository.KlijentRepository;

@Service
public class KlijentService {
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	public Iterable<Klijent> findAll(){
		return klijentRepository.findAll();
	}
	public Klijent findById(Long id) {
		return klijentRepository.findById(id).orElse(null);
		
	}
	public void save(Klijent klijent) {
		klijentRepository.save(klijent);
	}
	public void delete(Long id) {
		klijentRepository.deleteById(id);
	}
	public Klijent find(String jmbg) {
		Iterable<Klijent>klijenti = klijentRepository.findAll();
		for(Klijent klijent:klijenti) {
			if(klijent.getJmbg().equals(jmbg)) {
				return klijent;
			}
		}return null;
	}

}

package com.example.Nemanja_Nakomcic_2017270452.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Nemanja_Nakomcic_2017270452.model.Pretplata;
import com.example.Nemanja_Nakomcic_2017270452.repository.PretplataRepository;

@Service
public class PretplataService {
	
	
		
	@Autowired
	private PretplataRepository pretplataRepository;
		
	public Iterable<Pretplata> findAll(){
		return pretplataRepository.findAll();
	}
	public Pretplata findById(Long id) {
		return pretplataRepository.findById(id).orElse(null);
			
	}
	public void save(Pretplata pretplata) {
		pretplataRepository.save(pretplata);
	}
	public void delete(Long id) {
		pretplataRepository.deleteById(id);
	}
	

}



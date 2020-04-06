package com.example.Nemanja_Nakomcic_2017270452.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Nemanja_Nakomcic_2017270452.dto.KlijentDTO;
import com.example.Nemanja_Nakomcic_2017270452.model.Klijent;
import com.example.Nemanja_Nakomcic_2017270452.service.KlijentService;

@Controller

@RequestMapping(path="/api/klijenti")
public class KlijentController {
	@Autowired
	private KlijentService klijentService;
	@RequestMapping(path = "",method = RequestMethod.GET)
	public ResponseEntity<List<KlijentDTO>>getAllKlijenti(){
		List<KlijentDTO> klijenti = new ArrayList<>();
		for(Klijent k:klijentService.findAll()) {
			klijenti.add(new KlijentDTO(k));
		}return new ResponseEntity<>(klijenti,HttpStatus.OK);
		
	}
	@RequestMapping(path = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<KlijentDTO>getKlijent(@PathVariable("id")Long id){
		Klijent klijent = klijentService.findById(id);
		if(klijent == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		KlijentDTO klijentDTO = new KlijentDTO(klijent);
		return new ResponseEntity<KlijentDTO>(klijentDTO,HttpStatus.OK);
	}
	@RequestMapping(path = "",method = RequestMethod.POST)
	public ResponseEntity<KlijentDTO>store(@RequestBody Klijent newKlijent){
		if(klijentService.find(newKlijent.getJmbg()) != null) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		klijentService.save(newKlijent);
		KlijentDTO klijentDTO = new KlijentDTO(newKlijent);
		return new ResponseEntity<KlijentDTO>(klijentDTO,HttpStatus.OK);
	}
	
	@RequestMapping(path ="/{id}",method = RequestMethod.PUT)
	public ResponseEntity<KlijentDTO>update(@PathVariable("id")Long id,@RequestBody Klijent uKlijent){
		Klijent klijent = klijentService.findById(id);
		if(klijent == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		klijent.setIme(uKlijent.getIme());
		klijent.setPrezime(uKlijent.getPrezime());
		klijentService.save(klijent);
		KlijentDTO klijentDTO = new KlijentDTO(klijent);
		return new ResponseEntity<KlijentDTO>(klijentDTO,HttpStatus.OK);
	}
	@RequestMapping(path ="/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<KlijentDTO>delete(@PathVariable("id")Long id){
		Klijent klijent = klijentService.findById(id);
		if(klijent == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		klijentService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

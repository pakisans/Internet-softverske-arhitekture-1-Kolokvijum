package com.example.Nemanja_Nakomcic_2017270452.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Nemanja_Nakomcic_2017270452.model.Operater;

@Repository
public interface OperaterRepository extends CrudRepository<Operater,Long> {

}

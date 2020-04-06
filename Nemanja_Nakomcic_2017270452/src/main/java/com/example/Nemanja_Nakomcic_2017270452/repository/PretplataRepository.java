package com.example.Nemanja_Nakomcic_2017270452.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Nemanja_Nakomcic_2017270452.model.Pretplata;

@Repository
public interface PretplataRepository extends CrudRepository<Pretplata,Long> {

}

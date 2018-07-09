package com.pokemon.dao;

import com.pokemon.dto.PokemonDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonRepository extends JpaRepository<PokemonDto, Long> {

    List<PokemonDto> findByName(String name);
}

package com.pokemon.service;
import com.pokemon.dto.PokemonDto;

import java.io.IOException;
import java.util.Optional;

public interface PokemonService {




    Optional<PokemonDto> getPokemonById(String id);

    PokemonDto getPokemonDto(int id) throws IOException;
    void addToDb(PokemonDto pokemonDto, Long id);

}
package com.pokemon.rest;


import com.pokemon.dao.PokemonRepository;
import com.pokemon.dto.PokemonDto;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RestController
public class PokemonRest {

    private PokemonService pokemonService;

    private PokemonRepository pokemonRepository;


    @Autowired
    public PokemonRest(PokemonService pokemonService, PokemonRepository pokemonRepository) {
        this.pokemonService = pokemonService;
        this.pokemonRepository = pokemonRepository;
    }

    @RequestMapping("/admin/pokemon")
    public PokemonDto getPokemon(@RequestParam(value = "id") int id) throws IOException {

        Optional<PokemonDto> pokemonDto1 = pokemonService.getPokemonById(String.valueOf(id));
        if (pokemonDto1.isPresent()) {

            return pokemonDto1.get();
        }else {
            PokemonDto pokemonDto= pokemonService.getPokemonDto(id);

            pokemonService.addToDb(pokemonDto, Long.valueOf(id));
            return pokemonDto;

        }
    }
        @GetMapping("/user/getAll")

        public List<PokemonDto> getPokemon () {
            return pokemonRepository.findAll();
        }

        //get ktory to wyswietli //getAllPokemons


    }
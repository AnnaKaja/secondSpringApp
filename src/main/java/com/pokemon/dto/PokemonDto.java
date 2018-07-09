package com.pokemon.dto;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PokemonDto {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String subname;
    private String weight;

    public PokemonDto() {}

    public PokemonDto(String name, String subname) {
        this.name = name;
        this.subname = subname;
    }

    public PokemonDto(Long id, String name, String subname, String weight, String speciesName) {
        this.id = id;
        this.name = name;
        this.subname = subname;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return String.format(
                "Pokemon[id=%d, name='%s', subname='%s', weight=%d]",
                id, name, subname, weight);
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }

    public String getWeight() {
        return weight;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


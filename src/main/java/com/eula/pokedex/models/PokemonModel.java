package com.eula.pokedex.models;

import jakarta.persistence.*;

@Entity
@Table(name = "POKEMON")
public class PokemonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String teratype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeratype() {
        return teratype;
    }

    public void setTeratype(String teratype) {
        this.teratype = teratype;
    }
}

package br.edu.ifpb.padroes.atv3.musicas.abcd;

import com.fasterxml.jackson.annotation.JsonAlias;


public record Musica(

        String id,
        @JsonAlias({"titulo", "title"}) String titulo,
        @JsonAlias({"artista", "artist"})  String artista,
        @JsonAlias({"ano", "year"}) Long ano,
        @JsonAlias({"genero", "genre"}) String genero
) {
}

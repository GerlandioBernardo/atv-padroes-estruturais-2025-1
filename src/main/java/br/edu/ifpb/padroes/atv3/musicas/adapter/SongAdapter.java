package br.edu.ifpb.padroes.atv3.musicas.adapter;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;

import java.util.List;
import java.util.stream.Collectors;

public class SongAdapter {
    private final Song song;

    public SongAdapter(Song song) {
        this.song = song;
    }

    public Musica adapatarParaTipoMusica(){
        return new Musica(
                song.id(),
                song.title(),
                song.artist(),
                song.year(),
                song.genre()
        );
    }
    public static List<Musica> adaptarMusicas(List<Song> songs) {
        return songs.stream()
                .map(song -> new SongAdapter(song).adapatarParaTipoMusica())
                .collect(Collectors.toList());
    }
}

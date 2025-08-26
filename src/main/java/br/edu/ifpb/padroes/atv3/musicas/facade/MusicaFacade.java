package br.edu.ifpb.padroes.atv3.musicas.facade;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.adapter.SongAdapter;
import br.edu.ifpb.padroes.atv3.musicas.decorator.Tocador;
import br.edu.ifpb.padroes.atv3.musicas.proxy.MusicaProxy;
import br.edu.ifpb.padroes.atv3.musicas.proxy.SongProxy;
import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;

import java.util.ArrayList;
import java.util.List;

public class MusicaFacade {
    private MusicaProxy musicaProxy;
    private Tocador tocador;
    private SongProxy songProxy;

    public MusicaFacade(MusicaProxy musicaProxy, Tocador tocador, SongProxy songProxy) {
        this.musicaProxy = musicaProxy;
        this.tocador = tocador;
        this.songProxy = songProxy;
    }

    public List<Musica> listarTodasMusicas(){
        List<Musica> musicas = new ArrayList<>(musicaProxy.listarMusica());
        List<Song> songs = songProxy.listarSongs();
        musicas.addAll(SongAdapter.adaptarMusicas(songs));
        return musicas;
    }
    public void tocarMusica(Musica musica){
        tocador.tocarMusica(musica);
    }
}

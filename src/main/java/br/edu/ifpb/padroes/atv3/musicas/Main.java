package br.edu.ifpb.padroes.atv3.musicas;

import br.edu.ifpb.padroes.atv3.musicas.abcd.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;
import br.edu.ifpb.padroes.atv3.musicas.decorator.*;
import br.edu.ifpb.padroes.atv3.musicas.facade.MusicaFacade;
import br.edu.ifpb.padroes.atv3.musicas.proxy.MusicaProxy;
import br.edu.ifpb.padroes.atv3.musicas.proxy.SongProxy;
import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;
import java.util.List;

public class Main {

    public  static  void main(String[] args){

        ClienteHttpABCD clienteHttpABCD = new ClienteHttpABCD();
        ClientHttpXPTO clientHttpXPTO = new ClientHttpXPTO();

        MusicaProxy musicaProxy = new MusicaProxy(clienteHttpABCD);
        SongProxy songProxy = new SongProxy(clientHttpXPTO);

        TocadorMusica tocadorMusica = new TocadorMusica();
        Tocador tocadorDecorado =
                new GeneroMaisTocadoDecorator(
                        new ArtistaMaisTocadoDecorator(
                                new QuantidadeMusicaTocadaDecorator(tocadorMusica)
                        )
                );

        MusicaFacade musicaFacede = new MusicaFacade(musicaProxy,tocadorDecorado, songProxy);
        List<Musica> musicas = musicaFacede.listarTodasMusicas();

        for (int i = 0; i < 5; i++) {
            musicaFacede.tocarMusica(musicas.get(i));
        }


    }
}

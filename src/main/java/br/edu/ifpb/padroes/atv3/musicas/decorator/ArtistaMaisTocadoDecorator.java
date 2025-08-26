package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.HashMap;
import java.util.Map;

public class ArtistaMaisTocadoDecorator extends TocadorDecorator {

    private final Map<String, Integer> contadorArtistaMaisTocado =  new HashMap<>();

    public ArtistaMaisTocadoDecorator(Tocador tocador) {
        super(tocador);
    }

    @Override
    public void tocarMusica(Musica musica){

        super.tocarMusica(musica);

        String nomeArtista = musica.artista();
        contadorArtistaMaisTocado.put(nomeArtista,
                contadorArtistaMaisTocado.getOrDefault(nomeArtista, 0) + 1);

        String artistaMaisTocado = contadorArtistaMaisTocado.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum Artista mais tocado até o momento");

        System.out.println("O Artista mais tocado até o momento foi: " + artistaMaisTocado);

    }
}

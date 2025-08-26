package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.HashMap;
import java.util.Map;

public class GeneroMaisTocadoDecorator extends TocadorDecorator {

    private final Map<String, Integer> contadorGeneroMaisTocado = new HashMap<>();

    public GeneroMaisTocadoDecorator(Tocador tocador) {
        super(tocador);
    }
    @Override
    public void tocarMusica(Musica musica){

        super.tocarMusica(musica);

        String genero = musica.genero();
        contadorGeneroMaisTocado.put(genero,
                contadorGeneroMaisTocado.getOrDefault(genero,0) + 1);

        String generoMaisTocado = contadorGeneroMaisTocado.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Nenhum Genero mais tocado até o momento");

        System.out.println("O Genero mais tocado até o momento foi: " + generoMaisTocado);
        System.out.println();
    }
}

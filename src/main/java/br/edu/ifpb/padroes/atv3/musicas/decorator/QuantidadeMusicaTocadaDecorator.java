package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

public class QuantidadeMusicaTocadaDecorator extends TocadorDecorator {
    private int quantidade = 0;

    public QuantidadeMusicaTocadaDecorator(Tocador tocador) {
        super(tocador);

    }
    public void tocarMusica(Musica musica){
        super.tocarMusica(musica);
        quantidade++;

        System.out.println("A Quantidade de Músicas tocadas até o momento foi: " + quantidade);
    }
}


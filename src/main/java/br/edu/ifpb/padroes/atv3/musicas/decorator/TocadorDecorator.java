package br.edu.ifpb.padroes.atv3.musicas.decorator;

import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

public abstract class TocadorDecorator implements Tocador {
    private Tocador tocador;

    public TocadorDecorator(Tocador tocador) {
        this.tocador = tocador;
    }

    @Override
    public void tocarMusica(Musica musica){
         tocador.tocarMusica(musica);
    }
}

package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.abcd.ClienteHttpABCD;
import br.edu.ifpb.padroes.atv3.musicas.abcd.Musica;

import java.util.List;

public class MusicaProxy {
    private  final ClienteHttpABCD clienteHttpABCD;

    private List<Musica> cache;

    public MusicaProxy(ClienteHttpABCD clienteHttpABCD) {
        this.clienteHttpABCD = clienteHttpABCD;
    }

    public List<Musica> listarMusica(){
        if (cache == null){
            cache = clienteHttpABCD.listarMusicas();
        }
        return  cache;
    }
}

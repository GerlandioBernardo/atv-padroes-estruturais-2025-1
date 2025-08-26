package br.edu.ifpb.padroes.atv3.musicas.proxy;

import br.edu.ifpb.padroes.atv3.musicas.xpto.ClientHttpXPTO;
import br.edu.ifpb.padroes.atv3.musicas.xpto.Song;

import java.util.List;

public class SongProxy {
    private  final ClientHttpXPTO clientHttpXPTO;
    private List<Song> cache;

    public SongProxy(ClientHttpXPTO clientHttpXPTO) {
        this.clientHttpXPTO = clientHttpXPTO;
    }
    public List<Song> listarSongs(){
        if (cache == null){
            cache = clientHttpXPTO.findAll();
        }
        return  cache;
    }

}

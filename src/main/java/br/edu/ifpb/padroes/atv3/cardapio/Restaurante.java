package br.edu.ifpb.padroes.atv3.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Cardapio> cardapio;

    public Restaurante() {
        this.cardapio = new ArrayList<>();
    }

    public void adicionarNoCardapio(Cardapio item){
        cardapio.add(item);
    }

    public  void exibirCardapio(){
        System.out.println("Cardápio do Restaurante");
        System.out.println();

        for (Cardapio item: cardapio){
            item.exibir(0);
        }
    }
}

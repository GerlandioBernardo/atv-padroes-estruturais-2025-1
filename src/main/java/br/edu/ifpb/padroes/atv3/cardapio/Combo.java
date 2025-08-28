package br.edu.ifpb.padroes.atv3.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Combo  implements Cardapio {

    private  String nome;
    private  double desconto;
    private List<Cardapio> itens;

    public Combo(String nome, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
        this.itens =  new ArrayList<>();
    }

    public void adicionar(Cardapio item){
        itens.add(item);
    }

    @Override
    public String descricao() {
        return nome;
    }

    @Override
    public Double preco() {
        double soma = 0;
        for (Cardapio item: itens){
            soma += item.preco();
        }

        return  soma * (1 - desconto);
    }

    @Override
    public void exibir(int nivel) {

        String indentacao = " ".repeat(nivel);
        System.out.println(indentacao + "+ "+ descricao() + " R$: " + preco());

        for (Cardapio item: itens){
            item.exibir(nivel + 1);
        }
    }
}

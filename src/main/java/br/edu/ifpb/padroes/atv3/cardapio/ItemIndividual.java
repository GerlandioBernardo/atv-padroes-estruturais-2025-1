package br.edu.ifpb.padroes.atv3.cardapio;

public class ItemIndividual implements Cardapio {

    private  String nome;
    private  double valor;

    public ItemIndividual(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return nome;
    }

    @Override
    public Double preco() {
        return valor;
    }

    @Override
    public void exibir(int nivel) {
        String indentacao = " ".repeat(nivel);
        System.out.println(indentacao + "- " + descricao() + " R$: " + preco());
    }
}

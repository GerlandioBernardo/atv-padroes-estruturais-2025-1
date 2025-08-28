package br.edu.ifpb.padroes.atv3.cardapio;

public class Main {

    public  static void  main(String[] args){

        Restaurante restaurante = new Restaurante();

        ItemIndividual hamburguer = new ItemIndividual("Hamburguer", 15.0);
        ItemIndividual batataFrita = new ItemIndividual("Batata Frita", 8.0);
        ItemIndividual refrigerante = new ItemIndividual("Refrigerante", 10.0);
        ItemIndividual sorvete = new ItemIndividual("Sorvete", 12.0);

        Combo combo1 = new Combo("Combo do Lanche", 0.1);
        combo1.adicionar(hamburguer);
        combo1.adicionar(batataFrita);
        combo1.adicionar(refrigerante);

        Combo combo2 = new Combo("Combo da Familia", 0.15);
        combo2.adicionar(combo1);
        combo2.adicionar(sorvete);

        restaurante.adicionarNoCardapio(hamburguer);
        restaurante.adicionarNoCardapio(batataFrita);
        restaurante.adicionarNoCardapio(refrigerante);
        restaurante.adicionarNoCardapio(sorvete);
        restaurante.adicionarNoCardapio(combo1);
        restaurante.adicionarNoCardapio(combo2);

        restaurante.exibirCardapio();;
    }
}

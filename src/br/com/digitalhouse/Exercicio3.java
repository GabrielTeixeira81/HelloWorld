package br.com.digitalhouse;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println(verificarImparMaiorDe10(45 ));
    }

    public static boolean verificarImparMaiorDe10(Integer a){

        return a % 2 == 1 && a > 10;
    }
}
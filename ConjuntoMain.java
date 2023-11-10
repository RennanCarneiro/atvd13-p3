package atvd13;

public class ConjuntoMain {
    public static void main(String[] args) {
        
   
    ConjuntoDePalavras conjunto = new ConjuntoDePalavras("gato, cachorro, pássaro, peixe, coelho");

    String palavras1 = "gato, cachorro, pássaro";
    String palavras2 = "gato, cachorro, elefante";

    System.out.println("O conjunto contém todas as palavras 1? " + conjunto.contemTodas(palavras1)); // Deve retornar true
    System.out.println("O conjunto contém todas as palavras 2? " + conjunto.contemTodas(palavras2)); // Deve retornar false
}
 }

package atvd13;

import java.util.ArrayList;
import java.util.List;

public class TesteCirculo {
    public static void main(String[] args) {
         List<Circulo> circulos = new ArrayList<>();

        // Criar cinco objetos Circulo com tamanhos diferentes
        Circulo circulo1 = new Circulo(2.0);
        Circulo circulo2 = new Circulo(3.5);
        Circulo circulo3 = new Circulo(1.0);
        Circulo circulo4 = new Circulo(4.2);
        Circulo circulo5 = new Circulo(2.5);

        // Adicionar os objetos Circulo à lista
        circulos.add(circulo1);
        circulos.add(circulo2);
        circulos.add(circulo3);
        circulos.add(circulo4);
        circulos.add(circulo5);

        // Percorrer a lista e imprimir a área de cada círculo
        for (int i = 0; i < circulos.size(); i++) {
            Circulo circulo = circulos.get(i);
            double area = circulo.areaCiculo(i);
            System.out.println("Área do círculo " + (i + 1) + ": " + area);
        }
    }
    }

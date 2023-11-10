package atvd13;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
    HashSet<String> cpfset = new HashSet<String>();
    Scanner m = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {
        System.out.print("Informe o CPF #" + i + ": ");
        String cpf = m.next();
        cpfset.add(cpf);
    }

    System.out.println("CPF no conjunto HashSet:");
    for (String cpf : cpfSet) {
        System.out.println(cpf);
    }
    scanner.close();
}

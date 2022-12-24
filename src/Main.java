import ChainOfResponsability.MainChainReponsability;
import Composite.MainComposite;
import Interpreter.MainInterpreter;
import Prototype.MainPrototype;
import Visitor.MainVisitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int menu() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1- Chain of Responsability");
        System.out.println("2- Composite");
        System.out.println("3- Interpreter");
        System.out.println("4- Prototype");
        System.out.println("5- Visitor");
        System.out.println("6- Sair");
        System.out.print("ESCOLHA: ");
        int opcao_escolhida = scan.nextInt();
        return opcao_escolhida;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int opcaoescolhida = menu();
        while (opcaoescolhida != 7) {
            if (opcaoescolhida == 1) {
                // Chain of Responsability
                System.out.println("Design Pattern Comportamental: \n"+
                        "Objetivo: permite que cada solicitacao passe por uma corrente de handers, que podem escolher " +
                        "processá-la ou passar ao próximo hander até que a solicitacao seja processada.");
                MainChainReponsability.main(args);

            } else if (opcaoescolhida == 2) {
                // Composite
                System.out.println("Design Pattern Estrutural. \n" +
                        "Objetivo: representar um objeto formado a partir da composicao de objetos similares");
                MainComposite.main(args);

            } else if (opcaoescolhida == 3) {
                //Interpreter
                System.out.println("Design Pattern Comportamental. \n" +
                        "Objetivo: semelhante a um tradutor, recebe instrucoes e as devolve interpretadas");
                MainInterpreter.main(args);

            } else if (opcaoescolhida == 4) {
                // Prototype
                System.out.println("Design Pattern Criacional. \n" +
                        "Objetivo: possibilita a criação de novos objetos a partir de um modelo protótipo que é clonado.");
                MainPrototype.main(args);

            } else if (opcaoescolhida == 5) {
                // Visitor
                System.out.println("Design Pattern Comportamental: \n" +
                        "Objetivo: permite separar os algoritmos dos objetos que estão os operando");
                MainVisitor.main(args);

            } else if (opcaoescolhida == 6) {
                System.out.println("Você saiu do programa! Encerrando...");
                break;

            } else {
                System.out.println("Escolha uma opcao valida");
                opcaoescolhida = menu();
            }

            opcaoescolhida = menu();
        }
    }
}
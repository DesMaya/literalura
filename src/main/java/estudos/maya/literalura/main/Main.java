package estudos.maya.literalura.main;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public void exibeMenu(){

        var opcao = 1;

        while(opcao != 0){

            System.out.println("""
           
            Escolha uma opção:
            
            1 -> Buscar livro pelo título
            2 -> Listar livros registrados
            3 -> Listar autores registrados
            4 -> Listar autores vivos em determinado ano
            5 -> Listar livros em determinado idioma
            
            0 -> sair
            """);

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("\nEncerrando o literalura!");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }

    }
}

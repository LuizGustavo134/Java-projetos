package Media_notas;
import java.util.Scanner; //entrada de dados
import java.util.Map; // Par chave-valor
import java.util.HashMap; // dicionário
public class Controle_notas {
    public static void main(String[]args){
        // Dicionário = dicionário
        // <String,int> Define os tipos do dicionario
        Map<String,Integer> pessoas = new HashMap<>();
            Scanner scan = new Scanner(System.in);
            while(true) {
                System.out.println("RH online o que deseja fazer?");
                System.out.println("(1) Registrar funcionário (2) Ver equipe (3) Sair  ");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    //Entrada de dados
                    System.out.println("Digite seu nome: ");

                    // nome
                    String nome = scan.nextLine();
                    scan.nextLine();

                    //idade
                    System.out.println("Digite sua idade: ");
                    int idade = scan.nextInt();

                    pessoas.put(nome,idade);

                    System.out.println("Cadastro realizado");
                    //resultado
                    break;
                case 2:
                    // visualiza os dados
                    for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
                        System.out.println("Nome: "+entrada.getKey() + "  idade: " + entrada.getValue());
                    }
                    // "entrada" é uma variavel temporária que recebe um valor e par-chave
                    //Metoodos de para recuperar par-chave >>getKey e getValue no Hashmap
                    //
                    break;
                case 3:
                    System.out.println("Programa finanlizado");
                    scan.close(); // deve ficar dentro do while
                    break;
                default:
                    System.out.println("opção inválida");
            }


        }

    }
}
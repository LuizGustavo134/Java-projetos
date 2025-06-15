package ListaEx;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Lista {
    public static void main(String[]args){
        ArrayList<String> equipe = new ArrayList<>(); //criando lista
        Scanner scan = new Scanner(System.in); // <<Instanciando scanner
        while (true){ // <<looping>>
        System.out.println("________________________________________________");
        System.out.println("Bem-vindo ao RH-Online");
        System.out.println("O que deseja fazer? (1)Registrar  (2)Ver equipe  (3) Sair ");
        System.out.println("________________________________________________ "); //<<menu
        int opt =scan.nextInt();
        scan.nextLine();
            if (opt == 1) { // Cadastrando >>
                System.out.println("Informe o Nome: ");
                String nome = scan.nextLine();   //nome

                System.out.println("Informe a idade: ");
                String idade = scan.nextLine();     //idade

                System.out.println("Informe o setor: ");
                String setor = scan.nextLine();

                equipe.add("Nome: "+nome+"/ Idade: "+idade+"/ Setor: "+setor); //mix
                System.out.println("cadastro realizado");
            } else if (opt ==2 ) { // ficha de registros
                for (String membro: equipe){ // usando for percorremos cada registro separado
                System.out.println(membro);}// armazenando na variavel temporaria membro
            } else if (opt==3) {
                break;
            }
        }
        }
    }

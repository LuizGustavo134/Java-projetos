package Banco1.Registrar;

import java.util.ArrayList;
import java.util.Scanner;

    public class Pessoa {
    String nome;
    String email;
    String telefone;
    ArrayList<String> Total_clientes = new ArrayList<>();
    public Pessoa(){
        nome = "";
        email = "";
        telefone = "";
    }
    public Pessoa(String nom, String ema, String tel){
       this.nome = nom;
        this.email = ema;
        this.telefone = tel;
    }
    //////////////// CADASTRAR//////////////////////////
    public void Cadastrar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um email: ");
        email = scan.nextLine();

        System.out.println("Digite um seu telefone: ");
        telefone = scan.nextLine();

        Total_clientes.add("nome: "+nome+" email: "+email+"telefone: "+telefone);
        System.out.println("Cadastrado com sucesso!");
        scan.close();

        /* isso é um for each, ele faz a formatação dos dados da lista
        sempre lembre escrever os códigos dentro das chaves se nao vai dar merda*/
        
        for ( String clientes : Total_clientes){
        System.out.println(Total_clientes);}
    }
    }
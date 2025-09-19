package Caixa;

import java.util.ArrayList;
import java.util.Scanner;

    public class Dados01 {
    String nome;
    String email;
    String telefone;
    ArrayList<String> pessoas = new ArrayList<>();
    public Dados01(){
        nome = "";
        email = "";
        telefone = "";
    }
    public Dados01(String nom, String ema, String tel){
       this.nome = nom;
        this.email = ema;
        this.telefone = tel;
    }
    //////////////// CADASTRAR//////////////////////////
    public  ArrayList Cadastrar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um email: ");
        email = scan.nextLine();

        System.out.println("Digite um seu telefone: ");
        telefone = scan.nextLine();

        pessoas.add("nome: "+nome+" email: "+email+"telefone: "+telefone);
        System.out.println("Cadastrado com sucesso!");

        /* isso é um for each, ele faz a formatação dos dados da lista
        sempre lembre escrever os códigos dentro das chaves se vai dar merda*/
        
        for ( String cliente : pessoas){
        System.out.println(cliente);}
        return Cadastrar();
    }
    }
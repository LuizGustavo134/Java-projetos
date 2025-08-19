package Loterica;

import java.util.ArrayList;
import java.util.Scanner;

//Atributos
public class Registro {
    String nome;
    String email;
    String telefone;

    //parametros () recebe os valores da proxima classe
public Registro(){
    nome = "";
    email = "";
    telefone = "";
}
public Registro(String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}
//////////////// CADASTRAR//////////////////////////
public Registro cadastrar(){
    ArrayList pessoa = new ArrayList();
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um nome: ");
    nome = scan.nextLine();
    System.out.println("Digite um email: ");
    email = scan.nextLine();
    System.out.println("Digite um seu telefone: ");
    telefone =scan.nextLine();
    pessoa.add("nome: "+nome+" "+"email: "+email+" "+telefone);
    System.out.println("Cadastrado com sucesso!");
scan.close();
    return cadastrar();
}
}
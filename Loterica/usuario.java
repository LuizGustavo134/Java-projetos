package Loterica;

import java.util.ArrayList;
import java.util.Scanner;

public class usuario {
    String nome;
    String email;
    String telefone;

public usuario(){
    nome = "";
    email = "";
    telefone = "";
}
public usuario(String nom, String eml, String ag){
nome = nom;
email = eml;
telefone = ag;
}
//////////////// CADASTRAR//////////////////////////
public ArrayList cadastrar(){
    ArrayList pessoa = new ArrayList();
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um nome: ");
    nome = scan.nextLine();
    System.out.println("Digite um email: ");
    email = scan.nextLine();
    System.out.println("Digite um seu telefone: ");
    pessoa.add("nome: "+nome+" "+"email: "+email+" "+telefone);
    System.out.println(pessoa);
    System.out.println("Cadastrado com sucesso!");
    scan.close();
    return pessoa;
}
//////////////REMOVER///////////////////
    
}
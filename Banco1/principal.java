package Banco1;

import Banco1.Registrar.Pessoa;

import java.util.Scanner;

public class principal {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo ao Fly-Bank o que você deseja fazer?");
        System.out.println("(1) Entrar  (2) Cadastrar  (3) perdi minha senha (4) Saír ");
        int opt = scan.nextInt();
        switch (opt) {
            case 1:
                Pessoa peps = new Pessoa();
                peps.Cadastrar();
                break;
            case 2:
                System.out.println("você acessou vender");
                break;
            case 3:
                System.out.println("você acessou listar");
            case 4:
                System.out.println("Sistema encerrado");
                break;
            default:
                scan.close();
        }
    }}

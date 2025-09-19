package Caixa;

public class principal {
    public static void main(String[]args){
        System.out.println("Bem-vindo ao Fly-Bank o que você deseja fazer?");
        System.out.println("(1) Entrar  (2) Cadastrar  (3) perdi minha senha (4) Saír ");
        Dados01 dado = new Dados01();
        dado.Cadastrar();
    }
}

package condicional;
import java.util.Scanner;
public class options {
    public static void main(String[]args){
        System.out.println("o que deseja fazer? ");
        System.out.println("1: comprar  2: vender  3: listar 4: sair");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("você acessou comprar");
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
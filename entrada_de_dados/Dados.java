package entrada_de_dados;
import java.util.ArrayList;
import java.util.Scanner;
public class Dados {
    public static void main(String[] args) {
        {
            ArrayList<String> usuario = new ArrayList<>();
            Scanner entrada = new Scanner(System.in);
            String nome;
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();

            System.out.println("Digite sua idade: ");
            String nota = entrada.nextLine();

            System.out.println("Dados: " + nome + ", " + nota   );
            entrada.close();
            usuario.add(nome);
            usuario.add(nota);
            System.out.println(usuario);
        }
    }
}
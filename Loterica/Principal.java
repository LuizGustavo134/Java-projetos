package Loterica;
public class Principal {
    public static void main(String[] args) {
        Registro novo_cadastro = new Registro();
       novo_cadastro.cadastrar();
       //
       usuario_BD novo_bd = new usuario_BD();
       novo_bd.total_clientes();
    }
}

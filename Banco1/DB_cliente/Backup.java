package Banco1.DB_cliente;
import Banco1.Registrar.*;
import java.util.ArrayList;

public class Backup {
    ArrayList<String> Backup_clientes = new ArrayList<>();
    public Backup(){

    }
    public Pessoa(String nom, String ema, String tel){
        this.nome = nom;
        this.email = ema;
        this.telefone = tel;
    }
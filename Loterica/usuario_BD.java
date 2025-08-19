package Loterica;

import java.util.ArrayList;
import java.util.Scanner;
//Atributos
public class usuario_BD {
    String nome;
    String email;
    String telefone;

    //parametros () recebe os valores da proxima classe
    public usuario_BD(){
        nome = "";
        email = "";
        telefone = "";
    }
    public usuario_BD(String nom, String eml, String ag){
        this.nome = nom;
        this.email = eml;
        this.telefone = ag;
    }
     // BD fixo que armazena o registro de clientes
    public ArrayList total_clientes (){
       ArrayList clientes_Atuais = new ArrayList();
       Registro reg = new Registro();
       clientes_Atuais.add(reg);
        System.out.println(clientes_Atuais);

        return clientes_Atuais;
    }
}
package Agenda;

//Classe e atributos
public class pessoa {
    String nome;
    String telefone;
    int idade;
// contrutor
public pessoa(){
    idade = 0;
    nome = "";
    telefone = "";
}
//paramêtros
public pessoa(String nom, String tel, int id){
    nome = nom;
    telefone = tel;
    idade = id;
}
public boolean testeidade(int idade)
{
 if (idade >=0)
     return true;
 else
     return false;
}
public String mostrarDados(){
    String retorno = "Nome: " + nome + "Idade: "+idade +"telefone: "+ telefone;
    return retorno;
}
}
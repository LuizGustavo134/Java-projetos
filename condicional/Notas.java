package condicional;

public class Notas {
    public static void main(String[]args){
        int nota_1 = 6;
        int nota_2 = 0;
        // variaveis que recebem as notas
        double media = nota_1 + nota_2;
        double media_final = media/2;
        
        // calculo da média
        if (media_final >= 5) {
            System.out.println("A média é: "+ media_final );
            System.out.println( "Aprovado");
            
        }else if (media_final >=3) {
            System.out.println("A média é: "+ media_final );
            System.out.println("Recuperaçao");
            } 
        else if (media_final <= 2) {
        System.out.println("A média é: "+ media_final );
        System.out.println("Reprovado");
        }{

            }
        
    }
}

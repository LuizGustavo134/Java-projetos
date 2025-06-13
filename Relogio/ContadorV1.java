// contador usando o looping while
package Relogio;
public class ContadorV1 {
    public static void main(String[] args){
        // entrada de dados
        int contador = 0;
        // ao usar while loop preste atenção no ponto e virgula
        while (contador < 20) {
            System.out.println("valor não atingido: "+contador);
            contador++;
            if (contador == 20)
                System.out.println("Valor atingido: "+contador);}
    }
}
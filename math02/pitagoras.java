package math02;

public class pitagoras {
    public static void main(String[]args){
        System.out.println("Teorema dee pitagoras");
        System.out.println("A² = B²+C² ");
        System.out.println("b²= 4 e c²=3");
        // catetos
        int b = 4;
        int c = 3;
        int b_ao_quadrado = b*b;
        int c_ao_quadrado = c*c;
        // expoentes
        int hipotenusa = b_ao_quadrado+ c_ao_quadrado;
        double raiz = Math.sqrt(hipotenusa);
        // raiz 
        //////////////////////////////////
        System.out.println(b_ao_quadrado+" + "+c_ao_quadrado);
        System.out.println(b_ao_quadrado+c_ao_quadrado);
        // visualização do calculo
        System.out.println(raiz);
        //resultado final da hipotenusa
      
    }
}

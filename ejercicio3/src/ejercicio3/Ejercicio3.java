package ejercicio3;

/**
 *
 * @author Javier Otero Sobrino
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int número = 10;
        int resultado = 5 * ++número;

        System.out.println(resultado);

        número = 10;
        resultado = número++;
        System.out.println(resultado);

        número = 10;
        resultado = --número;
        System.out.println(resultado);

        número = 10;
        resultado = 5 * número++;
        System.out.println(resultado);

        número = 10;
        resultado = número + 5;
        System.out.println(resultado);
        
        número = 10;
        resultado += 5;
        System.out.println(resultado);
        
        resultado = 12 + 8 / 4;
        System.out.println(resultado);
        
        //Cambios

    }

}

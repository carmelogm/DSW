import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10: ");
        int numero = sc.nextInt();
        sc.nextLine();

        if(numero >= 0 && numero <= 10){
            System.out.println("Introduce tu nombre: ");
            String name = sc.nextLine();

            for (int i = 0; i <= numero - 1; i++){
                System.out.println("Hola " + name);
            }

            int longitud = name.length();
            System.out.println("El numero de caractéres del nombre es: " + longitud);
        }

        else {
            System.out.println("El número esta fuera del rango permitido.");
        }



    }
}

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args){
        System.out.print("Hola Mundo");
        System.out.println("Adios");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}

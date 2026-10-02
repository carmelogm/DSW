import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cosa = "";
        double total = 0.0;

        StringBuilder sbc = new StringBuilder();

        System.out.println("Introduce un producto: ");
        cosa = sc.nextLine();

        while (!cosa.equalsIgnoreCase("fin")) {

            System.out.println("Introduce el precio de " + cosa + ": ");
            double precio = sc.nextDouble();

            sc.nextLine();

            total += precio;

            sbc.append("- ").append(cosa).append(": ").append(precio).append("€");

            System.out.println("Introduce otro producto: ");
            cosa = sc.nextLine();
        }
        System.out.println("Fin del programa. Tus productos y sus precios son: " + sbc);
        System.out.println("Coste total de la compra: " + total + "€");

        sc.close();
    }
}

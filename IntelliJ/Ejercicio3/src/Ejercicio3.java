import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota: ");

        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10){
            System.out.println("Nota incorrecta");
        }
        else if (nota < 5){
            System.out.println("Suspenso");
        }
        else if (nota < 7 ){
            System.out.println("Aprobado");
        }
        else if (nota < 9){
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
    }
}

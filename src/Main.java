import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Presiona 1 para convertir Cm a pulgadas o presiona 2 para convertir Km a millas");
        int valor = input.nextInt();


        System.out.println("Dame una medida: ");
        double medida = input.nextDouble();

        if (valor == 1) {
            medida = medida * 2.57;

        } else {

        }
        if (valor == 2) {
            medida = medida * 0.6;
        } else {


        }

        System.out.println(medida);


    }

}
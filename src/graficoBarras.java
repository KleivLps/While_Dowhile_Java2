import java.util.Scanner;

public class graficoBarras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++ ) {
            while (true) {
                System.out.println("Ingresa el número " +(i + 1) + " ( entre 1 y 20): ");
                numeros[i] = scanner.nextInt();
                if (numeros[i] >= i && numeros[i] <= 20) {
                    break;
                } else {
                    System.out.println("Número fuera de rango. Por favor, ingresa un número entre 1 y 20. ");
                }
            }
        }
        System.out.println("\nGráfico de Barras: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Número " +(i + 1) + ": ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

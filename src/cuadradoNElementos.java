import java.util.Scanner;

public class cuadradoNElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.println("Ingresa el tamaño del lado del cuadrado (N): ");
        N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("El tamaño del lado debe ser un número entero psotivo.");
        } else {
            dibujarCuadrado(N);
        }
        scanner.close();
    }
    public static void dibujarCuadrado(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

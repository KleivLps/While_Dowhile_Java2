import java.util.Scanner;

public class numerosPrimosMejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        System.out.println("Ingresa la cantidad de números primos que deseas obtener: ");
        cantidad = scanner.nextInt();

        //Validando que el valor ingresado sea positivo:
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número entero positivo.");
        } else {
            generandoNumeosPrimos(cantidad);
        }

        scanner.close();
    }

    public static void generandoNumeosPrimos(int cantidad) {
        int contador = 0;
        int numero = 2;

        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.println(numero + " ");
                contador++;
            }
            numero++;
        }
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}

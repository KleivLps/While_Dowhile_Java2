import java.util.Scanner;

public class factorialesDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeros;

        System.out.println("Ingresa un número entero: ");
        numeros = scanner.nextInt();

        int factoriales = 1 ;
        int i = 1;

        //creando bucle

        do {
            factoriales *=i;
            i++;
        } while (i <= numeros);

        System.out.println("El factorial de " +numeros+ " es " +factoriales);
        scanner.close();
    }
}
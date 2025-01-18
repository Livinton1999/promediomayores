import java.util.Scanner;

public class PromedioYmayores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        // Crear y llenar el arreglo
        int[] numeros = new int[cantidad];
        System.out.println("Ingrese los números: ");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // Imprimir los números mayores que el promedio
        imprimirMayoresQuePromedio(numeros, promedio);

        scanner.close();
    }

    // Función para calcular el promedio
    public static double calcularPromedio(int[] arreglo) {
        int suma = 0;
        for (int numero : arreglo) {
            suma += numero;
        }
        return (double) suma / arreglo.length;
    }

    // Procedimiento para imprimir los números mayores que el promedio
    public static void imprimirMayoresQuePromedio(int[] arreglo, double promedio) {
        System.out.print("Los números mayores que el promedio son: ");
        for (int numero : arreglo) {
            if (numero > promedio) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}

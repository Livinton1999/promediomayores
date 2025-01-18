
import java.util.Scanner;

public class Valormenor {
    //funcion para encontrar valor de maximo en un arreglo 
    public static int obtenerMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int num : arreglo){
            if (num > maximo){
                maximo = num; 
            }
        }
        return maximo; 

            }
            // funcion para encontrar el valor maxixo del arreglo 
            public static int obtenerMinimo(int[] arreglo) {
                int minimo = arreglo [0];
                for (int num : arreglo){
                    if(num < minimo){

                    }
                }
                return minimo; 
            }
            // proyeccion para mostar el vaor maximo y minimos 
            public static void mostrarResultados(int[] arreglo) {
                int maximo = obtenerMaximo(arreglo);
                int minimo = obtenerMinimo(arreglo);

                int pares = 0, impares =0; 
                for (int num : arreglo){
                if (num % 2 == 0){
                    pares++; 
                    } else {
                        impares++;

                    }
                }
                System.out.println("El valor maximo es: " + maximo);
                System.out.println("El valor minimo es: " + minimo);
                System.out.println ("El arreglo contiene: ");
                System.out.println("-" + pares + "numeros pares");
                System.out.println("-" + impares + " números impares");

            }
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                // solicitar la cantiadad de numeros
                System.out.print("Ingresar la cantidad de numeros: ");
                int cantidad = scanner.nextInt();
                
                // crear el arreglo  de los ingreso de numeros 
                int[] numeros = new int [cantidad];
                System.out.println("Ingresar los numeros: ");
                for(int i = 0; i< cantidad; i++){
                    numeros[i] = scanner.nextInt();

                }
                //procedimientos para mostar los resultados 
                
                mostrarResultados(numeros); 
                scanner.close();

            
        }
    }

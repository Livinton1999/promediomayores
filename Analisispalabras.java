import java.util.Scanner;

public class Analisispalabras {
    

// FUNCION DE CALCULAR LA LONGITUD PROMEDIO DE LAS PALABRA

public static double calcularLongitudPromedio(String[] palabras){
    int sumaLongitudes =0;
    for(String palabra : palabras) {
        sumaLongitudes += palabra.length();
    }
    return (double) sumaLongitudes / palabras.length;

    }

    // funcion que retorna la palabra mas larga del arreglo 
    public static String obtenerPalabraMasLarga(String[] palabras) {
        String palabraMasLarga ="";
        for(String palabra : palabras){
            if (palabra.length() > palabraMasLarga.length()){
                palabraMasLarga = palabra;

            }
        }
        return palabraMasLarga;
    }
    // procedimiento para imprimir los resultados
    public static void imprimirResultados(double longitudPromedio, String palabraMasLarga){
        System.out.printf("La longitud promedio de las palabras es: %.1f%n", longitudPromedio);
        System.out.println("la palabra mas larga es:  " + palabraMasLarga);
    }

    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);

        // solicitar la cantidad de palabras
        System.out.print("Ingrese la cantidad de la palabras: ");
        int cantidad =scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        // crear el arreglo y llenarlo con las palabra ingresadas por el usuario
        String[] palabras = new String[cantidad]; 
        System.out.println("ingrese las palabras: ");
        for(int i =0; i < cantidad; i++){
            palabras[i] = scanner.nextLine();

        }
        //Calcular la longitud promedio y la palabra mas largo
        double longitudPromedio = calcularLongitudPromedio(palabras);
        String palabraMasLarga = obtenerPalabraMasLarga(palabras);
        // Imprimir los resultados
        imprimirResultados(longitudPromedio, palabraMasLarga);

        scanner.close();
    }
}

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        OrdenamientoBurbujaAvanzado ordenar = new OrdenamientoBurbujaAvanzado();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo; ");
        int tamanio = 0;

        do{
            System.out.println("Ingrese el tamaño con un entero positivo");
            while(!scanner.hasNextInt()){
                System.out.println("Le pedí un entero válido");
                scanner.next();
            }
            tamanio = scanner.nextInt();
            if(tamanio <= 0){
                System.out.println("El tamaño debe ser entero positivo");

            }
        } while(tamanio <= 0);
        int[] arreglo = new int[tamanio];

        System.out.println("Ingrese los valores del arreglo: ");

        for(int i = 0; i < tamanio; i++){
            System.out.println("Ingrese los valores en la posición: " + i);
            int numero = scanner.nextInt();
            arreglo[i] = numero;
        }
        System.out.print("[");
        for(int j = 0; j< tamanio; j++){
            System.out.print(" " + arreglo[j]);
        }
        System.out.print(" ]");
        
        
        scanner.close();
    }
}

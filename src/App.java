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

        scanner.close();
    }
}

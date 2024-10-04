import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int tamanio = leerEnteroValido(scanner, "Ingrese el tamaño del arreglo: ", false);
        //Crear arreglo
        int[] arreglo = new int[tamanio];

        for(int i = 0; i < tamanio; i++){
            //Validar cada elemento del arreglo
            arreglo[i] = leerEnteroValido(scanner, "Elemento" + (i + 1) + ":", true);
        }
        for(int i : arreglo){
            System.out.print(i);
        }
        scanner.close();
    }
    public static int leerEnteroValido(Scanner scanner, String mensaje, boolean numerosNegativos){

        int numero;
        do{
            System.out.println(mensaje);
            while(!scanner.hasNextInt()){
                System.out.println("Le pedí un entero válido");
                System.out.println(mensaje);
                scanner.next();
            }
            numero = scanner.nextInt();
            if(numerosNegativos && numero < 0){
                System.out.println("No se permiten numeros negativos");

            }
        } while(numerosNegativos && numero < 0);
        return numero;
    }    
}

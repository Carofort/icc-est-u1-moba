public class App {
    public static void main(String[] args) throws Exception {
        OrdenamientoBurbujaAvanzado ordenar = new OrdenamientoBurbujaAvanzado();
        int [] arreglo = {5, 8, 9, 0, 2};
        int[] arregloBubble = ordenar.sortBubbleAvanzado(arreglo);
        ordenar.printBubbleAvanzado(arregloBubble);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        OrdenamientoBurbujaAvanzado ordenar = new OrdenamientoBurbujaAvanzado();
        int[] arreglo = {0, 2, 4, 6, 8};
        int[] arregloBubble = ordenar.sortBubbleAvanzado(arreglo);
        ordenar.printBubbleAvanzado(arregloBubble);
    }
}

package clases;

public class Ordenamiento {

    public int[] numeros = {50, 20, 40, 80, 30};

    public void imprimir() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo posicion " + i + " valor " + numeros[i]);
        }
    }

    public void seleccion() {
        int i, j;
        int indiceMenor;

        for (i = 0; i < numeros.length - 1; i++) {

            indiceMenor = i;

            for (j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[indiceMenor]) {

                    indiceMenor = j;

                }

            }

            if (i != indiceMenor) {
                int aux = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = aux;
            }

        }
    }

    public void burbuja() {
        int pasada, i;

        for (pasada = 0; pasada < numeros.length - 1; pasada++) {

            for (i = 0; i < numeros.length - 1 - pasada; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                }

            }

        }
    }

    /**
     * El algoritmo correspondiente a la ordenaci�n por inserci�n contempla los siguientes pasos:
     * 1. El primer elemento A[0] se considera ordenado; es decir, la lista inicial consta de un elemento.
     * <p>
     * 2. Se inserta A[1] en la posici�n correcta, delante o detr�s de A[0], dependiendo de que sea menor o mayor.
     * <p>
     * 3. Por cada bucle o iteraci�n i (desde i=1 hasta n-1) se explora la sublista A[i-1] . .A[0]
     * buscando la posici�n correcta de inserci�n; a la vez se mueve hacia abajo (a la derecha en la sublista)
     * una posici�n todos los elementos mayores que el elemento a insertar A[i], para dejar vac�a esa posici�n.
     * <p>
     * 4. Insertar el elemento a la posici�n correcta.
     */
    public void insercion() {

        for (int i = 1; i < numeros.length; i++) {
            int indiceMenor = i;
            for (int j = i -1; j >= 0; j--) {
                if (numeros[j] > numeros[i]) {
                    indiceMenor = j;
                }else
                    break;
            }

            if (i != indiceMenor) {
                if (i-indiceMenor > 1){
                    int aux = numeros[i];
                    for (int k = i; k > indiceMenor; k--){
                        numeros[k] = numeros[k-1];
                    }
                    numeros[indiceMenor] = aux;
                }else {
                    int aux = numeros[i];
                    numeros[i] = numeros[indiceMenor];
                    numeros[indiceMenor] = aux;
                }
            }

        }

    }

    public static void main(String[] args) {

        Ordenamiento ord = new Ordenamiento();

        ord.imprimir();
        System.out.println();

        ord.insercion();
        System.out.println();

        ord.imprimir();

    }
}
